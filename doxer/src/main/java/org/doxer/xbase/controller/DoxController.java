package org.doxer.xbase.controller;

import static org.springframework.context.annotation.ScopedProxyMode.*;

import org.doxer.xbase.model.DoxModel;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.ModelAndView;

@Scope(proxyMode = TARGET_CLASS)
public abstract class DoxController {

	protected MV view(String view, DoxModel model) {
		return new MV(view, model);
	}
	
	protected static class MV extends ModelAndView {
		MV(String view, DoxModel model) {
			super(view);
			addObject("form", model);
		}
	}
	
}

