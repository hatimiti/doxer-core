package org.doxer.xbase.aop.interceptor;

import static org.doxer.xbase.servlet.DoxDispatcherServlet.*;
import static org.doxer.xbase.util._Container.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Optional;

import org.aopalliance.intercept.MethodInvocation;
import org.doxer.xbase.aop.interceptor.supports.DoValidation;
import org.doxer.xbase.form.Form;
import org.doxer.xbase.util._Container;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.message.AppMessages;

@Component
public class ValidationInterceptor extends BaseMethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		DoValidation v = getValidationAnnotation(invocation.getMethod());
		Optional<Form> opForm = getForm(invocation);
		if (v == null || !opForm.isPresent()) {
			return invocation.proceed();
		}
		
		AppMessages errors = validate(v, opForm.get());
		if (errors != null && errors.hasMessages()) {
			setObjectToRequestAttribute(MODEL_AND_VIEW_VALIDATION_KEY, errors);
			return buildReturnValue(v);
		}
		
		return invocation.proceed();
	}

	protected DoValidation getValidationAnnotation(Method method) {
		return method.getAnnotation(DoValidation.class);
	}
	
	protected Optional<Method> getAppMethod(Form form, DoValidation v) {
		try {
			Optional<Method> method
				= Optional.of(form.getClass().getMethod(v.method()));
			method.get().setAccessible(true);
			return method
					.filter(m -> Modifier.isPublic(m.getModifiers()))
					.filter(m -> m.getReturnType() == AppMessages.class)
					.filter(m -> m.getParameterCount() == 0);
		} catch (NoSuchMethodException e) {
			return Optional.empty();
		}
	}
	
	protected AppMessages validate(
			DoValidation v, Form form) throws Throwable {
		Optional<Method> validationMethod = getAppMethod(form, v);
		if (validationMethod.isPresent()) {
			return (AppMessages) validationMethod.get().invoke(form);
		}
		return null;
	}
	
	protected String buildReturnValue(DoValidation v) {
		switch (v.transition()) {
		case REDIRECT:
			return getRedirectPath(v.value());
		case FORWORD:
			return _Container.getForwardPath(v.value());
		case VIEW:
		default:
			return v.value();
		}
	}
}

