package org.doxer.app.base.type.form.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Id;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmShainDbm;
import org.doxer.app.db.dbflute.cbean.CmShainCB;
import org.doxer.app.db.dbflute.exbhv.CmShainBhv;
import org.doxer.xbase.validation.validator.ExistsFieldValidator;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;


public class CmShainId extends Id {

	public CmShainId(InputAttribute inputAttribute) {
		super(inputAttribute, "cmShainId", "cmShainId");
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		super.validateCustom(c, owner);
		if (getValL() != null) {
			CmShainCB cb = new CmShainCB();
			cb.query().setCmShainId_Equal(getValL());
			new ExistsFieldValidator(c, CmShainBhv.class, cb).check(vval(), owner, label());
		}
	}

	@Override
	public int length() {
		return CmShainDbm.getInstance().columnCmShainId().getColumnSize();
	}

	public static CmShainId of(String val) {
		CmShainId obj = new CmShainId(ARBITRARY);
		obj.setStrictVal(val);
		return obj;
	}

}
