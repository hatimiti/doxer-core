package org.doxer.xbase.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

public class DoxDispatcherServlet extends DispatcherServlet {

	public static final String MODEL_AND_VIEW_FORM_KEY = "__DOX_MODEL_AND_VIEW_FORM_KEY__";
	
	@Override
	protected void render(
			ModelAndView mv,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		mv.addObject("form", request.getAttribute(MODEL_AND_VIEW_FORM_KEY));
		super.render(mv, request, response);
	}
	
}
