package org.doxer.app.base.type.form.sample.ad.master;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Kb;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmTesuryoKbDbm;
import org.doxer.app.db.dbflute.cbean.CmTesuryoKbCB;
import org.doxer.app.db.dbflute.exbhv.CmTesuryoKbBhv;
import org.doxer.xbase.validation.validator.ExistsFieldValidator;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.Vval;

public class TesuryoKb extends Kb {

	public TesuryoKb(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer container, String property) {
		super.validateCustom(container, property);

		CmTesuryoKbCB cb = new CmTesuryoKbCB();
		cb.query().setKbVal_Equal_AsTesuryoKb(getKb());
		new ExistsFieldValidator(container, CmTesuryoKbBhv.class, cb).check(Vval.of(getVal()), property, getLabel());
	}

	public org.doxer.app.db.dbflute.allcommon.CDef.TesuryoKb getKb() {
		return org.doxer.app.db.dbflute.allcommon.CDef.TesuryoKb.codeOf(getVal());
	}

	@Override
	public int getLength() {
		return CmTesuryoKbDbm.getInstance().columnKbVal().getColumnSize();
	}

	public static TesuryoKb valueOf(String val) {
		TesuryoKb obj = new TesuryoKb(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}
}
