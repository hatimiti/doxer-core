package org.doxer.xbase.controller;

import static org.doxer.xbase.util._Container.*;

import org.doxer.xbase.form.Form;
import org.slf4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.hatimiti.doxer.common.util._Obj;

@Scope("request")
public abstract class DoxController {

	protected static Logger LOG = _Obj.getLogger();

	public static class DoxModelAndView extends ModelAndView {
		private DoxModelAndView(String view) {
			this(view, null);
		}

		private DoxModelAndView(String view, Form form) {
			super(view);
			addObject("form", form);
		}

		public static DoxModelAndView view(String path, Form form) {
			return view("", path, form);
		}

		public static DoxModelAndView view(String base, String path, Form form) {
			return new DoxModelAndView(base + path, form);
		}

		public static DoxModelAndView redirect(String to, RedirectAttributes ra) {
			return new DoxModelAndView(getRedirectPath(to));
		}

		public static DoxModelAndView forward(String to) {
			return new DoxModelAndView(getForwardPath(to));
		}

		public static DoxModelAndView download(Form form) {
			return new DoxModelAndView(null, form);
		}
	}

}

