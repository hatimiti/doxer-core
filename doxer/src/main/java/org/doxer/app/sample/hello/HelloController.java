package org.doxer.app.sample.hello;

import javax.annotation.Resource;

import org.doxer.xbase.controller.DoxController;
import org.doxer.xbase.form.AccessUser;
import org.doxer.xbase.util._Container;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.hatimiti.flutist.common.util._Obj;

@Controller
@RequestMapping("/sample/hello")
public class HelloController extends DoxController {

	private static Logger log = _Obj.getLogger();

	@Resource
	public HelloService helloService;
	
	@Resource
	public AccessUser accessUser;

	@RequestMapping("/index")
	public String index(HelloForm form) {
		log.info("ログ出力テスト 時間={}", _Container.getAccessDate());
		log.info("user = {}", accessUser);
		accessUser.setNameMei("hatimiti");
		return view("/hello/hello", form);
	}

	@RequestMapping("/input")
	public String input(HelloForm form) {
		this.helloService.search(form);
		log.info("ログ出力テスト2, {}", form.getResults());
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
