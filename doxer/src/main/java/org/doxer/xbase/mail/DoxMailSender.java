package org.doxer.xbase.mail;

import static com.github.hatimiti.flutist.common.util.CharacterEncoding.*;
import static javax.mail.internet.InternetAddress.*;
import static org.doxer.xbase.util._Container.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.doxer.app.base.exception.AppExceptionResolver;
import org.doxer.xbase.util._Env;
import org.slf4j.Logger;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.github.hatimiti.flutist.common.util._Num;
import com.github.hatimiti.flutist.common.util._Obj;

import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public class DoxMailSender extends JavaMailSenderImpl {

	private static final Logger LOG = _Obj.getLogger();

	private MimeMessage message;

	public DoxMailSender(MailSendDataModel model) {
		Objects.requireNonNull(model);
		init();
		try {
			this.message = createMime(model);
		} catch (Exception e) {
			LOG.error(AppExceptionResolver.exceptionToString(e));
			new RuntimeException(e);
		}
	}

	public void send() {
		try {
			this.send(message);
		} catch (MailException e) {
			LOG.error(AppExceptionResolver.exceptionToString(e));
			throw new RuntimeException(e);
		}
	}

	private void init() {
		setHost(prop("mail.host"));
		setPort(propAsInt("mail.port"));
		setUsername(prop("mail.username"));
		setPassword(prop("mail.password"));

		Properties prop = new Properties();
		prop.setProperty("mail.transport.protocol", prop("mail.transport.protocol"));
		prop.setProperty("mail.smtp.auth", prop("mail.smtp.auth"));
		prop.setProperty("mail.smtp.starttls.enable", prop("mail.smtp.starttls.enable"));
		setJavaMailProperties(prop);
	}

	private MimeMessage createMime(MailSendDataModel model) throws Exception {

		LOG.debug("org.doxer.xbase.mail.MailSendDataModel: " + model);

		MailSendConfigurable config = model.getConfiguration();

		MimeMessage mime = this.createMimeMessage();
		mime.setRecipients(RecipientType.TO, parse(String.join(",", config.getTo())));
		mime.setRecipients(RecipientType.CC, parse(String.join(",", config.getCc())));
		mime.setRecipients(RecipientType.BCC, parse(String.join(",", config.getBcc())));
		mime.setFrom(new InternetAddress("mail@localhost"));//TODO mail from
		mime.setSubject(config.getSubject(), prop("mail.encoding.ja"));

		Configuration cfg = createFreemarkerConfiguration();
		LOG.debug("freemarker.template.Configuration: " + toConfigurationString(cfg));

		Template t = cfg.getTemplate(config.getTemplatePath());
		LOG.debug("freemarker.template.Template: " + t);

		Map<String, Object> rootMap = new HashMap<>();
		rootMap.put("data", model);
		try (Writer out = new StringWriter()) {
			t.process(rootMap, out);
			mime.setText(specifyCharUnicodeToJIS(out.toString()), prop("mail.encoding.ja"));
		}
		return mime;
	}

	private String specifyCharUnicodeToJIS(String content) {
		// ISO-2022-JPで送信する際に、freemarkerテンプレート内の一部文字の文字化け対策
		return content
				.replaceAll("\uFF5E", "\u301C") // 全角チルダ→波ダッシュ～
				.replaceAll("\uFF0D", "\u2212") // 全角マイナス→ハイフン−
				.replaceAll("\u2015", "\u2014") // ―
		;
	}

	private String toConfigurationString(Configuration cfg) {
		final String LF = System.lineSeparator();
		return new StringBuilder()
			.append("OutputEncoding: ").append(cfg.getOutputEncoding()).append(LF)
			.append("TemplateLoader: ").append(cfg.getTemplateLoader()).append(LF)
			.toString();
	}

	private Configuration createFreemarkerConfiguration() throws IOException {
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
		cfg.setTemplateLoader(new ClassTemplateLoader(getClass(), "/templates/mail"));
		cfg.setDefaultEncoding(UTF8.toString());
		cfg.setTemplateExceptionHandler(_Env.isDev()
				? TemplateExceptionHandler.HTML_DEBUG_HANDLER
				: TemplateExceptionHandler.RETHROW_HANDLER);
		return cfg;
	}

}
