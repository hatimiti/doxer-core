package org.doxer.xbase.form;

import static org.springframework.context.annotation.ScopedProxyMode.*;
import static org.springframework.web.context.WebApplicationContext.*;

import java.io.Serializable;
import java.util.Locale;

import lombok.Data;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.hatimiti.doxer.common.util._Obj;
import com.github.hatimiti.doxer.common.util._Str;

/**
 * ログインユーザに関する情報を保持する。
 * @author hatimiti
 *
 */
@Data
@Component
@Scope(value = SCOPE_SESSION, proxyMode = TARGET_CLASS)
public class AccessUser implements Serializable {

	private static final long serialVersionUID = 1L;

	/** ユーザID */
	private String id = "NONE";

	/** ユーザ名(名) */
	private String firstName;

	/** ユーザ名(姓) */
	private String lastName;

	/** IPアドレス */
	private String ipAddress;

	/** UserAgent */
	private String userAgent;

	/** ログイン済であれば true */
	private boolean isLogged;

	/** 権限ロールID */
	private Integer authroleId;

	/** アクセス元ロケール */
	private Locale locale;

	/** 表示言語 */
	private String langCd;

	/** 初期化済 */
	private boolean isInitialized;

	public void invalidate() {
		_Obj.copy(new AccessUser(), this);
	}

	public String getId() {
		return _Str.asStrOrEmpty(this.id);
	}

	public String getName() {
		return Locale.JAPAN.equals(locale)
				? String.format("%s %s", getLastName(), getFirstName())
				: String.format("%s %s", getFirstName(), getLastName());
	}

}
