package org.doxer.app.db.dbflute.exbhv;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.PagingResultBean;
import org.doxer.app.db.dbflute.bsbhv.BsCmKaishaBhv;
import org.doxer.app.db.dbflute.cbean.CmKaishaCB;
import org.doxer.app.db.dbflute.cbean.CmKishRenrakusakiCB;
import org.doxer.app.db.dbflute.exentity.CmKaisha;
import org.doxer.app.sample.ad.master.cmkaisha.CmKaishaListForm;
import org.doxer.xbase.support.SortOrder;

/**
 * The behavior of CM_KAISHA.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
@org.springframework.stereotype.Component("cmKaishaBhv")
public class CmKaishaBhv extends BsCmKaishaBhv {

	public CmKaisha selectByPk4Update(Long cmKaishaId) {
//		cb.lockForUpdateWait(LOCK_WAIT_TIME);
		return selectEntity(cb -> {
			cb.query().setCmKaishaId_Equal(cmKaishaId);
		}).get();
	}

	public PagingResultBean<CmKaisha> selectPageForMaster(
			final CmKaishaListForm form) {

		PagingResultBean<CmKaisha> userPage = selectPage(cb -> {
			cb.query().setCmKaishaId_Equal(form.cmKaishaId.getValL());
//			cb.query().setKaishaMei_LikeSearch(
//					form.kaishaMei.getVal(), new LikeSearchOption().likePrefix());
			cb.paging(form.getPageSize(), form.getPageNumber());
			setOrder(cb, form.sortColName, form.sortOrder);
		});
		return userPage;
	}

	public CmKaisha selectByPkWithRel(Long cmKaishaId) {
		CmKaisha cmKaisha = selectEntity(cb -> {
			cb.query().setCmKaishaId_Equal(cmKaishaId);
		}).get();

		loadCmKishTesuryoList(cmKaisha, scb -> {
				scb.query().addOrderBy_TekiyoKikanFromDt_Asc();
		});
		loadCmKishRenrakusakiList(cmKaisha, new ConditionBeanSetupper<CmKishRenrakusakiCB>() {
			@Override
			public void setup(CmKishRenrakusakiCB scb) {
				scb.query().addOrderBy_CmKishRenrakusakiId_Asc();
			}
		});

		return cmKaisha;
	}

	@Override
	public void setOrder(CmKaishaCB cb, String sortColName, String sort) {

		switch (SortOrder.valueOf(sort)) {
		case ASC:

			if (eq(N_CM_KAISHA_ID, sortColName)) {
				cb.query().addOrderBy_CmKaishaId_Asc();
			} else if (eq(N_KAISHA_MEI, sortColName)) {
				cb.query().addOrderBy_KaishaMei_Asc();
			}
			break;

		case DESC:

			if (eq(N_CM_KAISHA_ID, sortColName)) {
				cb.query().addOrderBy_CmKaishaId_Desc();
			} else if (eq(N_KAISHA_MEI, sortColName)) {
				cb.query().addOrderBy_KaishaMei_Desc();
			}
			break;

		}
	}

}
