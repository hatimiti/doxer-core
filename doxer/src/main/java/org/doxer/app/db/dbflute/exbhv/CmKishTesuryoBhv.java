package org.doxer.app.db.dbflute.exbhv;

import java.util.List;

import org.doxer.app.db.dbflute.bsbhv.BsCmKishTesuryoBhv;
import org.doxer.app.db.dbflute.exentity.CmKishTesuryo;

/**
 * The behavior of CM_KISH_TESURYO.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
@org.springframework.stereotype.Component("cmKishTesuryoBhv")
public class CmKishTesuryoBhv extends BsCmKishTesuryoBhv {

	public List<CmKishTesuryo> selectListByCmKaishaId(Long cmKaishaId) {
		return selectList(cb -> {
			cb.query().setCmKaishaId_Equal(cmKaishaId);
		});
	}

}
