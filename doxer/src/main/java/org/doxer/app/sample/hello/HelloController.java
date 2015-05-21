package org.doxer.app.sample.hello;

import javax.annotation.Resource;

import org.doxer.xbase.controller.DoxController;
import org.doxer.xbase.model.AccessUser;
import org.doxer.xbase.util._Container;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public MV index(HelloModel model) {
		log.info("ログ出力テスト 時間={}", _Container.getAccessDate());
		log.info("user = {}", accessUser);
		accessUser.setNameMei("hatimiti");
		return view("/hello/hello", model);
	}

	@RequestMapping("/input")
	public MV input(HelloModel model) {
		this.helloService.search(model);
		log.info("ログ出力テスト2, {}", model.getResults());
		return view("/hello/hello", model);
	}
}
