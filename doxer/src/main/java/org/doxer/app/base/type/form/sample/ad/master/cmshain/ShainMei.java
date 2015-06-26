package org.doxer.app.base.type.form.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Mei;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmShainDbm;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;

public class ShainMei extends Mei {

	public ShainMei(InputAttribute inputAttribute, String property, String labelKey) {
		super(inputAttribute, property, labelKey);
	}

	public ShainMei(InputAttribute inputAttribute) {
		super(inputAttribute, "shainMei", "shainMei");
	}

	@Override
	public int length() {
		return CmShainDbm.getInstance().columnShainMei().getColumnSize();
	}

	public static ShainMei of(String val) {
		ShainMei obj = new ShainMei(ARBITRARY);
		obj.setStrictVal(val);
		return obj;
	}
}
