package org.doxer.xbase.mail;

public interface MailSendConfigurable {

	/** メール件名 */
	String getSubject();

	/** Freemarkerメールテンプレートパス */
	String getTemplatePath();

	/** To: メールアドレス */
	String[] getTo();

	/** Cc: メールアドレス */
	default String[] getCc() { return new String[] {}; }

	/** Bcc: メールアドレス */
	default String[] getBcc() { return new String[] {}; }

}
