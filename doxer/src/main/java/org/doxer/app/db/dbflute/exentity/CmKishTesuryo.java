package org.doxer.app.db.dbflute.exentity;

import org.doxer.app.db.dbflute.bsentity.BsCmKishTesuryo;
import org.doxer.app.sample.ad.master.cmkaisha.CmKishTesuryoForm;

import com.github.hatimiti.flutist.common.util._Str;

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

	public void copyToForm(CmKishTesuryoForm form) {
		form.getCmKishTesuryoId().setStrictValL(this.getCmKishTesuryoId());
		form.getCmKaishaId().setStrictValL(this.getCmKaishaId());
		form.getTekiyoKikanFromDt().setStrictVal(this.getTekiyoKikanFromDt());
		form.getTekiyoKikanToDt().setStrictVal(this.getTekiyoKikanToDt());
		form.getTesuryoKb().setStrictVal(this.getTesuryoKb());
		form.getTesuryoIntSu().setStrictVal(_Str.getIntegerOf(this.getTesuryoSu()));
		form.getTesuryoDmSu().setStrictVal(_Str.getDecimalOf(this.getTesuryoSu()));
	}
}
