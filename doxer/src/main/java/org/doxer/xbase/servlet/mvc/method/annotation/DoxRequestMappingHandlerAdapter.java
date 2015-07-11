package org.doxer.xbase.servlet.mvc.method.annotation;

import java.util.List;

import org.springframework.web.method.annotation.InitBinderDataBinderFactory;
import org.springframework.web.method.support.InvocableHandlerMethod;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class DoxRequestMappingHandlerAdapter extends RequestMappingHandlerAdapter {

	@Override
	protected InitBinderDataBinderFactory createDataBinderFactory(
			List<InvocableHandlerMethod> binderMethods) throws Exception {
		return new DoxServletRequestDataBinderFactory(binderMethods, getWebBindingInitializer());
	}

}
