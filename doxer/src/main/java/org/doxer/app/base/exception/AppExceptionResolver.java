package org.doxer.app.base.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.github.hatimiti.flutist.common.util._Obj;

@Component
public class AppExceptionResolver implements HandlerExceptionResolver {

	protected static final Logger LOG = _Obj.getLogger();

	@Override
	public ModelAndView resolveException(
			HttpServletRequest request,
			HttpServletResponse response,
			Object handler,
			Exception ex) {

		LOG.warn("例外を検出しました。 message = {}, stackTrace = {}",
				ex.getMessage(), ex.getStackTrace());

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/error.html");

		return mav;
	}

}
