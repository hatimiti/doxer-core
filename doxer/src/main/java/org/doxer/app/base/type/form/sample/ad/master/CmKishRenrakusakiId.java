package org.doxer.app.base.type.form.sample.ad.master;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Id;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKishRenrakusakiDbm;
import org.doxer.app.db.dbflute.cbean.CmKishRenrakusakiCB;
import org.doxer.app.db.dbflute.exbhv.CmKishRenrakusakiBhv;
import org.doxer.xbase.validation.validator.ExistsFieldValidator;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.Vval;


public class CmKishRenrakusakiId extends Id {

	public CmKishRenrakusakiId(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer container, String property) {
		super.validateCustom(container, property);

		CmKishRenrakusakiCB cb = new CmKishRenrakusakiCB();
		cb.query().setCmKishRenrakusakiId_Equal(getValL());
		new ExistsFieldValidator(container, CmKishRenrakusakiBhv.class, cb).check(Vval.of(getVal()), property, getLabel());
	}

	@Override
	public int getLength() {
		return CmKishRenrakusakiDbm.getInstance().columnCmKaishaId().getColumnSize();
	}

	public static CmKishRenrakusakiId valueOf(String val) {
		CmKishRenrakusakiId obj = new CmKishRenrakusakiId(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}
}
