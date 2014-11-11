package org.doxer.xbase.aop.interceptor;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.doxer.xbase.util._Obj;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class StopWatchInterceptor implements MethodInterceptor {

	private static Logger log = _Obj.getLogger();

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Method method = invocation.getMethod();
		final StopWatch stopWatch = new StopWatch(method.toGenericString());
		stopWatch.start(method.toGenericString());
		try {
			log.info("--- 測定開始 ---");
			return invocation.proceed();
		} finally {
			stopWatch.stop();
			log.info(stopWatch.prettyPrint());
			log.info("--- 測定終了 ---");
		}
	}
}

