package org.doxer.xbase.util;

import static javax.servlet.http.HttpServletResponse.*;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.doxer.xbase.form.AccessUser;
import org.slf4j.Logger;
import org.springframework.context.MessageSource;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.github.hatimiti.flutist.common.message.AppMessage;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.GlobalMessages;
import com.github.hatimiti.flutist.common.message.OwnedMessages;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.util.CharacterEncoding;
import com.github.hatimiti.flutist.common.util.MIMEType;
import com.github.hatimiti.flutist.common.util._Date;
import com.github.hatimiti.flutist.common.util._Http;
import com.github.hatimiti.flutist.common.util._Num;
import com.github.hatimiti.flutist.common.util._Obj;
import com.github.hatimiti.flutist.common.util._Str;

/**
 * jsp/servlet コンテナを起動している時に使用可能なユーティリティクラス．
 * @author hatimiti
 *
 */
public final class _Container {

	private static final Logger LOG = _Obj.getLogger();

	/* ****************************************
	 * フィールド定義
	 * ****************************************/

	public static final String TRANSITION_REDIRECT_PREFIX = "redirect:";
	public static final String TRANSITION_FORWARD_PREFIX = "forward:";

	private static final String KEY_APPMESSAGES_IN_SESSION = "__KEY_APPMESSAGES_IN_SESSION__";

	/** アクセス時間保持(Web側で使用される日時) */
	private static final ThreadLocal<Date> ACCESS_DATE = new ThreadLocal<Date>() {
		@Override
		protected Date initialValue() {
			return new Date();
		};
	};

	/** アプリケーションメッセージ保持 */
	private static final ThreadLocal<AppMessagesContainer> APPMESSAGES
			= new ThreadLocal<AppMessagesContainer>() {
		@Override
		protected AppMessagesContainer initialValue() {
			AppMessagesContainer flash
				= (AppMessagesContainer) getHttpSession().getAttribute(KEY_APPMESSAGES_IN_SESSION);
			getHttpSession().removeAttribute(KEY_APPMESSAGES_IN_SESSION);
			return flash != null ? flash : new AppMessagesContainer();
		};
	};

	/*
	 * private コンストラクタ
	 */
	private _Container() { }

	/* ****************************************
	 * アクセス日付
	 * ****************************************/

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

	/* ****************************************
	 * アプリケーションメッセージ
	 * ****************************************/

	/**
	 * アプリケーションメッセージコンテナを取得<br>
	 */
	public static AppMessagesContainer getAppMessagesContainer() {
		return APPMESSAGES.get();
	}

	/**
	 * アプリケーションメッセージコンテナをクリア<br>
	 * filter が呼び出すため、実装者が呼び出す必要はない．
	 */
	public static void resetAppMessagesContainer(HttpServletRequest req, HttpServletResponse res) {
		switch (res.getStatus()) {
		case SC_MOVED_PERMANENTLY:
		case SC_MOVED_TEMPORARILY:
			// リダイレクト時はFLASHメッセージとして時リクエストへ引き継ぐ
			req.getSession().setAttribute(KEY_APPMESSAGES_IN_SESSION, getAppMessagesContainer());
			break;
		default:
			break;
		}
		APPMESSAGES.remove();
	}

	public static List<String> getAllMessages() {
		return buildMessages(getAppMessagesContainer().getAllMessageList());
	}

	public static List<String> getGlobalMessages() {
		return buildMessages(getAppMessagesContainer().getGlobalMessages());
	}

	public static List<String> getParsedOwnedMessages(String owner) {
		return buildMessages(getAppMessagesContainer().getOwnedMessages(Owner.of(owner)));
	}

	public static List<String> getParsedOwnedMessagesByOwnerPrefix(String ownerPrefix) {
		return buildIndexedMessages(getAppMessagesContainer().getOwnedMessagesByPrefix(ownerPrefix));
	}

	public static void addAllMessages(AppMessagesContainer container) {
		getAppMessagesContainer().addAll(container);
	}

	public static void addAllMessages(AppMessages<?> messages) {
		getAppMessagesContainer().add(messages);
	}

	public static void addMessage(AppMessage message) {
		getAppMessagesContainer().add(new GlobalMessages(message));
	}

	public static void addMessage(String owner, AppMessage message) {
		getAppMessagesContainer().add(new OwnedMessages(Owner.of(owner), message));
	}

	private static List<String> buildMessages(List<AppMessage> messages) {
		MessageSource source = getComponent(MessageSource.class).get();
		return messages.stream()
				.map(m -> funcBuildMessage.apply(m, source))
				.collect(Collectors.toList());
	}

	private static List<String> buildIndexedMessages(List<OwnedMessages> messagesList) {
		MessageSource source = getComponent(MessageSource.class).get();
		List<String> result = new ArrayList<>();
		for (OwnedMessages o : messagesList) {
			result.addAll(buildMessages(o).stream()
				.map(m -> (String) Optional.ofNullable(o.getOwner().getIndex())
						.map(i -> funcBuildIndexLabel.apply(i, source)).orElse("") + m)
				.collect(Collectors.toList()));
		}
		return result;
	}

	private static final BiFunction<Integer, MessageSource, String> funcBuildIndexLabel
		= (i, s) -> s.getMessage("valid.line.index.prefix", new Object[] { i + 1 }, getAccessUser().getLocale());

	private static final BiFunction<AppMessage, MessageSource, String> funcBuildMessage
		= (m, s) -> m.isResource()
				? s.getMessage(m.getKeyOrMessage(), m.getParams(), getAccessUser().getLocale())
				: m.getKeyOrMessage();

	/* ****************************************
	 * プロパティファイル
	 * ****************************************/

	public static String prop(String key, Object... params) {
		Objects.requireNonNull(key);
		return getComponent(MessageSource.class).get()
				.getMessage(key, params, getAccessUser().getLocale());
	}

	public static int propAsInt(String key, Object... params) {
		return _Num.asIntOrNull(prop(key, params));
	}

	public static long propAsLong(String key, Object... params) {
		return _Num.asLongOrNull(prop(key, params));
	}

	public static boolean propAsBoolean(String key, Object... params) {
		return Boolean.valueOf(prop(key, params));
	}

	/* ****************************************
	 * アプリケーションWeb設定
	 * ****************************************/

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
		return RequestContextUtils.getWebApplicationContext(getHttpServletRequest());
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
		HttpServletResponse res = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getResponse();
		return res != null ? res : null;
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

	/* ****************************************
	 * ダウンロード
	 * ****************************************/

	public static void downloadFile(Path filePath) {
		try {
			OutputStream writer = _Http.getOutputStreamForDownload(
					getHttpServletResponse(), CharacterEncoding.UTF8,
					MIMEType.APPL_OCTET_STREAM, filePath.getFileName().toString());

			_Http.write(writer, filePath.toFile());

		} catch (IOException e) {
			LOG.warn("Download is missed!! message = {}, stacktrace = {}",
					e.getMessage(), e.getStackTrace());
		}
	}

	/* ****************************************
	 * アクセスユーザー
	 * ****************************************/

	public static AccessUser getAccessUser() {
		return getComponent(AccessUser.class).get();
	}

	/* ****************************************
	 * DIコンテナ設定
	 * ****************************************/

	public static String getRedirectPath(String path) {
		return TRANSITION_REDIRECT_PREFIX + path;
	}

	public static String getForwardPath(String path) {
		return TRANSITION_FORWARD_PREFIX + path;
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
