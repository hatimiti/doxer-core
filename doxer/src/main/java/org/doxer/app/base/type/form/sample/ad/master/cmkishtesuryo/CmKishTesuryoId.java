package org.doxer.app.base.type.form.sample.ad.master.cmkishtesuryo;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Id;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKishTesuryoDbm;
import org.doxer.app.db.dbflute.cbean.CmKishTesuryoCB;
import org.doxer.app.db.dbflute.exbhv.CmKishTesuryoBhv;
import org.doxer.xbase.validation.validator.ExistsFieldValidator;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;


public class CmKishTesuryoId extends Id {

	public CmKishTesuryoId(InputAttribute inputAttribute) {
		super(inputAttribute, "cmKishTesuryoId", "cmKishTesuryoId");
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		super.validateCustom(c, owner);

		if (getValL() != null) {
			CmKishTesuryoCB cb = new CmKishTesuryoCB();
			cb.query().setCmKishTesuryoId_Equal(getValL());
			new ExistsFieldValidator(c, CmKishTesuryoBhv.class, cb).check(vval(), owner, label());
		}
	}

	@Override
	public int length() {
		return CmKishTesuryoDbm.getInstance().columnCmKishTesuryoId().getColumnSize();
	}

	public static CmKishTesuryoId of(String val) {
		CmKishTesuryoId obj = new CmKishTesuryoId(ARBITRARY);
		obj.setStrictVal(val);
		return obj;
	}

}
