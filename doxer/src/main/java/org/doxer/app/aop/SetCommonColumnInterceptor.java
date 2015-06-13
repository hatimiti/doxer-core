package org.doxer.app.aop;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

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
			AccessUser accessUser = _Container.getAccessUser();

			accessContext.setAccessUser(accessUser.getId());
			accessContext.setAccessTimestamp(new Timestamp(_Container.getAccessDate().getTime()));

			// TODO 共通化必要
			Date now = _Container.getAccessDate();
			accessContext.setAccessLocalDateTime(LocalDateTime.ofInstant(now.toInstant(), ZoneId.of("Asia/Tokyo")));

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
