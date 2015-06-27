package org.doxer.app.db.dbflute.cbean;

import org.doxer.app.db.dbflute.cbean.bs.BsCmShainCB;
import org.doxer.app.sample.ad.master.cmshain.CmShainListForm;

/**
 * The condition-bean of CM_SHAIN.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class CmShainCB extends BsCmShainCB {

	public void setMasterSearchCondition(
			CmShainListForm form) {

		ignoreNullOrEmptyQuery();
		query().setCmShainId_Equal(form.getCmShainId().getValL());
		query().setCmKaishaId_Equal(form.getCmKaishaId().getValL());
		query().setShainMei_LikeSearch(
				form.getShainMei().getVal(), op -> op.likePrefix());
	}

}
