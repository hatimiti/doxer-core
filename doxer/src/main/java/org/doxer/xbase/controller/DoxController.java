package org.doxer.xbase.controller;

import static org.doxer.xbase.servlet.DoxDispatcherServlet.*;
import static org.doxer.xbase.util._Container.*;

import javax.servlet.http.HttpServletRequest;

import org.doxer.xbase.form.Form;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


public abstract class DoxController {

	protected String view(String path, Form form) {
		HttpServletRequest req = getHttpServletRequest();
		req.setAttribute(MODEL_AND_VIEW_ATTRIBUTE_FORM_KEY, form);
		return path;
	}
	
	protected String redirect(String to, RedirectAttributes ra) {
		return "redirect:" + to;
	}
	
	protected String forward(String to) {
		return "forward:" + to;
	}
	
}

