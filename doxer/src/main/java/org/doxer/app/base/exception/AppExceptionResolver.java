package org.doxer.app.base.exception;

import static java.lang.String.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		mav.addObject("causeException", new StringBuilder()
				.append(format("name = %s\r\n", ex.toString()))
				.append(format("cause = %s\r\n", ex.getCause()))
				.append(format("stackTrace =\r\n%s", Stream
						.of(ex.getStackTrace())
						.map(s -> s.toString())
						.collect(Collectors.joining("\r\n"))
				))
		);
		mav.setViewName("/error.html");

		return mav;
	}

}
