package org.doxer.app.hello;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.doxer.app.db.dbflute.exbhv.TcmSampleBhv;
import org.doxer.app.sample.hello.HelloForm;
import org.doxer.app.sample.hello.HelloService;
import org.doxer.app.sample.type.Val;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:*/WEB-INF/config/*.xml"})
public class HelloServiceTest {

	@Resource
	HelloService service;
	
	@Resource
	public TcmSampleBhv tcmSampleBhv;
	
	@Before
	public void setup() {
	}

	/**
	 * <p>概要：val パラメータ値を "register" とすることで、名前が "hatimiti" であるデータが1件登録されていることを確認する。</p>
	 * <p></p>
	 * 
	 * @throws Exception
	 */
	@Test
    @Rollback(true)
	public void testSearch() throws Exception {
		HelloForm form = new HelloForm();
		
		int pre = countTcmSampleOf("hatimiti");
		
		form.setVal(new Val("register"));
		service.search(form);
		
		int after = countTcmSampleOf("hatimiti");
		assertTrue(pre + 1 == after);
	}

	private int countTcmSampleOf(String name) {
		return tcmSampleBhv.findBySampleName(new Val(name)).size();
	}

}
