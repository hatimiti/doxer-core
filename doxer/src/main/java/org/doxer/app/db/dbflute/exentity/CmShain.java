package org.doxer.app.db.dbflute.exentity;

import org.doxer.app.db.dbflute.bsentity.BsCmShain;
import org.doxer.app.sample.ad.master.cmshain.CmShainForm;

/**
 * The entity of CM_SHAIN.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class CmShain extends BsCmShain {

	/** The serial version UID for object serialization. (Default) */
	private static final long serialVersionUID = 1L;

	public void copyFrom(CmShainForm form) {
		this.setCmShainId(form.getCmShainId().getValL());
		this.setCmKaishaId(form.getCmKaishaId().getValL());
		this.setShainSei(form.getShainSei().getVal());
		this.setShainMei(form.getShainMei().getVal());
		this.setShainSeiEn(form.getShainSeiEn().getVal());
		this.setShainMeiEn(form.getShainMeiEn().getVal());
		this.setLoginCd(form.getLoginCd().getVal());
		this.setPassword(form.getPassword().getVal());
		this.setVersionNo(form.getVersionNo());
	}

}
