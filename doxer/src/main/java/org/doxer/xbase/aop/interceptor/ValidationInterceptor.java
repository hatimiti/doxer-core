package org.doxer.xbase.aop.interceptor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

import org.aopalliance.intercept.MethodInvocation;
import org.doxer.xbase.aop.interceptor.supports.DoValidation;
import org.doxer.xbase.controller.DoxController.DoxModelAndView;
import org.doxer.xbase.form.Form;
import org.doxer.xbase.util._Container;
import org.doxer.xbase.validation.validator.FormValidator;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.util._Ref;

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
			return buildReturnValue(v, opForm.get(), getTarget(invocation));
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
					throw new RuntimeException(e);
				}
			});

		return container;
	}

	protected Object buildReturnValue(DoValidation dv, Form form, Object controller) {
		switch (dv.transition()) {
		case REDIRECT:
			return DoxModelAndView.redirect(dv.to(), null);
		case FORWORD:
			Method m = _Ref.getMethod(controller.getClass(), dv.to(), form.getClass()).get();
			try {
				return m.invoke(controller, form);
			} catch (Exception e) {
				LOG.error("No found method for forward. message = {}, stackTrace = {}",
						e.getMessage(), e.getStackTrace());
			}
			/* TODO
			 * 複数submitボタンが存在する場合、@RequestMapping に params 属性を指定するが
			 * 既にリクエスト中に遷移先のボタン名(params)が存在する場合、バリデーション先のボタン名(params)
			 * が混在し、フォワードが無限ループに陥るため、現在は上記のようにフォワードではなく
			 * 直接メソッドを呼び出すことで対応している。
			 */
//			return getForwardPath(v.to());
		case VIEW:
		default:
			return DoxModelAndView.view(dv.to(), form);
		}
	}
}

