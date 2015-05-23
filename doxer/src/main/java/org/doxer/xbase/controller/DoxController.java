package org.doxer.xbase.controller;

import static org.doxer.xbase.servlet.DoxDispatcherServlet.*;
import static org.doxer.xbase.util._Container.*;

import javax.servlet.http.HttpServletRequest;

import org.doxer.xbase.form.Form;
import org.slf4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.hatimiti.flutist.common.util._Obj;

@Scope("request")
public abstract class DoxController {

	protected static Logger LOG = _Obj.getLogger();
	
	protected String view(String path, Form form) {
		// TODO ValidationInterceptorと共通化
		HttpServletRequest req = getHttpServletRequest();
		req.setAttribute(MODEL_AND_VIEW_FORM_KEY, form);
		return path;
	}
	
	protected String redirect(String to, RedirectAttributes ra) {
		return "redirect:" + to;
	}
	
	protected String forward(String to) {
		return "forward:" + to;
	}
	
}

