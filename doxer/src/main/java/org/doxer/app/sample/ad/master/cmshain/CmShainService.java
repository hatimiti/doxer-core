package org.doxer.app.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.message.AppMessageLevel.*;
import static com.github.hatimiti.flutist.common.util._Obj.*;
import static org.doxer.xbase.util._Container.*;

import java.io.IOException;
import java.io.Writer;

import javax.annotation.Resource;

import lombok.val;

import org.doxer.app.base.type.form.sample.ad.master.cmshain.CmShainId;
import org.doxer.app.db.dbflute.exbhv.CmShainBhv;
import org.doxer.app.db.dbflute.exentity.CmShain;
import org.doxer.xbase.exception.DoxBusinessRuntimeException;
import org.doxer.xbase.service.DoxService;
import org.doxer.xbase.util.DoxCsvEntityReader;
import org.springframework.stereotype.Service;

import com.github.hatimiti.flutist.common.message.AppMessage;
import com.github.hatimiti.flutist.common.message.AppMessagesException;
import com.orangesignal.csv.CsvConfig;
import com.orangesignal.csv.CsvWriter;
import com.orangesignal.csv.io.CsvEntityWriter;


@Service
public class CmShainService extends DoxService {

	@Resource CmShainBhv cmShainBhv;

	/*
	 * 一覧検索
	 */

	public void search(
			final CmShainListForm form) {

		form.shainList = this.cmShainBhv.selectPageForMaster(form);
		form.setupPage(form.shainList);
	}

	/*
	 * ダウンロード用CSV作成
	 */

	public void outputCsvBySearchCondition(
			final CmShainListForm form,
			final Writer out) {

		try (CsvEntityWriter<CmShainCsv> writer
				= new CsvEntityWriter<>(new CsvWriter(out), CmShainCsv.class, true)) {

			writer.write(CmShainCsv.createHader());

			this.cmShainBhv.selectCursorForMaster(form, shain -> {
				CmShainCsv csv = new CmShainCsv();
				csv.copyFrom(shain);
				writer.write(csv);
			});

		} catch (IOException e) {
			throw new DoxBusinessRuntimeException(e);
		}
	}


	/*
	 * CSVアップロード処理
	 */

	public void inputCsv(
			final CmShainListForm form) {

		CsvConfig conf = new CsvConfig();
		conf.setIgnoreEmptyLines(true);

		try (DoxCsvEntityReader<CmShainCsv> csv
				= new DoxCsvEntityReader<>(form.uploadedCsvFile, conf, CmShainCsv.class)) {

			csv.stream().forEach(line -> {
				CmShainId cmShainId = CmShainId.of(line.cmShainId);
				if (cmShainId.isEmpty()) {
					this.cmShainBhv.insert(line.copyTo(new CmShain()));
				} else {
					CmShain cmShain = this.cmShainBhv.selectByPK(cmShainId.getValL()).get();
					this.cmShainBhv.update(line.copyTo(cmShain));
				}
			});

		} catch (IOException e) {
			throw new DoxBusinessRuntimeException(e);
		}
	}

	/*
	 * 登録
	 */

	public CmShain register(
			final CmShainForm form) {

		val shain = new CmShain();
		shain.copyFrom(form);

		this.cmShainBhv.insert(shain);
		return shain;
	}

	/*
	 * 更新
	 */

	public void prepareUpdate(final CmShainForm form) {
		setCmShainWithRel(form);
	}

	public CmShain update(
			final CmShainForm form) {

		val shain = this.cmShainBhv.selectByPk4Update(form.cmShainId.getValL());
		shain.copyFrom(form);
		this.cmShainBhv.update(shain);

		return shain;
	}

	/*
	 * 削除
	 */

	public void confirmDelete(final CmShainForm form) {
		setCmShainWithRel(form);
	}

	public CmShain delete(final CmShainForm form) {

		// 行ロック
		this.cmShainBhv.selectByPk4Update(form.cmShainId.getValL());

		val shain = selectByPkWithRel(form.cmShainId);

		this.cmShainBhv.delete(shain);
		return shain;
	}

	/*
	 * 共通
	 */

	protected void setCmShainWithRel(CmShainForm form) {

		val cmShain = selectByPkWithRel(form.cmShainId);
		form.copyFrom(cmShain);

	}

	protected CmShain selectByPkWithRel(CmShainId cmShainId) {
		val cmShain = this.cmShainBhv.selectByPkWithRel(cmShainId.getValL());
		if (isEmpty(cmShain)) {
			throw new AppMessagesException(
					new AppMessage(ERROR, "valid.exists", prop("shain")));
		}
		return cmShain;
	}

}
