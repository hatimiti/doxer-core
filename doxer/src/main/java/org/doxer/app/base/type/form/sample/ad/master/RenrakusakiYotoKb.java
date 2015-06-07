package org.doxer.app.base.type.form.sample.ad.master;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Kb;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmRenrakusakiYotoKbDbm;
import org.doxer.app.db.dbflute.cbean.CmRenrakusakiYotoKbCB;
import org.doxer.app.db.dbflute.exbhv.CmRenrakusakiYotoKbBhv;
import org.doxer.xbase.validation.validator.ExistsFieldValidator;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.Vval;

public class RenrakusakiYotoKb extends Kb {

	public RenrakusakiYotoKb(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer container, String property) {
		super.validateCustom(container, property);

		CmRenrakusakiYotoKbCB cb = new CmRenrakusakiYotoKbCB();
		cb.query().setKbVal_Equal_AsRenrakusakiYotoKb(getKb());
		new ExistsFieldValidator(container, CmRenrakusakiYotoKbBhv.class, cb).check(Vval.of(getVal()), property, getLabel());
	}

	public org.doxer.app.db.dbflute.allcommon.CDef.RenrakusakiYotoKb getKb() {
		return org.doxer.app.db.dbflute.allcommon.CDef.RenrakusakiYotoKb.codeOf(getVal());
	}

	@Override
	public int getLength() {
		return CmRenrakusakiYotoKbDbm.getInstance().columnKbVal().getColumnSize();
	}

	public static RenrakusakiYotoKb valueOf(String val) {
		RenrakusakiYotoKb obj = new RenrakusakiYotoKb(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}
}
