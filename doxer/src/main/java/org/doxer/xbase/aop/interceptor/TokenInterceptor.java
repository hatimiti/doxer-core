package org.doxer.xbase.aop.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.aopalliance.intercept.MethodInvocation;
import org.doxer.xbase.aop.interceptor.exception.IllegalTokenException;
import org.doxer.xbase.aop.interceptor.supports.Token;
import org.doxer.xbase.aop.interceptor.supports.TokenType;
import org.doxer.xbase.util.TokenProcessor;
import org.doxer.xbase.util._Container;
import org.springframework.stereotype.Component;

@Component
public class TokenInterceptor extends BaseMethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		Token token = invocation.getMethod().getAnnotation(Token.class);

		if (token == null) {
			return invocation.proceed();
		}

		TokenType type = token.value();
		HttpServletRequest request = _Container.getHttpServletRequest();

		switch (type) {
		case SET:
			setToken(request);
			break;
		case CHECK:
			checkToken(request);
			break;
		case CHECK_AND_SET:
			checkToken(request);
			setToken(request);
			break;
		}

		return invocation.proceed();
	}

	protected void setToken(HttpServletRequest request) {
		TokenProcessor.getInstance().saveToken(request);
	}

	protected void checkToken(HttpServletRequest request) {
		if (!TokenProcessor.getInstance().isTokenValid(request, true)) {
			throw new IllegalTokenException("Please do the operation over again.");
		}
	}

}
