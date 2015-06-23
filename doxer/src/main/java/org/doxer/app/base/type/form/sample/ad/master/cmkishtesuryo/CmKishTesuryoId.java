package org.doxer.app.base.type.form.sample.ad.master.cmkishtesuryo;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Id;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKishTesuryoDbm;
import org.doxer.app.db.dbflute.cbean.CmKishTesuryoCB;
import org.doxer.app.db.dbflute.exbhv.CmKishTesuryoBhv;
import org.doxer.xbase.validation.validator.ExistsFieldValidator;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.Vval;


public class CmKishTesuryoId extends Id {

	public CmKishTesuryoId(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer container, String property) {
		super.validateCustom(container, property);
		if (getValL() == null) {
			return;
		}
		CmKishTesuryoCB cb = new CmKishTesuryoCB();
		cb.query().setCmKishTesuryoId_Equal(getValL());
		new ExistsFieldValidator(container, CmKishTesuryoBhv.class, cb).check(Vval.of(getVal()), property, getLabel());
	}

	@Override
	public int getLength() {
		return CmKishTesuryoDbm.getInstance().columnCmKaishaId().getColumnSize();
	}

	public static CmKishTesuryoId valueOf(String val) {
		CmKishTesuryoId obj = new CmKishTesuryoId(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

}
