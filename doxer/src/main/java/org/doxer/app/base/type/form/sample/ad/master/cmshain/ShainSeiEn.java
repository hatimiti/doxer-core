package org.doxer.app.base.type.form.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Mei;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmShainDbm;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.validation.validator.HalfSizeFieldValidator;

public class ShainSeiEn extends Mei {

	public ShainSeiEn(InputAttribute inputAttribute) {
		super(inputAttribute, "shainSeiEn", "shainSeiEn");
	}

	@Override
	public int length() {
		return CmShainDbm.getInstance().columnShainSeiEn().getColumnSize();
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		super.validateCustom(c, owner);
		new HalfSizeFieldValidator(c).check(vval(), owner, label());
	}

	public static ShainSeiEn of(String val) {
		ShainSeiEn obj = new ShainSeiEn(ARBITRARY);
		obj.setStrictVal(val);
		return obj;
	}
}
