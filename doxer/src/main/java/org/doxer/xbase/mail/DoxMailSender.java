package org.doxer.xbase.mail;

import static com.github.hatimiti.doxer.common.util.CharacterEncoding.*;
import static javax.mail.internet.InternetAddress.*;
import static org.doxer.xbase.util._Container.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import javax.mail.Message.RecipientType;
import javax.mail.Multipart;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.doxer.xbase.util._Env;
import org.slf4j.Logger;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.github.hatimiti.doxer.common.util._Obj;

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
//			LOG.error(AppExceptionResolver.exceptionToString(e));
			new RuntimeException(e);
		}
	}

	public void send() {
		try {
			this.send(message);
		} catch (MailException e) {
//			LOG.error(AppExceptionResolver.exceptionToString(e));
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

		MailSendConfigurable config = model.getConfiguration();
		MimeMessage mime = this.createMimeMessage();
		mime.setRecipients(RecipientType.TO, parse(String.join(",", config.getTo())));
		mime.setRecipients(RecipientType.CC, parse(String.join(",", config.getCc())));
		mime.setRecipients(RecipientType.BCC, parse(String.join(",", config.getBcc())));
		mime.setFrom(new InternetAddress(config.getFrom()));
		mime.setSubject(config.getSubject(), getEncodingInLocale(config.getLocale()));

		if (config.isHTML()) {
			mime.setContent(createMimeMultipart(model));
		} else {
			mime.setText(specifyCharUnicodeToJIS(getContent(model, false)),
					getEncodingInLocale(config.getLocale()));
		}

		return mime;
	}

	private Multipart createMimeMultipart(MailSendDataModel model) throws Exception {
		Multipart multipart = new MimeMultipart("alternative");

		MimeBodyPart textPart = new MimeBodyPart();
		textPart.setText(specifyCharUnicodeToJIS(getContent(model, false)),
				getEncodingInLocale(model.getConfiguration().getLocale()));

		MimeBodyPart htmlPart = new MimeBodyPart();
		htmlPart.setText(specifyCharUnicodeToJIS(getContent(model, true)),
				getEncodingInLocale(model.getConfiguration().getLocale()), "html");

		multipart.addBodyPart(textPart);
		multipart.addBodyPart(htmlPart);

		return multipart;
	}

	private String getContent(
			MailSendDataModel model,
			boolean isHTML) throws Exception {

		Configuration cfg = createFreemarkerConfiguration();
		LOG.debug("freemarker.template.Configuration: " + toConfigurationString(cfg));

		Template t = cfg.getTemplate(isHTML ?
				model.getConfiguration().getHtmlTemplatePath() :
				model.getConfiguration().getTemplatePath());
		LOG.debug("freemarker.template.Template: " + t);

		Map<String, Object> rootMap = new HashMap<>();
		rootMap.put("data", model);
		try (Writer out = new StringWriter()) {
			t.process(rootMap, out);
			return out.toString();
		}
	}

	private String specifyCharUnicodeToJIS(String content) {
		// ISO-2022-JPで送信する際に、freemarkerテンプレート内の一部文字の文字化け対策
		return content
				.replaceAll("\uFF5E", "\u301C") // 全角チルダ→波ダッシュ～
				.replaceAll("\uFF0D", "\u2212") // 全角マイナス→ハイフン−
				.replaceAll("\u2015", "\u2014") // ―
		;
	}

	private String getEncodingInLocale(Locale locale) {
		String lang = locale.getLanguage();
		return prop("mail.encoding." + lang);
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
