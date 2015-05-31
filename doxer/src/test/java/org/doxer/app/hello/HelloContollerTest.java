package org.doxer.app.hello;

import javax.annotation.Resource;

import org.doxer.Application;
import org.doxer.app.sample.hello.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.SimpleThreadScope;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("WebContent")
@SpringApplicationConfiguration(classes = Application.class)
//@ContextConfiguration(locations = {"file:*/WEB-INF/dispatcher-servlet.xml"})
@ContextConfiguration(locations = {"file:*/WEB-INF/config/*.xml"})
public class HelloContollerTest {

//	@Autowired
//	private WebApplicationContext wac;

	@Autowired
	private GenericApplicationContext applicationContext;
	
	@Resource
	HelloController controller;
	
	private MockMvc mockMvc;

	protected MockHttpServletRequest request;
	protected MockHttpServletResponse response;
	protected RequestMappingHandlerAdapter adapter;

	@Before
	public void setup() {
		
		ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();

		// 疑似セッションスコープを登録
		Scope sessionScope = new SimpleThreadScope();
		beanFactory.registerScope("session", sessionScope);
		
//		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		request = new MockHttpServletRequest();
		response = new MockHttpServletResponse();
		response.setOutputStreamAccessAllowed(true);
		adapter = new RequestMappingHandlerAdapter();
	}

	@Test
	public void test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/sample/hello/index"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.view().name("/hello/hello"))
			.andExpect(MockMvcResultMatchers.model().hasNoErrors())
		;
	}

}
