package org.doxer.xbase.mail;

import java.util.Locale;

public interface MailSendConfigurable {

	/** メール件名 */
	String getSubject();

	/** メールテンプレートファイルのパスを取得する． */
	String getTemplatePath();

	/** From: メールアドレス */
	String getFrom();

	/** To: メールアドレス */
	String[] getTo();

	/** メール宛先ロケール */
	Locale getLocale();

	/** Cc: メールアドレス */
	default String[] getCc() { return new String[] {}; }

	/** Bcc: メールアドレス */
	default String[] getBcc() { return new String[] {}; }

	/** HTMLメールで送信するかどうかを指定する．true の場合はHTMLで送信する．*/
	default boolean isHTML() { return false; }

	/**
	 * HTMLメール用のメールテンプレートファイルのパスを取得する．<br />
	 * プレーンメッセージのテンプレートファイルに対して、拡張子の前に[_html]を付加したもの．
	 * @return HTMLメールテンプレートファイルパス
	 */
	default String getHtmlTemplatePath() {
		String path = getTemplatePath();
		if (!isHTML()) {
			return path;
		}
		int ei = path.lastIndexOf(".");
		return path.substring(0, ei)
				+ "_html"
				+ path.substring(ei, path.length());
	}

}
