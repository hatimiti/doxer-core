package org.doxer.app.base.type.form.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Mei;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmShainDbm;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;

public class ShainSei extends Mei {

	public ShainSei(
			InputAttribute inputAttribute,
			String propertyName,
			String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	public int getLength() {
		return CmShainDbm.getInstance().columnShainSei().getColumnSize();
	}

	public static ShainSei valueOf(String val) {
		ShainSei obj = new ShainSei(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}
}
