package org.doxer.app.base.type.form.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import lombok.val;

import org.doxer.app.db.dbflute.bsentity.dbmeta.CmShainDbm;
import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.ContainsCharsFieldValidator;
import com.github.hatimiti.flutist.common.validation.validator.HalfSizeFieldValidator;
import com.github.hatimiti.flutist.common.validation.validator.RangeLengthFieldValidator;

public class Password extends SingleFormType {

	public Password(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, String owner) {
		val vval = Vval.of(getVal());

		new RangeLengthFieldValidator(c).range(8, getLength()).check(vval, owner, getLabel(), 8, getLength());
		new HalfSizeFieldValidator(c).check(vval, owner, getLabel());
		new ContainsCharsFieldValidator(c).chars('@', '.', '$', '+').check(vval, owner, getLabel(), "(@/./$/+)");
	}

	@Override
	public int getLength() {
		return CmShainDbm.getInstance().columnPassword().getColumnSize();
	}

	public static Password valueOf(String val) {
		Password obj = new Password(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

}
