package org.doxer.xbase.controller;

import static org.doxer.xbase.controller.DoxController.DoxModelAndView.*;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.hatimiti.doxer.common.util._Obj;

@Controller
public class ErrorPageController extends DoxController {

	protected static Logger LOG = _Obj.getLogger();

	@RequestMapping("/error")
	public DoxModelAndView toErrorPage() {
		return view("/error.html", null);
	}

}

