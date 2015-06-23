package org.doxer.app.base.type.form.sample.ad.master.cmkishrenrakusaki;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Kb;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmRenrakusakiYotoKbDbm;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;

public class RenrakusakiYotoKb extends Kb<org.doxer.app.db.dbflute.allcommon.CDef.RenrakusakiYotoKb> {

	public RenrakusakiYotoKb(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	public org.doxer.app.db.dbflute.allcommon.CDef.RenrakusakiYotoKb toKb() {
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
