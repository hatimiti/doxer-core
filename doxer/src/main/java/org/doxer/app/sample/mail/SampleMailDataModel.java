package org.doxer.app.sample.mail;

import lombok.Data;

import org.doxer.xbase.mail.MailSendConfigurable;
import org.doxer.xbase.mail.MailSendDataModel;

@Data
public class SampleMailDataModel implements MailSendDataModel {

	private String name;

	@Override
	public MailSendConfigurable getConfiguration() {
		return new MailSendConfigurable() {
			@Override
			public String getSubject() {
				return "メール送信テスト" + name;
			}

			@Override
			public String getTemplatePath() {
				return "/sample/sendmail/sample.ftl";
			}

			@Override
			public String[] getTo() {
				return new String[] { "info@localhost" };
			}
		};
	}
}
