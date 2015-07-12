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

import org.doxer.xbase.util._Env;
import org.slf4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.github.hatimiti.flutist.common.util._Num;
import com.github.hatimiti.flutist.common.util._Obj;

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
			new RuntimeException(e);
		}
	}

	public void send() {
		try {
			this.send(message);
		} catch (MailException e) {
			LOG.error(e.getMessage());
			throw new RuntimeException(e);
		}
	}

	private void init() {
		setHost(buildMessage("mail.host"));
		setPort(_Num.toI_Null(buildMessage("mail.port")));
		setUsername(buildMessage("mail.username"));
		setPassword(buildMessage("mail.password"));

		Properties prop = new Properties();
		prop.setProperty("mail.transport.protocol", buildMessage("mail.transport.protocol"));
		prop.setProperty("mail.smtp.auth", buildMessage("mail.smtp.auth"));
		prop.setProperty("mail.smtp.starttls.enable", buildMessage("mail.smtp.starttls.enable"));
		setJavaMailProperties(prop);
	}

	private MimeMessage createMime(MailSendDataModel model) throws Exception {

		MailSendConfigurable config = model.getConfiguration();

		MimeMessage mime = this.createMimeMessage();
		mime.setRecipients(RecipientType.TO, parse(String.join(",", config.getTo())));
		mime.setRecipients(RecipientType.CC, parse(String.join(",", config.getCc())));
		mime.setRecipients(RecipientType.BCC, parse(String.join(",", config.getBcc())));
		mime.setFrom(new InternetAddress("mail@localhost"));//TODO mail from
		mime.setSubject(config.getSubject());

		Configuration cfg = createFreemarkerConfiguration();

		Template t = cfg.getTemplate(config.getTemplatePath());
		Map<String, Object> rootMap = new HashMap<>();
		rootMap.put("data", model);
		try (Writer out = new StringWriter()) {
			t.process(rootMap, out);
			mime.setText(out.toString());
		}
		return mime;
	}

	private Configuration createFreemarkerConfiguration() throws IOException {
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
		cfg.setDirectoryForTemplateLoading(new ClassPathResource("/mail").getFile());
		cfg.setDefaultEncoding(UTF8.toString());
		cfg.setTemplateExceptionHandler(_Env.isDev()
				? TemplateExceptionHandler.HTML_DEBUG_HANDLER
				: TemplateExceptionHandler.RETHROW_HANDLER);
		return cfg;
	}

}
