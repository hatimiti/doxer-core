package org.doxer.app.db.dbflute.exbhv;

import java.util.List;

import org.doxer.app.db.dbflute.bsbhv.BsCmKishRenrakusakiBhv;
import org.doxer.app.db.dbflute.exentity.CmKishRenrakusaki;

/**
 * The behavior of CM_KISH_RENRAKUSAKI.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
@org.springframework.stereotype.Component("cmKishRenrakusakiBhv")
public class CmKishRenrakusakiBhv extends BsCmKishRenrakusakiBhv {

	public List<CmKishRenrakusaki> selectListByCmKaishaId(Long cmKaishaId) {
		return selectList(cb -> {
			cb.query().setCmKaishaId_Equal(cmKaishaId);
			cb.query().addOrderBy_CmKishRenrakusakiId_Asc();
		});
	}

}
