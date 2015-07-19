package org.doxer.app.event.http.connpass;

import org.doxer.xbase.http.HttpClient;

public class ConnpassAPIClient extends HttpClient {

	public static final String URL = "http://connpass.com/api/v1/event/";

	private ConnpassAPIClient() {
		super(URL);
	}

	public static ConnpassAPIClient request() {
		return request(null);
	}

	public static ConnpassAPIClient request(ConnpassRequestQuery q) {
		ConnpassAPIClient c = new ConnpassAPIClient();
		c.setQuery((q == null) ? new ConnpassRequestQuery() : q);
		return c;
	}

	protected void setQuery(ConnpassRequestQuery query) {
		addQuery("event_id", query.getEventIds());
		addQuery("keyword", query.getKeywordANDs());
		addQuery("keyword_or", query.getKeywords());
		addQuery("ym", query.getYms());
		addQuery("ymd", query.getYmds());
		addQuery("nickname", query.getNicknames());
		addQuery("owner_nickname", query.getOwnerNicknames());
		addQuery("series_id", query.getSeriesIds());
		addQuery("start", query.getStart());
		addQuery("order", query.getOrder());
		addQuery("count", query.getCount());
		addQuery("format", query.getFormat());
	}

//	public static void main(String[] args) throws ClientProtocolException, IOException {
//		ConnpassRequestQuery q = new ConnpassRequestQuery();
//		q.setKeywordANDs(asList("java", "scala", "関西"));
//		q.setYmds(asList(20141122, 20140920));
//		Response res = request(q).doGet();
//
//		ConnpassResponse cres = JSON.decode(res.returnContent().asString(), ConnpassResponse.class);
//
//		System.out.println(cres.toString());
//	}

}
