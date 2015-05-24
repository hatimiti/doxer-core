package org.doxer.xbase.util;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.doxer.xbase.form.AccessUser;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.github.hatimiti.flutist.common.message.AppMessages;
import com.github.hatimiti.flutist.common.util._Date;
import com.github.hatimiti.flutist.common.util._Str;

/**
 * jsp/servlet コンテナを起動している時に使用可能なユーティリティクラス．
 * @author hatimiti
 *
 */
public final class _Container {

	public static final String TRANSITION_REDIRECT_PREFIX = "redirect:";
	public static final String TRANSITION_FORWARD_PREFIX = "forward:";
	
	public static final String MODEL_AND_VIEW_VALIDATION_KEY = "__DOX_MODEL_AND_VIEW_VALIDATION_KEY__";
	
	/*
	 * private コンストラクタ
	 */
	private _Container() { }
	
	public static String getRedirectPath(String path) {
		return TRANSITION_REDIRECT_PREFIX + path;
	}
	
	public static String getForwardPath(String path) {
		return TRANSITION_FORWARD_PREFIX + path;
	}

	/** アクセス時間保持(Web側で使用される日時) */
	private static final ThreadLocal<Date> ACCESS_DATE = new ThreadLocal<Date>() {
		@Override
		protected Date initialValue() {
			return new Date();
		};
	};

	/**
	 * アクセス時間を取得
	 */
	public static Date getAccessDate() {
		Date accessTime = ACCESS_DATE.get();
		if (accessTime == null) {
			return new Date();
		}
		return accessTime;
	}

	/**
	 * アクセス時間を取得(Timestamp)
	 */
	public static Timestamp getAccessTimestamp() {
		return new Timestamp(getAccessDate().getTime());
	}

	/**
	 * アクセス時間を yyyymmdd の形式で取得
	 */
	public static String getAccessYyyyMmDd() {
		try {
			return _Date.formatYyyyMmDd(getAccessDate());
		} catch (Exception e) {
			return _Str.EMPTY;
		}
	}

	/**
	 * アクセス時間を yyyymm の形式で取得
	 */
	public static String getAccessYyyyMm() {
		try {
			return _Date.formatYyyyMm(getAccessDate());
		} catch (Exception e) {
			return _Str.EMPTY;
		}
	}

	/**
	 * アクセス時間を YyyyMmDdHhMiSs の形式で取得
	 */
	public static String getAccessYyyyMmDdHhMiss() {
		try {
			return _Date.formatYyyyMmDdHhMiSs(getAccessDate());
		} catch (Exception e) {
			return _Str.EMPTY;
		}
	}

	/**
	 * アクセス時間を設定<br>
	 * filter が呼び出すため、実装者が呼び出す必要はない．
	 */
	public static void setAccessDate() {
		ACCESS_DATE.set(new Date());
	}

	/**
	 * アクセス時間を削除<br>
	 * filter が呼び出すため、実装者が呼び出す必要はない．
	 */
	public static void resetAccessDate() {
		ACCESS_DATE.remove();
	}

	/**
	 * アプリケーションルートパスを取得する．
	 * @return アプリケーションルートフォルダパス
	 */
//	public static final String getRootPath() {
//		return getServletContext().getRealPath("/");
//	}

	public static ServletContext getServletContext() {
		return getHttpServletRequest().getServletContext();
	}
	
	public static WebApplicationContext getWebApplicationContext() {
		return WebApplicationContextUtils.getWebApplicationContext(getServletContext());
	}
	
	public static String getContextPath() {
		return getHttpServletRequest().getContextPath();
	}

	public static String getContextRootPath() {
		return getServletContext().getRealPath("");
	}

	public static HttpServletRequest getHttpServletRequest() {
		return ((ServletRequestAttributes) RequestContextHolder
					.getRequestAttributes()).getRequest();
	}

	public static HttpServletResponse getHttpServletResponse() {
		return ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getResponse();
	}

	public static void addCookie(final Cookie cookie) {
		_Container.getHttpServletResponse().addCookie(cookie);
	}

	public static HttpSession getHttpSession() {
		return getHttpServletRequest().getSession();
	}

//	public static boolean isViewComponent(final Field field) {
//		ActionForm af = field.getAnnotation(ActionForm.class);
//		ViewHelper vf = field.getAnnotation(ViewHelper.class);
//		return af != null;
//		return af != null || vf != null;
//	}
	
	public static Optional<AppMessages> getAppMessages() {
		return Optional.ofNullable((AppMessages) getHttpServletRequest()
				.getAttribute(MODEL_AND_VIEW_VALIDATION_KEY));
	}

	public static AccessUser getAccessUser() {
		return getComponent(AccessUser.class).get();
	}

	/**
	 * seasar 管理下のオブジェクトを取得する．
	 * @return 指定したオブジェクト
	 */
	public static <D> Optional<D> getComponent(Class<D> clazz) {
		try {
			return Optional.of((D) getWebApplicationContext().getBean(clazz));
		} catch (Exception e) {
			return Optional.empty();
		}
	}

	@SuppressWarnings("unchecked")
	public static <D> Optional<D> getComponent(String className) {
		try {
			return Optional.of((D) getWebApplicationContext().getBean(className));
		} catch (Exception e) {
			return Optional.empty();
		}
	}

}
