package org.doxer.app.base.type.form.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Id;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmShainDbm;
import org.doxer.app.db.dbflute.cbean.CmShainCB;
import org.doxer.app.db.dbflute.exbhv.CmShainBhv;
import org.doxer.xbase.validation.validator.ExistsFieldValidator;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.Vval;


public class CmShainId extends Id {

	public CmShainId(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer container, String property) {
		super.validateCustom(container, property);
		if (getValL() == null) {
			return;
		}
		CmShainCB cb = new CmShainCB();
		cb.query().setCmShainId_Equal(getValL());
		new ExistsFieldValidator(container, CmShainBhv.class, cb).check(Vval.of(getVal()), property, getLabel());
	}

	@Override
	public int getLength() {
		return CmShainDbm.getInstance().columnCmShainId().getColumnSize();
	}

	public static CmShainId valueOf(String val) {
		CmShainId obj = new CmShainId(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

}
