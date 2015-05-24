package org.doxer.xbase.controller;

import org.doxer.xbase.form.Form;
import org.slf4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.hatimiti.flutist.common.util._Obj;

@Scope("request")
public abstract class DoxController {

	protected static Logger LOG = _Obj.getLogger();
	
	protected String view(String path, Form form) {
		return path;
	}
	
	protected String redirect(String to, RedirectAttributes ra) {
		return "redirect:" + to;
	}
	
	protected String forward(String to) {
		return "forward:" + to;
	}
	
}

