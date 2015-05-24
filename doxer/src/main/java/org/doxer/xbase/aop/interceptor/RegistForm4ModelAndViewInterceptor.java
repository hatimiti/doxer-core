package org.doxer.xbase.aop.interceptor;

import static org.doxer.xbase.servlet.DoxDispatcherServlet.*;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component
public class RegistForm4ModelAndViewInterceptor extends BaseMethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		getForm(invocation).ifPresent(
				f -> setObjectToRequestAttribute(MODEL_AND_VIEW_FORM_KEY, f));
		return invocation.proceed();
	}

}

