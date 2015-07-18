package org.doxer.app.db.dbflute.exentity;

import static com.github.hatimiti.flutist.common.util._Num.*;

import org.doxer.app.db.dbflute.bsentity.BsCmKishRenrakusaki;
import org.doxer.app.sample.ad.master.cmkaisha.CmKishRenrakusakiForm;

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

	public void copyFrom(CmKishRenrakusakiForm form) {
		this.setCmKaishaId(form.getCmKaishaId().getValL());
		this.setTelNo1(asIntOrNull(form.getTelNo().getVal()[0]));
		this.setTelNo2(asIntOrNull(form.getTelNo().getVal()[1]));
		this.setTelNo3(asIntOrNull(form.getTelNo().getVal()[2]));
		this.setMailAddress(form.getMailAddress().getVal());
		this.setRenrakusakiYotoKbAsRenrakusakiYotoKb(form.getRenrakusakiYotoKb().toKb());
	}
}
