package org.doxer.app.sample.hello;

import javax.annotation.Resource;

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
			.andExpect(MockMvcResultMatchers.view().name("/hello/hello.html"))
			.andExpect(MockMvcResultMatchers.model().hasNoErrors())
		;
	}

}
