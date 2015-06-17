package org.doxer.app.base.type.form.sample.ad.master;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKaishaDbm;
import org.doxer.app.db.dbflute.cbean.CmKaishaCB;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;

public class KaishaMeiEn extends KaishaMei {

	public KaishaMeiEn(
			InputAttribute inputAttribute,
			String propertyName,
			String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	public int getLength() {
		return CmKaishaDbm.getInstance().columnKaishaMeiEn().getColumnSize();
	}

	@Override
	protected void setNotExistsMeiColumn(CmKaishaCB cb) {
		cb.query().setKaishaMeiEn_Equal(getVal());
	}

	public static KaishaMeiEn valueOf(String val) {
		KaishaMeiEn obj = new KaishaMeiEn(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}
}
