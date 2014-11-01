package org.doxer.app.hello;

import javax.annotation.Resource;

import org.doxer.xbase.controller.DoxController;
import org.doxer.xbase.util._Obj;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContoller extends DoxController {

	private static Logger log = _Obj.getLogger();

	@Resource
	public HelloService helloService;

	@RequestMapping("/hello")
	public MV hello (HelloModel model) {
		log.info("ログ出力テスト");
		return view("/hello/hello.html", model);
	}

	@RequestMapping("/input")
	public MV input(HelloModel model) {
		log.info("ログ出力テスト2");
		return view("/hello/hello.html", model);
	}
}
