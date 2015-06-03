package org.doxer.app.hello;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import javax.annotation.Resource;

import org.doxer.app.db.dbflute.exbhv.TcmSampleBhv;
import org.doxer.app.sample.hello.HelloForm;
import org.doxer.app.sample.hello.HelloService;
import org.doxer.app.sample.type.Val;
import org.doxer.xbase.test.DoxDataSourceTestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:*/WEB-INF/config/*.xml"})
public class HelloServiceTest extends DoxDataSourceTestCase {

	@Resource
	HelloService service;

	@Resource
	public TcmSampleBhv tcmSampleBhv;

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

		System.out.println(countTcmSampleOf("はひふへほ"));

		int pre = countTcmSampleOf("hatimiti");

		form.setFval(getValOf("register"));
		service.search(form);

		int after = countTcmSampleOf("hatimiti");
		assertTrue(pre + 1 == after);
	}

	@Test
    @Rollback(true)
	public void testSearch2() throws Exception {
		assertTrue(countTcmSampleOf("はひふへほ") == 0);
		assertTrue(countTcmSampleOf("テスト2用") == 1);
	}

	private Val getValOf(String name) {
		Val v = new Val(REQUIRED, "fval", "値");
		v.setVal(name);
		return v;
	}

	private int countTcmSampleOf(String name) {
		return tcmSampleBhv.findBySampleName(getValOf(name)).size();
	}

}
