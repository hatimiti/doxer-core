package org.doxer.xbase.aop.interceptor;

import static org.doxer.xbase.util._Container.*;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.doxer.xbase.form.Form;
import org.slf4j.Logger;

import com.github.hatimiti.flutist.common.util._Obj;

public abstract class BaseMethodInterceptor implements MethodInterceptor {

	protected static final Logger LOG = _Obj.getLogger();

	protected void setObjectToRequestAttribute(
			String key, Object target) {
		HttpServletRequest req = getHttpServletRequest();
		req.setAttribute(key, target);
	}
	
	protected Optional<Form> getForm(MethodInvocation invocation) {
		if (invocation.getArguments().length <= 0) {
			return Optional.empty();
		}
		Object form = invocation.getArguments()[0];
		if (form instanceof Form) {
			return Optional.of((Form) form);
		}
		return Optional.empty();
	}
	
	protected Class<? extends Object> getTargetClass(MethodInvocation invocation) {
		return invocation.getThis().getClass();
	}
}

