package org.doxer.app.db.dbflute.exentity;

import org.doxer.app.db.dbflute.bsentity.BsCmKishRenrakusaki;
import org.doxer.app.sample.ad.master.cmkaisha.CmKishRenrakusakiForm;

import com.github.hatimiti.flutist.common.util._Str;

/**
 * The entity of CM_KISH_RENRAKUSAKI.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class CmKishRenrakusaki extends BsCmKishRenrakusaki {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

	public void copyToForm(CmKishRenrakusakiForm form) {
		form.getCmKishRenrakusakiId().setStrictValL(this.getCmKishRenrakusakiId());
		form.getCmKaishaId().setStrictValL(this.getCmKaishaId());
		form.getTelNo().setStrictVal(
				_Str.toEmpty(this.getTelNo1()),
				_Str.toEmpty(this.getTelNo2()),
				_Str.toEmpty(this.getTelNo3()));
		form.getMailAddress().setStrictVal(this.getMailAddress());
		form.getRenrakusakiYotoKb().setStrictVal(this.getRenrakusakiYotoKb());
	}
}
