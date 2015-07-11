package org.doxer.xbase.springframework.beans;

import java.lang.reflect.Field;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.NotWritablePropertyException;
import org.springframework.beans.PropertyValue;

import com.github.hatimiti.flutist.common.domain.supports.Condition;
import com.github.hatimiti.flutist.common.util._Ref;

public class DoxBeanWrapperImpl extends BeanWrapperImpl {

	/**
	 * Create new BeanWrapperImpl for the given object.
	 * @param object object wrapped by this BeanWrapper
	 */
	public DoxBeanWrapperImpl(Object object) {
		super(object);
	}

	/**
	 * Create new BeanWrapperImpl for the given object,
	 * registering a nested path that the object is in.
	 * @param object object wrapped by this BeanWrapper
	 * @param nestedPath the nested path of the object
	 * @param rootObject the root object at the top of the path
	 */
	public DoxBeanWrapperImpl(Object object, String nestedPath, Object rootObject) {
		super(object, nestedPath, rootObject);
	}

	@Override
	protected void setPropertyValue(PropertyTokenHolder tokens, PropertyValue pv)
			throws BeansException {

		String propertyName = tokens.canonicalName;
		String actualName = tokens.actualName;

		Field f = _Ref.getFieldIncludedSuperByName(this.getWrappedInstance().getClass(), actualName).orElseThrow(() -> {
			return new NotWritablePropertyException(getRootClass(), getNestedPath() + propertyName);
		});
		Condition c = f.getAnnotation(Condition.class);
		if (c == null) {
			throw new NotWritablePropertyException(getRootClass(), getNestedPath() + propertyName);
		}

		super.setPropertyValue(tokens, pv);
	}

	@Override
	protected BeanWrapperImpl newNestedPropertyAccessor(Object object, String nestedPath) {
		return new DoxBeanWrapperImpl(object, nestedPath, this);
	}

}
