package org.doxer.app.hello;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("WebContent")
@ContextConfiguration(locations = {"file:*/WEB-INF/dispatcher-servlet.xml"})
public class HelloContollerTest {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;

	protected MockHttpServletRequest request;
	protected MockHttpServletResponse response;
	protected RequestMappingHandlerAdapter adapter;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
		request = new MockHttpServletRequest();
		response = new MockHttpServletResponse();
		response.setOutputStreamAccessAllowed(true);
		adapter = new RequestMappingHandlerAdapter();
	}

	@Test
	public void test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.view().name("/hello/hello.html"))
			.andExpect(MockMvcResultMatchers.model().hasNoErrors())
		;
	}

}
