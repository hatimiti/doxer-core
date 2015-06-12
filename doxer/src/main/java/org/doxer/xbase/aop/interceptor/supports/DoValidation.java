package org.doxer.xbase.aop.interceptor.supports;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.doxer.xbase.validation.validator.FormValidator;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoValidation {

	Class<? extends FormValidator>[] v();

	String to();

	TransitionMethod transition() default TransitionMethod.VIEW;

	public static enum TransitionMethod {
		VIEW,
		REDIRECT,
		FORWORD
	}
}
