package org.doxer.app.sample.lang;

import static org.doxer.xbase.controller.DoxController.DoxModelAndView.*;

import javax.annotation.Resource;

import org.doxer.xbase.controller.BaseLangController;
import org.doxer.xbase.form.AccessUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample/lang")
public class LangController extends BaseLangController {

	@Resource
	public AccessUser accessUser;

	@RequestMapping("/")
	public DoxModelAndView index(LangForm form) {
		return view("/lang/lang.html", form);
	}

	@RequestMapping("/lang")
	public DoxModelAndView lang(LangForm form) {
		setupLocale(form.lang);
		accessUser.setLangCd(form.lang);
		return view("/lang/lang.html", form);
	}

}
