package org.doxer.xbase.aop.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.doxer.xbase.util._Obj;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class ValidationInterceptor implements MethodInterceptor {

	private static Logger log = _Obj.getLogger();

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		log.info("valid Interceptor !!");
		// TODO validation process
		return invocation.proceed();
	}
}

