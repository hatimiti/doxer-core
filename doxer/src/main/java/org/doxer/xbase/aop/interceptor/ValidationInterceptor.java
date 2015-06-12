package org.doxer.xbase.aop.interceptor;

import static org.doxer.xbase.util._Container.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

import org.aopalliance.intercept.MethodInvocation;
import org.doxer.xbase.aop.interceptor.supports.DoValidation;
import org.doxer.xbase.form.Form;
import org.doxer.xbase.util._Container;
import org.doxer.xbase.validation.validator.FormValidator;
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

	protected AppMessagesContainer validate(
			DoValidation dv, Form form) throws Throwable {

		AppMessagesContainer container = new AppMessagesContainer();

		Arrays.stream(dv.v())
			.filter(v -> v.isMemberClass())
			.forEach(v -> {
				try {
					Constructor<? extends FormValidator> c
						= v.getDeclaredConstructor(form.getClass());
					c.setAccessible(true);
					c.newInstance(new Object[] { form }).validate(container);
				} catch (Exception e) {
					// No Operator
					LOG.info("valid method not found. message = {}, stackTracd = {}",
							e.getMessage(), e.getStackTrace());
				}
			});

		return container;
	}

	protected String buildReturnValue(DoValidation v) {
		switch (v.transition()) {
		case REDIRECT:
			return getRedirectPath(v.to());
		case FORWORD:
			return _Container.getForwardPath(v.to());
		case VIEW:
		default:
			return v.to();
		}
	}
}

