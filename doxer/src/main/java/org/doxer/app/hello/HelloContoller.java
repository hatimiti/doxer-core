package org.doxer.app.hello;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContoller {

	protected static Logger log = LoggerFactory.getLogger(HelloContoller.class);

	@Resource
	public HelloService helloService;

	@RequestMapping("/hello")
	public String hello (@ModelAttribute("form") HelloModel model) {
		System.out.println("HelloY");
		log.info("ログ出力テスト");
		return "/hello/hello.html";
	}

	@RequestMapping("input")
	public String input(@ModelAttribute("form") HelloModel model) {
		System.out.println(model.getVal());
		return "/hello/hello.html";
	}
}
