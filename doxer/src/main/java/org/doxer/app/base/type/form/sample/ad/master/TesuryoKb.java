package org.doxer.app.base.type.form.sample.ad.master;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Kb;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmTesuryoKbDbm;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;

public class TesuryoKb extends Kb<org.doxer.app.db.dbflute.allcommon.CDef.TesuryoKb> {

	public TesuryoKb(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	public org.doxer.app.db.dbflute.allcommon.CDef.TesuryoKb toKb() {
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
