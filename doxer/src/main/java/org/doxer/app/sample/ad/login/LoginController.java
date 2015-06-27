package org.doxer.app.sample.ad.login;

import static com.github.hatimiti.flutist.common.util._Obj.*;
import static org.doxer.xbase.controller.DoxController.DoxModelAndView.*;

import javax.annotation.Resource;

import org.doxer.app.sample.ad.login.LoginForm.Validate;
import org.doxer.xbase.aop.interceptor.supports.DoValidation;
import org.doxer.xbase.controller.DoxController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.hatimiti.flutist.common.annotation.Function;

/**
 * sample
 * @author hatimiti
 */
@Controller
@Function("S0103")
@SessionAttributes(types = { LoginForm.class })
@RequestMapping(LoginController.BASE_URI)
public class LoginController extends DoxController {

	public static final String BASE_URI = "/sample/ad/login/";

	@Resource LoginService loginService;

	// 一覧

	@RequestMapping
	public DoxModelAndView index(LoginForm form) {
		copy(new LoginForm(), form);
		return view(BASE_URI, "login.html", form);
	}

	@DoValidation(v = { Validate.class }, to = BASE_URI + "login.html")
	@RequestMapping(params = "login")
	public DoxModelAndView login(LoginForm form, RedirectAttributes ra) {
		this.loginService.login(form);
		return view("/sample/ad/menu/", form);
	}

	@RequestMapping(params = "dummyLogin")
	public DoxModelAndView dummyLogin(LoginForm form, RedirectAttributes ra) {
		this.loginService.dummyLogin();
		return redirect("/sample/ad/menu/", ra);
	}

}
