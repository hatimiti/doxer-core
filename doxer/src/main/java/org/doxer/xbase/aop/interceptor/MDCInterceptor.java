package org.doxer.xbase.aop.interceptor;

import static org.doxer.xbase.util._Container.*;

import javax.servlet.http.HttpServletRequest;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.doxer.xbase.form.AccessUser;
import org.doxer.xbase.util._Container;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import com.github.hatimiti.doxer.common.util._Http;

/**
 * MDC(Mapped Diagnostic Context)設定用Interceptor
 * リクエストを受け付けたクライアントの固有の情報をログなどに出力するためのものです．
 * @author hatimiti
 *
 */
@Component
public class MDCInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		try {
			setupAccessUser(getHttpServletRequest());
			setupMDC(getHttpServletRequest());
			return invocation.proceed();
		} finally {
			MDC.clear();
		}
	}

	protected void setupAccessUser(HttpServletRequest req) {
		AccessUser user = _Container.getAccessUser();

		if (user.isInitialized()) {
			return;
		}

		user.setIpAddress(_Http.getRemoteAddress(req));
		user.setUserAgent(_Http.getUserAgent(req));
		user.setLocale(req.getLocale());
		user.setInitialized(true);
	}

	protected void setupMDC(HttpServletRequest req) {

		AccessUser user = _Container.getAccessUser();

		if (!user.isInitialized()) {
			return;
		}

		MDC.put("id", user.getId());
		MDC.put("ip", user.getIpAddress());
		MDC.put("ua", user.getUserAgent());
		MDC.put("sid", req.getSession().getId());
	}

}

