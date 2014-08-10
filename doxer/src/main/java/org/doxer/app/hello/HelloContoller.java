package org.doxer.app.hello;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContoller {

	@Resource
	public HelloService helloService;

	@RequestMapping("/hello")
	public String hello (@ModelAttribute("form") HelloModel model) {
		System.out.println("Hello");
		return "/hello/hello.html";
	}
}
