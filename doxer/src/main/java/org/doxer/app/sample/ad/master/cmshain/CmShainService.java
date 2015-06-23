package org.doxer.app.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.util._Obj.*;

import javax.annotation.Resource;

import org.doxer.app.base.type.form.sample.ad.master.cmshain.CmShainId;
import org.doxer.app.db.dbflute.exbhv.CmShainBhv;
import org.doxer.app.db.dbflute.exentity.CmShain;
import org.doxer.xbase.service.DoxService;
import org.springframework.stereotype.Service;

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
	 * 登録
	 */

	public CmShain register(
			final CmShainForm form) {

		CmShain shain = new CmShain();
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

		CmShain shain = this.cmShainBhv.selectByPk4Update(form.cmShainId.getValL());
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

		CmShain shain = selectByPkWithRel(form.cmShainId);

		this.cmShainBhv.delete(shain);
		return shain;
	}

	/*
	 * 共通
	 */

	protected void setCmShainWithRel(CmShainForm form) {

		CmShain cmShain = selectByPkWithRel(form.cmShainId);
		form.copyFrom(cmShain);

	}

	protected CmShain selectByPkWithRel(CmShainId cmShainId) {
		CmShain cmShain = this.cmShainBhv.selectByPkWithRel(cmShainId.getValL());
		if (isEmpty(cmShain)) {
//			throw new XActionMessagesException("valid.exists", get("vers.kaisha"));
		}
		return cmShain;
	}

}
