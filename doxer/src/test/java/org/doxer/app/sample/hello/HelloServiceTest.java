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
	 * <h5>試験背景</h5><p>
	 * <s>
	 * yy/mm/dd xxxx様との打ち合わせにて決定した要件。
	 * 運用上fugaする場合に固定のデータを登録することが多いため、hatimiti と入力することで
	 * その煩雑な登録作業を簡略化したいため。
	 * </s><p>
	 * yy/mm/dd xxxx様との打ち合わせにて再決定した要件。
	 * 運用上hogeする場合に固定のデータを登録することが多いため、register と入力することで
	 * その煩雑な登録作業を簡略化したいため。
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
	public void No001_検索処理_正常_固定データ登録() {
		HelloForm form = new HelloForm();
		form.setFval(getValOf("register"));

		int pre = countTcmSampleOf("hatimiti");
		service.search(form);
		int after = countTcmSampleOf("hatimiti");

		assertTrue(pre + 1 == after);
		assertTrue(countTcmSampleOf("あいうえお") == 1);
	}

	/**
	 * <h5>試験背景</h5><p>
	 * </s><p>
	 * yy/mm/dd xxxx様との打ち合わせにて再決定した要件。
	 * 検索条件:サンプル値で指定したサンプルマスタデータ一覧を閲覧したいため。
	 * <h5>試験概要</h5><p>
	 * 検索条件:サンプル値を指定して検索し、想定件数を確認する．
	 * <h5>試験方法</h5>
	 * <ol>
	 * <li>検索条件:サンプル値に"はひふへほ"を指定して検索し、検索結果件数が 0 件であること．
	 * <li>検索条件:サンプル値に"テスト2用"を指定して検索し、検索結果件数が 1 件であること．
	 * <li>検索条件:サンプル値に"あいうえお"を指定して検索し、検索結果件数が 1 件であること．
	 * </ol>
	 * <h5>期待結果</h5><p>
	 * 試験方法通りの結果となること。
	 */
	@Test
    @Rollback(true)
	public void No002_検索処理_正常_通常検索() {
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
