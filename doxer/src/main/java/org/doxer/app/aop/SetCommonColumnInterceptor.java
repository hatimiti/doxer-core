package org.doxer.app.aop;

import java.sql.Timestamp;
import java.util.Optional;

import org.aopalliance.intercept.MethodInvocation;
import org.dbflute.hook.AccessContext;
import org.doxer.xbase.aop.interceptor.BaseMethodInterceptor;
import org.doxer.xbase.form.AccessUser;
import org.doxer.xbase.util._Container;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.annotation.Function;

@Component
public class SetCommonColumnInterceptor extends BaseMethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		try {
			AccessContext accessContext = new AccessContext();
			Optional<AccessUser> accessUser = _Container.getComponent(AccessUser.class);

			accessUser.ifPresent(u -> accessContext.setAccessUser(u.getId()));
			accessContext.setAccessTimestamp(new Timestamp(_Container.getAccessDate().getTime()));
			
			Class<?> targetClazz = getTargetClass(invocation);
			
			Function fc = targetClazz.getAnnotation(Function.class);
			accessContext.setAccessProcess(fc == null ? "NONE" : fc.value());

			AccessContext.setAccessContextOnThread(accessContext);
			return invocation.proceed();

		} finally {
			AccessContext.clearAccessContextOnThread();
		}
	}

}
