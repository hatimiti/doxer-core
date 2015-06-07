package org.doxer.app.base.type.form.sample.ad.master;

import org.doxer.app.base.type.form.base.Su;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKishTesuryoDbm;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;

public class TesuryoDmSu extends Su {

	public TesuryoDmSu(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	public int getLength() {
		return CmKishTesuryoDbm.getInstance().columnTesuryoSu().getDecimalDigits();
	}

	public static TesuryoDmSu valueOf(String val) {
		TesuryoDmSu obj = new TesuryoDmSu(InputAttribute.ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}
}
