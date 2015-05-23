package org.doxer.xbase.aop.interceptor.supports;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoValidation {
	
	String value();
	
	//TODO カンマ区切り可能にする？
	String method() default "validate";
	
	SCOPE scope() default SCOPE.VIEW;
	
	public static enum SCOPE {
		VIEW,
		REDIRECT,
		FORWORD
	}
}
