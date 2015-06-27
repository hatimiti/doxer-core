package org.doxer.app.sample.ad.menu;

import static org.doxer.xbase.controller.DoxController.DoxModelAndView.*;

import org.doxer.xbase.controller.DoxController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.hatimiti.flutist.common.annotation.Function;

/**
 * sample
 * @author hatimiti
 */
@Controller
@Function("S0104")
@RequestMapping(MenuController.BASE_URI)
public class MenuController extends DoxController {

	public static final String BASE_URI = "/sample/ad/menu/";

	// 一覧

	@RequestMapping
	public DoxModelAndView index() {
		return view(BASE_URI, "menu.html", null);
	}

}
