package org.doxer.app.sample.hello;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import javax.annotation.Resource;

import org.doxer.app.base.type.form.hello.Val;
import org.doxer.app.db.dbflute.exbhv.TcmSampleBhv;
import org.doxer.xbase.test.DoxDataSourceTestCase;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class HelloServiceTest extends DoxDataSourceTestCase {

	@Resource
	HelloService service;

	@Resource
	public TcmSampleBhv tcmSampleBhv;

	/**
	 * <h5>試験概要</h5><p>
	 * 検索値"register"で検索することでTCM_SAMPLEテーブルに名前"hatimiti"のレコードが登録されることを確認する．
	 * <h5>試験方法</h5>
	 * <ol>
	 * <li>検索条件値に"register"を指定する．
	 * <li>検索実行前の名前"hatimiti"のTCM_SAMPLEレコード件数を取得する．
	 * <li>検索処理を実行する．
	 * <li>検索実行後の名前"hatimiti"のTCM_SAMPLEレコード件数を取得する．
	 * <li>検索前件数+1と検索後件数を比較する．
	 * </ol>
	 * <h5>期待結果</h5><p>
	 * 検索実行後に"hatimiti"のデータが1件登録されていること。
	 */
	@Test
    @Rollback(true)
	public void testSearch() {
		HelloForm form = new HelloForm();
		form.setFval(getValOf("register"));

		int pre = countTcmSampleOf("hatimiti");
		service.search(form);
		int after = countTcmSampleOf("hatimiti");

		assertTrue(pre + 1 == after);
		assertTrue(countTcmSampleOf("あいうえお") == 1);
	}

	@Test
    @Rollback(true)
	public void testSearch2() {
		assertTrue(countTcmSampleOf("はひふへほ") == 0);
		assertTrue(countTcmSampleOf("テスト2用") == 1);
		assertTrue(countTcmSampleOf("あいうえお") == 1);
	}

	@SuppressWarnings("deprecation")
	private Val getValOf(String name) {
		Val v = new Val(REQUIRED, "fval", "値");
		v.setVal(name);
		return v;
	}

	private int countTcmSampleOf(String name) {
		return tcmSampleBhv.findBySampleName(getValOf(name)).size();
	}

}
