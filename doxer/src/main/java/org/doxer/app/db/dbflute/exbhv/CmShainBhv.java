package org.doxer.app.db.dbflute.exbhv;

import static com.github.hatimiti.flutist.common.util._Obj.*;
import static org.doxer.app.db.DBMetaManager.*;
import static org.doxer.app.db.ExEntityRowHandler.*;
import static org.doxer.xbase.support.SortOrder.*;

import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.result.PagingResultBean;
import org.doxer.app.db.ExEntityRowHandler;
import org.doxer.app.db.dbflute.bsbhv.BsCmShainBhv;
import org.doxer.app.db.dbflute.cbean.CmShainCB;
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
		implements TableHeaderSortableBhv<CmShainCB> {

	public CmShain selectByPk4Update(Long cmShainId) {
//		cb.lockForUpdateWait(LOCK_WAIT_TIME);
		return selectEntity(cb -> {
			cb.query().setCmShainId_Equal(cmShainId);
		}).get();
	}

	public PagingResultBean<CmShain> selectPageForMaster(
			CmShainListForm form) {

		PagingResultBean<CmShain> userPage = selectPage(cb -> {
			cb.setMasterSearchCondition(form);
			cb.paging(form.getPageSize(), form.getPageNumber());
			setOrder(cb, form.getSortColName(), form.getSortOrder());
		});
		return userPage;
	}

	public void selectCursorForMaster(
			CmShainListForm form,
			ExEntityRowHandler<CmShain> handler) {

		selectCursor(cb -> cb.setMasterSearchCondition(form), uncheck(handler));
	}

	public CmShain selectByPkWithRel(Long cmShainId) {

		CmShain cmShain = selectEntity(cb -> {
			cb.query().setCmShainId_Equal(cmShainId);
			cb.setupSelect_CmKaisha();
		}).get();

		return cmShain;
	}

	@Override
	public ConditionQuery setOrder(CmShainCB cb, String sortColName, String sort) {
		return
				eq(CM_SHAIN$CM_SHAIN_ID, sortColName) ? isAsc(sort)
						? cb.query().addOrderBy_CmShainId_Asc()
						: cb.query().addOrderBy_CmShainId_Desc() :
				eq(CM_KAISHA$KAISHA_MEI, sortColName) ? isAsc(sort)
						? cb.query().queryCmKaisha().addOrderBy_KaishaMei_Asc()
						: cb.query().queryCmKaisha().addOrderBy_KaishaMei_Desc() :
				eq(CM_SHAIN$SHAIN_MEI, sortColName) ? isAsc(sort)
						? cb.query().addOrderBy_ShainMei_Asc()
						: cb.query().addOrderBy_ShainMei_Desc() :
				eq(CM_SHAIN$SHAIN_MEI_EN, sortColName) ? isAsc(sort)
						? cb.query().addOrderBy_ShainMeiEn_Asc()
						: cb.query().addOrderBy_ShainMeiEn_Desc() :
				null;
	}
}
