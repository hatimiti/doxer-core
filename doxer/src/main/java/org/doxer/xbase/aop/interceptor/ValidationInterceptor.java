package org.doxer.xbase.aop.interceptor;

import static org.doxer.xbase.servlet.DoxDispatcherServlet.*;
import static org.doxer.xbase.util._Container.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.doxer.xbase.aop.interceptor.supports.DoValidation;
import org.doxer.xbase.form.Form;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.util._Obj;
import com.github.hatimiti.flutist.common.validation.ValidationMessages;

@Component
public class ValidationInterceptor implements MethodInterceptor {

	private static final Logger LOG = _Obj.getLogger();

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		DoValidation v = getValidationAnnotation(invocation.getMethod());
		if (v != null) {
			Object form = invocation.getArguments()[0];
			if (form instanceof Form) {
				Optional<Method> validationMethod = getValidationMethod((Form) form, v);
				if (validationMethod.isPresent()) {
					ValidationMessages ret = (ValidationMessages) validationMethod.get().invoke(form);
					if (ret.hasMessages()) {
						// TODO DoxController と共通化する(インターセプタで登録すればよさげ)
						HttpServletRequest req = getHttpServletRequest();
						req.setAttribute(MODEL_AND_VIEW_FORM_KEY, form);
						req.setAttribute(MODEL_AND_VIEW_VALIDATION_KEY, ret);
						return v.value();
					}
				}
			}
		}
		
		return invocation.proceed();
	}
	
	protected DoValidation getValidationAnnotation(Method method) {
		return method.getAnnotation(DoValidation.class);
	}
	
	protected Optional<Method> getValidationMethod(Form form, DoValidation v) {
		try {
			Optional<Method> method
				= Optional.of(form.getClass().getMethod(v.method()));
			method.get().setAccessible(true);
			return method
					.filter(m -> Modifier.isPublic(m.getModifiers()))
					.filter(m -> m.getReturnType().getTypeName().equals(ValidationMessages.class.getTypeName()))
					.filter(m -> m.getParameterCount() == 0);
		} catch (NoSuchMethodException e) {
			return Optional.empty();
		}
	}
}

