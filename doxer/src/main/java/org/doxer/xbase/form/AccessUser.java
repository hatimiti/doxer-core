package org.doxer.xbase.form;

import static org.springframework.context.annotation.ScopedProxyMode.*;
import static org.springframework.web.context.WebApplicationContext.*;

import java.io.Serializable;

import lombok.Data;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.util._Num;
import com.github.hatimiti.flutist.common.util._Obj;
import com.github.hatimiti.flutist.common.util._Str;

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
	protected String id = "NONE";

	/** ユーザ名(姓) */
	protected String nameSei;

	/** ユーザ名(名) */
	protected String nameMei;

	/** ログイン済であれば true */
	protected boolean isLogged;

	/** 権限ロールID */
	protected Integer authroleId;

	/** 言語コード */
	protected String langCd;

	public void invalidate() {
		_Obj.copy(new AccessUser(), this);
	}
	
	public String getId() {
		return _Str.toEmptyIfEmpty(String.valueOf(this.id));
	}

	public Long getIdL() {
		return _Num.toL_Null(getId());
	}

	public String getName() {
		return getNameSei() + "　" + getNameMei();
	}

}
