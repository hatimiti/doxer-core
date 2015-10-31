package org.doxer.xbase.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.hatimiti.doxer.common.util._Obj;

public class DoxErrorController extends BasicErrorController {

	protected static Logger LOG = _Obj.getLogger();

	public DoxErrorController(ErrorAttributes errorAttributes, ErrorProperties properties) {
		super(errorAttributes, properties);
	}

	// TODO エラーページへの遷移
	// @see org.doxer.xbase.controller.ErrorPageController

	@Override
	@RequestMapping(value = "${error.path:/error.html}", produces = "text/html")
	public ModelAndView errorHtml(HttpServletRequest request) {
		return super.errorHtml(request);
	}

	@Override
	@RequestMapping(value = "${error.path:/error.html}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
		return super.error(request);
	}

}

