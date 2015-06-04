package org.doxer.app.hello;

import javax.annotation.Resource;

import org.doxer.app.sample.hello.HelloController;
import org.doxer.xbase.controller.DoxController;
import org.doxer.xbase.test.DoxControllerTestCase;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class HelloContollerTest extends DoxControllerTestCase {

	@Resource
	private HelloController controller;

	@Test
	public void test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/sample/hello/index"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.view().name("/hello/hello"))
			.andExpect(MockMvcResultMatchers.model().hasNoErrors())
		;
	}

	@Override
	protected DoxController getTarget() {
		return this.controller;
	}

}
