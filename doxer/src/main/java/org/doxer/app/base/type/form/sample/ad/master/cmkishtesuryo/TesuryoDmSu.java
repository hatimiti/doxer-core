package org.doxer.app.base.type.form.sample.ad.master.cmkishtesuryo;

import org.doxer.app.base.type.form.base.Su;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKishTesuryoDbm;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;

public class TesuryoDmSu extends Su {

	public TesuryoDmSu(InputAttribute inputAttribute) {
		super(inputAttribute, "tesuryoDmSu", "tesuryoDmSu");
	}

	@Override
	public int length() {
		return CmKishTesuryoDbm.getInstance().columnTesuryoSu().getDecimalDigits();
	}

	public static TesuryoDmSu of(String val) {
		TesuryoDmSu obj = new TesuryoDmSu(InputAttribute.ARBITRARY);
		obj.setStrictVal(val);
		return obj;
	}
}
