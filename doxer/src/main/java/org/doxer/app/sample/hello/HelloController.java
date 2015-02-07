package org.doxer.app.sample.hello;

import static org.springframework.context.annotation.ScopedProxyMode.*;

import javax.annotation.Resource;

import org.doxer.xbase.controller.DoxController;
import org.doxer.xbase.util._Obj;
import org.slf4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope(proxyMode = TARGET_CLASS)
public class HelloController extends DoxController {

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
		log.info("ログ出力テスト2, {}", this.helloService.hello());
		return view("/hello/hello.html", model);
	}
}
