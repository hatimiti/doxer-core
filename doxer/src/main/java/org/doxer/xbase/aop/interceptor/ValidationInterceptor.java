package org.doxer.xbase.aop.interceptor;

import static org.doxer.xbase.util._Container.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Optional;

import org.aopalliance.intercept.MethodInvocation;
import org.doxer.xbase.aop.interceptor.supports.DoValidation;
import org.doxer.xbase.form.Form;
import org.doxer.xbase.util._Container;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.message.AppMessagesContainer;

@Component
public class ValidationInterceptor extends BaseMethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		DoValidation v = getValidationAnnotation(invocation.getMethod());
		Optional<Form> opForm = getForm(invocation);
		if (v == null || !opForm.isPresent()) {
			return invocation.proceed();
		}
		
		AppMessagesContainer container = validate(v, opForm.get());
		if (!container.isEmpty()) {
			_Container.getAppMessagesContainer().addAll(container);
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
				= Optional.of(form.getClass().getMethod(v.method(), AppMessagesContainer.class));
			method.get().setAccessible(true);
			return method
					.filter(m -> Modifier.isPublic(m.getModifiers()))
					.filter(m -> m.getReturnType() == void.class);
		} catch (NoSuchMethodException e) {
			return Optional.empty();
		}
	}
	
	protected AppMessagesContainer validate(
			DoValidation v, Form form) throws Throwable {
		AppMessagesContainer container = new AppMessagesContainer();
		Optional<Method> validationMethod = getAppMethod(form, v);
		if (validationMethod.isPresent()) {
			validationMethod.get().invoke(form, container);
		}
		return container;
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

