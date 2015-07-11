package org.doxer.xbase.springframework.validation;

import org.doxer.xbase.springframework.beans.DoxBeanWrapperImpl;
import org.springframework.beans.BeanWrapper;
import org.springframework.validation.BeanPropertyBindingResult;

public class DoxBeanPropertyBindingResult extends BeanPropertyBindingResult {

	/**
	 * Creates a new instance of the {@link BeanPropertyBindingResult} class.
	 * @param target the target bean to bind onto
	 * @param objectName the name of the target object
	 * @param autoGrowNestedPaths whether to "auto-grow" a nested path that contains a null value
	 * @param autoGrowCollectionLimit the limit for array and collection auto-growing
	 */
	public DoxBeanPropertyBindingResult(Object target, String objectName, boolean autoGrowNestedPaths, int autoGrowCollectionLimit) {
		super(target, objectName, autoGrowNestedPaths, autoGrowCollectionLimit);
	}

	@Override
	protected BeanWrapper createBeanWrapper() {
		return new DoxBeanWrapperImpl(getTarget());
	}

}
