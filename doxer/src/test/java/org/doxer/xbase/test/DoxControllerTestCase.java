package org.doxer.xbase.test;

import org.doxer.Application;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import com.github.hatimiti.flutist.common.util._Obj;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("WebContent")
@SpringApplicationConfiguration(classes = Application.class)
@ContextConfiguration(locations = {"classpath:/spring/*.xml"})
public abstract class DoxControllerTestCase {

	protected static final Logger logger = _Obj.getLogger();

	@Rule
	public TestName testName = new TestName();

	@Autowired
	protected WebApplicationContext applicationContext;

	protected MockMvc mockMvc;
	protected RequestMappingHandlerAdapter adapter;
	@Autowired protected MockHttpServletRequest request;
	@Autowired protected MockHttpSession session;
	@Autowired protected MockHttpServletResponse response;

	@Before
	public void setup() {
		/* mockMvc = MockMvcBuilders.standaloneSetup(getTarget()).build();
		 * -> Springのコンポーネント管理がsetup()時と実行時で異なってしまい
		 * 正常にSpringコンポーネントが取得できないため、WebApplicationContext
		 * を基に MockMvc を作る必要がある。(解決策があれば戻してもよい)
		 */
		mockMvc = MockMvcBuilders.webAppContextSetup(applicationContext).build();
		adapter = new RequestMappingHandlerAdapter();
		response.setOutputStreamAccessAllowed(true);
	}

}
