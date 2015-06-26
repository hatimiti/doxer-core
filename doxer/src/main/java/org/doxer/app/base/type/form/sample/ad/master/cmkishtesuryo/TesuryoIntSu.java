package org.doxer.app.base.type.form.sample.ad.master.cmkishtesuryo;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Su;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKishTesuryoDbm;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;

public class TesuryoIntSu extends Su {

	public TesuryoIntSu(InputAttribute inputAttribute) {
		super(inputAttribute, "tesuryoIntSu", "tesuryoIntSu");
	}

	@Override
	public int length() {
		return CmKishTesuryoDbm.getInstance().columnTesuryoSu().getColumnSize()
				- CmKishTesuryoDbm.getInstance().columnTesuryoSu().getDecimalDigits();
	}

	public static TesuryoIntSu of(String val) {
		TesuryoIntSu obj = new TesuryoIntSu(ARBITRARY);
		obj.setStrictVal(val);
		return obj;
	}

}
