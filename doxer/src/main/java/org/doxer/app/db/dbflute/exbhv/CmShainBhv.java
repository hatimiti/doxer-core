package org.doxer.app.db.dbflute.exbhv;

import static com.github.hatimiti.flutist.common.util._Obj.*;
import static org.doxer.app.db.DBMetaManager.*;
import static org.doxer.xbase.support.SortOrder.*;

import org.dbflute.cbean.result.PagingResultBean;
import org.doxer.app.db.dbflute.bsbhv.BsCmShainBhv;
import org.doxer.app.db.dbflute.cbean.CmShainCB;
import org.doxer.app.db.dbflute.cbean.cq.bs.BsCmShainCQ;
import org.doxer.app.db.dbflute.exentity.CmShain;
import org.doxer.app.sample.ad.master.cmshain.CmShainListForm;
import org.doxer.xbase.support.TableHeaderSortableBhv;

/**
 * The behavior of CM_SHAIN.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
@org.springframework.stereotype.Component("cmShainBhv")
public class CmShainBhv extends BsCmShainBhv
		implements TableHeaderSortableBhv<CmShainCB, BsCmShainCQ> {

	public CmShain selectByPk4Update(Long cmShainId) {
//		cb.lockForUpdateWait(LOCK_WAIT_TIME);
		return selectEntity(cb -> {
			cb.query().setCmShainId_Equal(cmShainId);
		}).get();
	}

	public PagingResultBean<CmShain> selectPageForMaster(
			final CmShainListForm form) {

		PagingResultBean<CmShain> userPage = selectPage(cb -> {
			cb.ignoreNullOrEmptyQuery();
			cb.query().setCmShainId_Equal(form.getCmShainId().getValL());
			cb.query().setCmKaishaId_Equal(form.getCmKaishaId().getValL());
			cb.query().setShainMei_LikeSearch(
					form.getShainMei().getVal(), op -> op.likePrefix());
			cb.paging(form.getPageSize(), form.getPageNumber());
			setOrder(cb, form.getSortColName(), form.getSortOrder());
		});
		return userPage;
	}

	public CmShain selectByPkWithRel(Long cmShainId) {

		CmShain cmShain = selectEntity(cb -> {
			cb.query().setCmShainId_Equal(cmShainId);
			cb.setupSelect_CmKaisha();
		}).get();

		return cmShain;
	}

	@Override
	public BsCmShainCQ setOrder(CmShainCB cb, String sortColName, String sort) {
		return
				eq(CM_SHAIN$CM_SHAIN_ID, sortColName) ? isAsc(sort)
						? cb.query().addOrderBy_CmShainId_Asc() : cb.query().addOrderBy_CmShainId_Desc() :
				eq(CM_KAISHA$CM_KAISHA_ID, sortColName) ? isAsc(sort)
						? cb.query().addOrderBy_CmKaishaId_Asc() : cb.query().addOrderBy_CmKaishaId_Desc() :
				eq(CM_SHAIN$SHAIN_MEI, sortColName) ? isAsc(sort)
						? cb.query().addOrderBy_ShainMei_Asc() : cb.query().addOrderBy_ShainMei_Desc() :
				eq(CM_SHAIN$SHAIN_MEI_EN, sortColName) ? isAsc(sort)
						? cb.query().addOrderBy_ShainMeiEn_Asc() : cb.query().addOrderBy_ShainMeiEn_Desc() :
				null;
	}
}
