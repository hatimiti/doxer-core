package org.doxer.app.base.type.form.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Mei;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmShainDbm;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.HalfSizeFieldValidator;

public class ShainSeiEn extends Mei {

	public ShainSeiEn(
			InputAttribute inputAttribute,
			String propertyName,
			String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	public int getLength() {
		return CmShainDbm.getInstance().columnShainSeiEn().getColumnSize();
	}

	@Override
	protected void validateCustom(AppMessagesContainer container,
			String property) {
		new HalfSizeFieldValidator(container).check(Vval.of(getVal()), property, getLabel());
		super.validateCustom(container, property);
	}

	public static ShainSeiEn valueOf(String val) {
		ShainSeiEn obj = new ShainSeiEn(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}
}
