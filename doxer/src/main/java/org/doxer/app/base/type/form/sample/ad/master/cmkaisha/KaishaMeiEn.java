package org.doxer.app.base.type.form.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKaishaDbm;
import org.doxer.app.db.dbflute.cbean.CmKaishaCB;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.validator.HalfSizeFieldValidator;

public class KaishaMeiEn extends KaishaMei {

	public KaishaMeiEn(InputAttribute inputAttribute) {
		super(inputAttribute, "kaishaMeiEn", "kaishaMeiEn");
	}

	@Override
	protected void validateCustom(AppMessagesContainer c) {
		new HalfSizeFieldValidator(c).check(vval(), owner(), label());
		super.validateCustom(c);
	}

	@Override
	public int length() {
		return CmKaishaDbm.getInstance().columnKaishaMeiEn().getColumnSize();
	}

	protected void setNotExistsMeiColumn(CmKaishaCB cb) {
		cb.query().setKaishaMeiEn_Equal(getVal());
	}

	public static KaishaMeiEn of(String val) {
		KaishaMeiEn obj = new KaishaMeiEn(ARBITRARY);
		obj.setStrictVal(val);
		return obj;
	}
}