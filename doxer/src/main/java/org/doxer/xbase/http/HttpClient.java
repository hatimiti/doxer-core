package org.doxer.xbase.http;

import static com.github.hatimiti.flutist.common.util.CharacterEncoding.*;
import static java.lang.String.*;
import static java.net.URLEncoder.*;
import static java.util.stream.Collectors.*;
import static org.apache.http.client.fluent.Request.*;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;

import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.apache.http.entity.StringEntity;
import org.slf4j.Logger;

import com.github.hatimiti.flutist.common.util._Obj;

public abstract class HttpClient {

	private static final String EQ = "=";

	private static Logger LOG = _Obj.getLogger();

	private String url;
	private List<Pair<String, String>> params;
	private Charset requestCharset;

	protected HttpClient(String url) {
		this.url = url;
		this.params = new ArrayList<>();
		this.requestCharset = Charset.forName(UTF8.toString());
	}

	public Response doGet() {
		final String reqUrl = this.url + buildQuery();
		try {
			LOG.info("RequestURL : " + reqUrl);
			return Request.Get(reqUrl).execute();
		} catch (IOException e) {
			LOG.error(format("Get Request %s", reqUrl), e);
			throw new RuntimeException(e);
		}
	}

	public Response doPost() {
		try {
			return Post(this.url)
				.body(new StringEntity(buildQuery(), requestCharset.name()))
				.execute();
		} catch (IOException e) {
			LOG.error(format("Post Request %s", this.url), e);
			throw new RuntimeException(e);
		}
	}

	protected String buildQuery() {
		StringBuilder query = new StringBuilder();
		params.forEach(p -> {
			if (query.length() != 0) {
				query.append("&amp;");
			}
			try {
				query
					.append(encode(p.getKey(), requestCharset.name()))
					.append(EQ)
					.append(encode(p.getValue(), requestCharset.name()))
				;
			} catch (Exception e) {
				LOG.error(format("Query on error = %s", query), e);
				throw new RuntimeException(e);
			}
		});
		return "?" + query;
	}

	protected void addQuery(String key, String value) {
		if (key == null || value == null) {
			return;
		}
		params.add(new Pair<String, String>(key, value));
	}

	protected void addQuery(String key, Object value) {
		addQuery(key, value == null ? null : value.toString());
	}

	protected void addQuery(String key, List<?> values) {
		if (values == null) {
			return;
		}
		addQuery(key, values.stream()
			.map(it -> it.toString()).collect(joining(",")));
	}

}
