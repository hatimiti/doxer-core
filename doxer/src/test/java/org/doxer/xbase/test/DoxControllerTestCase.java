package org.doxer.xbase.test;

import org.doxer.Application;
import org.doxer.xbase.controller.DoxController;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import com.github.hatimiti.flutist.common.util._Obj;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("WebContent")
@SpringApplicationConfiguration(classes = Application.class)
//@ContextConfiguration(locations = {"file:*/WEB-INF/dispatcher-servlet.xml"})
@ContextConfiguration(locations = {"file:*/WEB-INF/config/*.xml"})
public abstract class DoxControllerTestCase {

	protected static final Logger logger = _Obj.getLogger();

	@Rule
	public TestName testName = new TestName();

	@Autowired
	protected GenericApplicationContext applicationContext;

	protected MockMvc mockMvc;
	protected MockHttpServletRequest request;
	protected MockHttpServletResponse response;
	protected RequestMappingHandlerAdapter adapter;

	@Before
	public void setup() {

		ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();

		// 疑似セッションスコープを登録
		Scope sessionScope = new SimpleThreadScope();
		beanFactory.registerScope("session", sessionScope);

		/*mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();*/
		mockMvc = MockMvcBuilders.standaloneSetup(getTarget()).build();
		request = new MockHttpServletRequest();
		response = new MockHttpServletResponse();
		response.setOutputStreamAccessAllowed(true);
		adapter = new RequestMappingHandlerAdapter();
	}

	protected abstract DoxController getTarget();

}
