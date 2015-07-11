package org.doxer.xbase.servlet.mvc.method.annotation;

import java.util.List;

import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.InvocableHandlerMethod;
import org.springframework.web.servlet.mvc.method.annotation.ExtendedServletRequestDataBinder;
import org.springframework.web.servlet.mvc.method.annotation.ServletRequestDataBinderFactory;

public class DoxServletRequestDataBinderFactory extends ServletRequestDataBinderFactory {

	/**
	 * Create a new instance.
	 * @param binderMethods one or more {@code @InitBinder} methods
	 * @param initializer provides global data binder initialization
	 */
	public DoxServletRequestDataBinderFactory(List<InvocableHandlerMethod> binderMethods, WebBindingInitializer initializer) {
		super(binderMethods, initializer);
	}

	/**
	 * Returns an instance of {@link ExtendedServletRequestDataBinder}.
	 */
	@Override
	protected ServletRequestDataBinder createBinderInstance(Object target, String objectName, NativeWebRequest request) {
		return new DoxServletRequestDataBinder(target, objectName);
	}

}
