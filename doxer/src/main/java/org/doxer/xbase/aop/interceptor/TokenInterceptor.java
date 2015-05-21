package org.doxer.xbase.aop.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.doxer.xbase.aop.interceptor.supports.Token;
import org.doxer.xbase.aop.interceptor.supports.TokenType;
import org.doxer.xbase.util._Container;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.util._Obj;

@Component
public class TokenInterceptor implements MethodInterceptor {

	private static Logger log = _Obj.getLogger();
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		Token token = invocation.getMethod().getAnnotation(Token.class);

		if (token == null) {
			return invocation.proceed();
		}

		TokenType type = token.value();
		HttpServletRequest request = _Container.getHttpServletRequest();

		if (TokenType.SET == type) {
			setToken(request);
		} else if (TokenType.CHECK == type) {
			checkToken(request);
		} else if (TokenType.CHECK_AND_SET == type) {
			checkToken(request);
			setToken(request);
		}

		return invocation.proceed();
	}


	private void setToken(HttpServletRequest request) {
		//TODO Spring-Security CSRF ?
//		TokenProcessor.getInstance().saveToken(request);
	}

	private void checkToken(HttpServletRequest request) {
//		if (!TokenProcessor.getInstance().isTokenValid(request, true)) {
//			throw new IllegalTokenException("Please do the operation over again.");
//		}
	}

}
