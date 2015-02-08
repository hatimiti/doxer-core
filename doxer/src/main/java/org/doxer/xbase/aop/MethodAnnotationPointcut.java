package org.doxer.xbase.aop;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class MethodAnnotationPointcut extends StaticMethodMatcherPointcut {

	private Class<? extends Annotation>[] annotations;
	
	@SafeVarargs
	public MethodAnnotationPointcut(Class<? extends Annotation>... annotations) {
		this.annotations = annotations;
	}
	
	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return Arrays.stream(annotations)
			.anyMatch(it -> method.isAnnotationPresent(it));
	}

}
