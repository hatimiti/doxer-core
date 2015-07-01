package org.doxer.app.base.type.form.sample.ad.master.cmkishrenrakusaki;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import static com.github.hatimiti.flutist.common.util._Obj.*;

import org.doxer.app.base.type.form.base.Id;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKishRenrakusakiDbm;
import org.doxer.app.db.dbflute.cbean.CmKishRenrakusakiCB;
import org.doxer.app.db.dbflute.exbhv.CmKishRenrakusakiBhv;
import org.doxer.xbase.validation.validator.ExistsFieldValidator;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;


public class CmKishRenrakusakiId extends Id {

	public CmKishRenrakusakiId(InputAttribute inputAttribute) {
		super(inputAttribute, "cmKishRenrakusakiId", "cmKishRenrakusakiId");
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {

		super.validateCustom(c, owner);

		if (isNotEmpty(getValL())) {
			CmKishRenrakusakiCB cb = new CmKishRenrakusakiCB();
			cb.query().setCmKishRenrakusakiId_Equal(getValL());
			new ExistsFieldValidator(c, CmKishRenrakusakiBhv.class, cb).check(vval(), owner, label());
		}
	}

	@Override
	public int length() {
		return CmKishRenrakusakiDbm.getInstance().columnCmKaishaId().getColumnSize();
	}

	public static CmKishRenrakusakiId of(String val) {
		CmKishRenrakusakiId obj = new CmKishRenrakusakiId(ARBITRARY);
		obj.setStrictVal(val);
		return obj;
	}
}
