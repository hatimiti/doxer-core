package org.doxer.app.db.dbflute.exentity;

import java.math.BigDecimal;

import org.doxer.app.db.dbflute.bsentity.BsCmKishTesuryo;
import org.doxer.app.sample.ad.master.cmkaisha.CmKishTesuryoForm;

/**
 * The entity of CM_KISH_TESURYO.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class CmKishTesuryo extends BsCmKishTesuryo {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

	public void copyFrom(CmKishTesuryoForm form) {
		this.setCmKaishaId(form.getCmKaishaId().getValL());
		this.setTekiyoKikanFromDt(form.getTekiyoKikanFromDt().getVal());
		this.setTekiyoKikanToDt(form.getTekiyoKikanToDt().getVal());
		this.setTesuryoSu(new BigDecimal(form.getTesuryoSu()));
		this.setTesuryoKbAsTesuryoKb(form.getTesuryoKb().toKb());
	}
}
