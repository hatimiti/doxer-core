package org.doxer.app.base.type.form.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Id;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKaishaDbm;
import org.doxer.app.db.dbflute.cbean.CmKaishaCB;
import org.doxer.app.db.dbflute.exbhv.CmKaishaBhv;
import org.doxer.xbase.validation.validator.ExistsFieldValidator;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.Vval;


public class CmKaishaId extends Id {

	public CmKaishaId(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer container, String property) {
		super.validateCustom(container, property);
		if (getValL() == null) {
			return;
		}
		CmKaishaCB cb = new CmKaishaCB();
		cb.query().setCmKaishaId_Equal(getValL());
		new ExistsFieldValidator(container, CmKaishaBhv.class, cb).check(Vval.of(getVal()), property, getLabel());
	}

	@Override
	public int getLength() {
		return CmKaishaDbm.getInstance().columnCmKaishaId().getColumnSize();
	}

	public static CmKaishaId valueOf(String val) {
		CmKaishaId obj = new CmKaishaId(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

}
