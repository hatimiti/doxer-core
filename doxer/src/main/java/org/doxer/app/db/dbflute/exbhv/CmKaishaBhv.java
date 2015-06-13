package org.doxer.app.db.dbflute.exbhv;

import static com.github.hatimiti.flutist.common.util._Obj.*;

import org.dbflute.cbean.result.PagingResultBean;
import org.doxer.app.db.dbflute.bsbhv.BsCmKaishaBhv;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKaishaDbm;
import org.doxer.app.db.dbflute.cbean.CmKaishaCB;
import org.doxer.app.db.dbflute.exentity.CmKaisha;
import org.doxer.app.sample.ad.master.cmkaisha.CmKaishaListForm;
import org.doxer.xbase.support.SortOrder;
import org.doxer.xbase.support.TableHeaderSortable;

/**
 * The behavior of CM_KAISHA.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
@org.springframework.stereotype.Component("cmKaishaBhv")
public class CmKaishaBhv extends BsCmKaishaBhv
		implements TableHeaderSortable<CmKaishaCB> {

	public CmKaisha selectByPk4Update(Long cmKaishaId) {
//		cb.lockForUpdateWait(LOCK_WAIT_TIME);
		return selectEntity(cb -> {
			cb.query().setCmKaishaId_Equal(cmKaishaId);
		}).get();
	}

	public PagingResultBean<CmKaisha> selectPageForMaster(
			final CmKaishaListForm form) {

		PagingResultBean<CmKaisha> userPage = selectPage(cb -> {
			cb.ignoreNullOrEmptyQuery();
			cb.query().setCmKaishaId_Equal(form.getCmKaishaId().getValL());
			cb.query().setKaishaMei_LikeSearch(
					form.getKaishaMei().getVal(), op -> op.likePrefix());
			cb.paging(form.getPageSize(), form.getPageNumber());
			setOrder(cb, form.sortColName, form.sortOrder);
		});
		return userPage;
	}

	public CmKaisha selectByPkWithRel(Long cmKaishaId) {

		CmKaisha cmKaisha = selectEntity(cb -> {
			cb.query().setCmKaishaId_Equal(cmKaishaId);
		}).get();

		loadCmKishTesuryo(cmKaisha, cb -> {
			cb.query().addOrderBy_TekiyoKikanFromDt_Asc();
		});
		loadCmKishRenrakusaki(cmKaisha, cb -> {
			cb.query().addOrderBy_CmKishRenrakusakiId_Asc();
		});

		return cmKaisha;
	}

	@Override
	public void setOrder(CmKaishaCB cb, String sortColName, String sort) {

		switch (SortOrder.valueOf(sort)) {
		case ASC:

			if (eq(CmKaishaDbm.getInstance().columnCmKaishaId(), sortColName)) {
				cb.query().addOrderBy_CmKaishaId_Asc();
			} else if (eq(CmKaishaDbm.getInstance().columnKaishaMei(), sortColName)) {
				cb.query().addOrderBy_KaishaMei_Asc();
			}
			break;

		case DESC:

			if (eq(CmKaishaDbm.getInstance().columnCmKaishaId(), sortColName)) {
				cb.query().addOrderBy_CmKaishaId_Desc();
			} else if (eq(CmKaishaDbm.getInstance().columnKaishaMei(), sortColName)) {
				cb.query().addOrderBy_KaishaMei_Desc();
			}
			break;

		}
	}

}
