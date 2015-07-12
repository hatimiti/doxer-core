package org.doxer.app.sample.mail;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.doxer.xbase.mail.MailSendConfigurable;
import org.doxer.xbase.mail.MailSendDataModel;

@Data
public class SampleMailDataModel implements MailSendDataModel {

	private String name;
	private Integer age;
	private NestedModel nullval;

	private List<NestedModel> nestedModels = new ArrayList<>();

	public boolean addNestedModel(NestedModel n) {
		return this.nestedModels.add(n);
	}

	@Data
	@AllArgsConstructor
	public static class NestedModel {
		private String value;
	}

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
