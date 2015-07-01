package org.doxer.app.base.type.form.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Mei;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmShainDbm;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.validation.validator.HalfSizeFieldValidator;

public class ShainMeiEn extends Mei {

	public ShainMeiEn(InputAttribute inputAttribute) {
		super(inputAttribute, "shainMeiEn", "shainMeiEn");
	}

	@Override
	public int length() {
		return CmShainDbm.getInstance().columnShainMeiEn().getColumnSize();
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		new HalfSizeFieldValidator(c).check(vval(), owner, label());
		super.validateCustom(c, owner);
	}

	public static ShainMeiEn of(String val) {
		ShainMeiEn obj = new ShainMeiEn(ARBITRARY);
		obj.setStrictVal(val);
		return obj;
	}
}
