package org.doxer.xbase.servlet.mvc.method.annotation;

import org.doxer.xbase.springframework.validation.DoxBeanPropertyBindingResult;
import org.springframework.web.servlet.mvc.method.annotation.ExtendedServletRequestDataBinder;

public class DoxServletRequestDataBinder extends ExtendedServletRequestDataBinder {

	/**
	 * Create a new instance.
	 * @param target the target object to bind onto (or {@code null}
	 * if the binder is just used to convert a plain parameter value)
	 * @param objectName the name of the target object
	 * @see #DEFAULT_OBJECT_NAME
	 */
	public DoxServletRequestDataBinder(Object target, String objectName) {
		super(target, objectName);
	}

	protected DoxBeanPropertyBindingResult createBeanPropertyBindingResult() {
		return new DoxBeanPropertyBindingResult(
				getTarget(), getObjectName(), isAutoGrowNestedPaths(), getAutoGrowCollectionLimit());
	}

}
