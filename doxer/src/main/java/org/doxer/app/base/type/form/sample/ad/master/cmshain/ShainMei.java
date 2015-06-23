package org.doxer.app.base.type.form.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Mei;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmShainDbm;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;

public class ShainMei extends Mei {

	public ShainMei(
			InputAttribute inputAttribute,
			String propertyName,
			String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	public int getLength() {
		return CmShainDbm.getInstance().columnShainMei().getColumnSize();
	}

	public static ShainMei valueOf(String val) {
		ShainMei obj = new ShainMei(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}
}
