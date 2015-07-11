package org.doxer.xbase.servlet.mvc.method.annotation;

import java.lang.reflect.Field;

import org.doxer.xbase.springframework.validation.DoxBeanPropertyBindingResult;
import org.springframework.util.Assert;
import org.springframework.validation.AbstractPropertyBindingResult;
import org.springframework.web.servlet.mvc.method.annotation.ExtendedServletRequestDataBinder;

import com.github.hatimiti.flutist.common.util._Ref;

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

	@Override
	public void initBeanPropertyAccess() {
		Field bindingResult = _Ref.getFieldIncludedSuperByName(this.getClass(), "bindingResult").get();
		try {
			Assert.state(bindingResult.get(this) == null,
					"DataBinder is already initialized - call initBeanPropertyAccess before other configuration methods");
			bindingResult.set(this, createBeanPropertyBindingResult());

			if (getConversionService() != null) {
				((AbstractPropertyBindingResult) bindingResult.get(this)).initConversion(getConversionService());
			}

		} catch (IllegalArgumentException | IllegalAccessException e) {
			throw new IllegalStateException(e);
		}
	}

	private DoxBeanPropertyBindingResult createBeanPropertyBindingResult() {
		return new DoxBeanPropertyBindingResult(
				getTarget(), getObjectName(), isAutoGrowNestedPaths(), getAutoGrowCollectionLimit());
	}

}
