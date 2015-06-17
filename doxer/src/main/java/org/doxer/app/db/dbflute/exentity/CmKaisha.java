package org.doxer.app.db.dbflute.exentity;

import org.doxer.app.db.dbflute.bsentity.BsCmKaisha;
import org.doxer.app.sample.ad.master.cmkaisha.CmKaishaForm;

/**
 * The entity of CM_KAISHA.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class CmKaisha extends BsCmKaisha {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

	public void copyFrom(CmKaishaForm form) {
		this.setCmKaishaId(form.getCmKaishaId().getValL());
		this.setKaishaMei(form.getKaishaMei().getVal());
		this.setKaishaMeiEn(form.getKaishaMeiEn().getVal());
		this.setVersionNo(form.getVersionNo());
	}
}
