package org.doxer.xbase.aop.interceptor;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionInterceptor;

/**
 * {@code @Transactional} アノテーションが付加されたメソッドの場合はそちらの設定を優先する。
 * それ以外の動作についてはデフォルトのTransactionInterceptorの動作に従う。
 * @author hatimiti
 */
@SuppressWarnings("serial")
public class DoxTransactionInterceptor extends TransactionInterceptor {

	@Override
	public Object invoke(final MethodInvocation invocation) throws Throwable {
		Method method = invocation.getMethod();
		Transactional transactional = method.getAnnotation(Transactional.class);
		return transactional != null ? invocation.proceed() : super.invoke(invocation);
	}
}

