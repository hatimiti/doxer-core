package org.doxer.app.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.util._Obj.*;

import javax.annotation.Resource;

import org.doxer.app.base.type.form.sample.ad.master.CmKaishaId;
import org.doxer.app.base.type.sample.ad.master.CmKaishaList;
import org.doxer.app.base.type.sample.ad.master.CmKishTesuryoFormList;
import org.doxer.app.db.dbflute.allcommon.CDef.RenrakusakiYotoKb;
import org.doxer.app.db.dbflute.exbhv.CmKaishaBhv;
import org.doxer.app.db.dbflute.exbhv.CmKishRenrakusakiBhv;
import org.doxer.app.db.dbflute.exbhv.CmKishTesuryoBhv;
import org.doxer.app.db.dbflute.exentity.CmKaisha;
import org.doxer.app.db.dbflute.exentity.CmKishRenrakusaki;
import org.doxer.app.db.dbflute.exentity.CmKishTesuryo;
import org.doxer.xbase.service.DoxService;
import org.seasar.util.collection.CollectionsUtil;
import org.springframework.stereotype.Service;

@Service
public class CmKaishaService extends DoxService {

	@Resource CmKaishaBhv cmKaishaBhv;
	@Resource CmKishTesuryoBhv cmKishTesuryoBhv;
	@Resource CmKishRenrakusakiBhv cmKishRenrakusakiBhv;

	/*
	 * 一覧検索
	 */

	public void search(
			final CmKaishaListForm form) {

		form.kaishaList = new CmKaishaList(this.cmKaishaBhv.selectPageForMaster(form));
		form.setupPage(form.kaishaList);
	}

	/*
	 * 登録
	 */

	public void prepareRegister(
			final CmKaishaForm form) {

		form.clearCmKishTesuryoFormByDefault();
		form.cmKishTesuryoForms = new CmKishTesuryoFormList();
		form.cmKishRenrakusakiForms = CollectionsUtil.newArrayList();
		addRenrakusaki(form);
	}

	public CmKaisha register(
			final CmKaishaForm form) {

		// 会社登録
		CmKaisha kaisha = new CmKaisha();
		kaisha.setKaishaMei(form.kaishaMei.getVal());
		this.cmKaishaBhv.insert(kaisha);


//		CmKishTesuryoEntityDomain cmKishaTesuryoED
//			= CmKishTesuryoEntityDomain.createInstance(form.cmKishTesuryoForms);

//		cmKishaTesuryoED.registerTo(kaisha);

		// 手数料登録
		for (CmKishTesuryoForm tesuryoForm : form.cmKishTesuryoForms) {
			registerCmKishTesuryo(tesuryoForm, kaisha);
		}

		// 連絡先登録
		for (CmKishRenrakusakiForm renrakusakiForm : form.cmKishRenrakusakiForms) {
			registerCmKishRenrakusaki(renrakusakiForm, kaisha);
		}

		return kaisha;
	}

	/*
	 * 更新
	 */

	public void prepareUpdate(final CmKaishaForm form) {
		form.clearCmKishTesuryoFormByDefault();
		form.cmKishTesuryoForms = new CmKishTesuryoFormList();
		form.cmKishRenrakusakiForms = CollectionsUtil.newArrayList();
		setCmKaishaWithRel(form);
	}

	public CmKaisha update(
			final CmKaishaForm form) {

//		CmKaisha kaisha = this.cmKaishaBhv.selectByPk4Update(form.cmKaishaId.getValL());
//		form.copyToEntity(kaisha);
//		this.cmKaishaBhv.update(kaisha);
//
//		// 手数料登録
//
//		List<CmKishTesuryo> dbTesuryoList
//			= this.cmKishTesuryoBhv.selectListByCmKaishaId(kaisha.getCmKaishaId());
//
//		List<CmKishTesuryoForm> fmTesuryoList = form.cmKishTesuryoForms;
//
//		lp1 :
//		for (CmKishTesuryo dbTesuryo : dbTesuryoList) {
//			for (CmKishTesuryoForm fmTesuryo : fmTesuryoList) {
//				if (dbTesuryo.getTekiyoKikanFromDt()
//						.equals(fmTesuryo.tekiyoKikanFromDt.getVal())) {
//
//					fmTesuryo.copyToEntity(dbTesuryo);
//					this.cmKishTesuryoBhv.update(dbTesuryo);
//					continue lp1;
//				}
//			}
//			this.cmKishTesuryoBhv.delete(dbTesuryo);
//		}
//
//		lp1 :
//		for (CmKishTesuryoForm fmTesuryo : fmTesuryoList) {
//			for (CmKishTesuryo dbTesuryo : dbTesuryoList) {
//				if (dbTesuryo.getTekiyoKikanFromDt()
//						.equals(fmTesuryo.tekiyoKikanFromDt.getVal())) {
//					continue lp1;
//				}
//			}
//			registerCmKishTesuryo(fmTesuryo, kaisha);
//		}
//
//		// 連絡先更新
//
//		List<CmKishRenrakusaki> dbRenrakusakiList
//			= this.cmKishRenrakusakiBhv.selectListByCmKaishaId(kaisha.getCmKaishaId());
//		this.cmKishRenrakusakiBhv.batchDelete(dbRenrakusakiList);
//
//		for (CmKishRenrakusakiForm renrakusakiForm : form.cmKishRenrakusakiForms) {
//			registerCmKishRenrakusaki(renrakusakiForm, kaisha);
//		}
//
//		return kaisha;
		return null;
	}

	/*
	 * 削除
	 */

	public void confirmDelete(final CmKaishaForm form) {
		form.cmKishTesuryoForms = new CmKishTesuryoFormList();
		form.cmKishRenrakusakiForms = CollectionsUtil.newArrayList();
		setCmKaishaWithRel(form);
	}

	public CmKaisha delete(final CmKaishaForm form) {

//		// 行ロック
//		this.cmKaishaBhv.selectByPk4Update(form.cmKaishaId.getValL());
//
//		CmKaisha kaisha = selectByPkWithRel(form.cmKaishaId);
//
//		for (CmKishTesuryo tesuryo : kaisha.getCmKishTesuryoList()) {
//			this.cmKishTesuryoBhv.delete(tesuryo);
//		}
//
//		this.cmKaishaBhv.delete(kaisha);
//		return kaisha;
		return null;
	}

	/*
	 * 共通
	 */

	public void addTesuryo(final CmKaishaForm form) {
		CmKishTesuryoForm addedTesuryo
			= createAndCopy(form.cmKishTesuryoForm, CmKishTesuryoForm.class);
		form.cmKishTesuryoForms.putTesuryo(addedTesuryo);
		form.cmKishTesuryoForms.launder();
		form.clearCmKishTesuryoFormByDefault();
	}

	public void addRenrakusaki(final CmKaishaForm form) {
		CmKishRenrakusakiForm renrakusakiForm = new CmKishRenrakusakiForm();
		renrakusakiForm.renrakusakiYotoKb.setStrictVal(RenrakusakiYotoKb.Normal.toString());
		form.cmKishRenrakusakiForms.add(renrakusakiForm);
	}

	protected void registerCmKishTesuryo(
			CmKishTesuryoForm cmKishTesuryoForm, CmKaisha cmKaisha) {

		CmKishTesuryo insTesuryo = new CmKishTesuryo();
		cmKishTesuryoForm.copyToEntity(insTesuryo);
		insTesuryo.setCmKaishaId(cmKaisha.getCmKaishaId());
		this.cmKishTesuryoBhv.insert(insTesuryo);
	}

	protected void registerCmKishRenrakusaki(
			CmKishRenrakusakiForm cmKishRenrakusakiForm, CmKaisha cmKaisha) {

		CmKishRenrakusaki renrakusaki = new CmKishRenrakusaki();
		cmKishRenrakusakiForm.copyToEntity(renrakusaki);
		renrakusaki.setCmKaishaId(cmKaisha.getCmKaishaId());
		this.cmKishRenrakusakiBhv.insert(renrakusaki);
	}

	protected void setCmKaishaWithRel(CmKaishaForm form) {

//		CmKaisha cmKaisha = selectByPkWithRel(form.cmKaishaId);
//		cmKaisha.copyToForm(form);
//
//		for (CmKishTesuryo tesuryo : cmKaisha.getCmKishTesuryoList()) {
//			CmKishTesuryoForm tesuryoForm = new CmKishTesuryoForm();
//			tesuryo.copyToForm(tesuryoForm);
//			form.cmKishTesuryoForms.add(tesuryoForm);
//		}
//
//		for (CmKishRenrakusaki renrakusaki : cmKaisha.getCmKishRenrakusakiList()) {
//			CmKishRenrakusakiForm renrakusakiForm = new CmKishRenrakusakiForm();
//			renrakusaki.copyToForm(renrakusakiForm);
//			form.cmKishRenrakusakiForms.add(renrakusakiForm);
//		}
	}

	protected CmKaisha selectByPkWithRel(CmKaishaId cmKaishaId) {
//		CmKaisha cmKaisha = this.cmKaishaBhv.selectByPkWithRel(cmKaishaId.getValL());
//		if (isEmpty(cmKaisha)) {
//			throw new XActionMessagesException("valid.exists", get("vers.kaisha"));
//		}
//		return cmKaisha;
		return null;
	}

}
