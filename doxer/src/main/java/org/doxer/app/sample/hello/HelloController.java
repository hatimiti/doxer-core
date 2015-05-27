package org.doxer.app.sample.hello;

import javax.annotation.Resource;

import org.doxer.xbase.aop.interceptor.supports.DoValidation;
import org.doxer.xbase.controller.DoxController;
import org.doxer.xbase.form.AccessUser;
import org.doxer.xbase.util._Container;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.hatimiti.flutist.common.annotation.Function;

@Controller
@Function("S0001")
@RequestMapping("/sample/hello")
public class HelloController extends DoxController {

	@Resource
	public HelloService helloService;
	
	@Resource
	public AccessUser accessUser;

	@RequestMapping("/index")
	public String index(HelloForm form) {
		LOG.info("ログ出力テスト 時間={}", _Container.getAccessDate());
		LOG.info("user = {}", accessUser);
		accessUser.setNameMei("hatimiti");
		return view("/hello/hello", form);
	}

	@DoValidation("/hello/hello")
	@RequestMapping("/input")
	public String input(HelloForm form) {
		this.helloService.search(form);
		LOG.info("ログ出力テスト2, {}", form.getResults());
		return view("/hello/hello", form);
	}
	
	@RequestMapping("/redirect")
	public String redirect(HelloForm form, RedirectAttributes ra) {
		ra.addAttribute("val", "リダイレクトで遷移しました");
		return redirect("input", ra);
	}
	
	@RequestMapping("/forward")
	public String forward(HelloForm form) {
		return forward("input");
	}
	
}
