package org.doxer.app.base.type.form.sample.ad.master.cmkishtesuryo;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Kb;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmTesuryoKbDbm;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;

public class TesuryoKb extends Kb<org.doxer.app.db.dbflute.allcommon.CDef.TesuryoKb> {

	public TesuryoKb(InputAttribute inputAttribute) {
		super(inputAttribute, "tesuryoKb", "tesuryoKb");
	}

	public org.doxer.app.db.dbflute.allcommon.CDef.TesuryoKb toKb() {
		return org.doxer.app.db.dbflute.allcommon.CDef.TesuryoKb.codeOf(getVal());
	}

	@Override
	public int length() {
		return CmTesuryoKbDbm.getInstance().columnKbVal().getColumnSize();
	}

	public static TesuryoKb of(String val) {
		TesuryoKb obj = new TesuryoKb(ARBITRARY);
		obj.setStrictVal(val);
		return obj;
	}
}
