package org.doxer.app.base.type.form.sample.ad.master.cmkishtesuryo;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Su;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKishTesuryoDbm;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;

public class TesuryoIntSu extends Su {

	public TesuryoIntSu(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	public int getLength() {
		return CmKishTesuryoDbm.getInstance().columnTesuryoSu().getColumnSize()
				- CmKishTesuryoDbm.getInstance().columnTesuryoSu().getDecimalDigits();
	}

	public static TesuryoIntSu valueOf(String val) {
		TesuryoIntSu obj = new TesuryoIntSu(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

}
