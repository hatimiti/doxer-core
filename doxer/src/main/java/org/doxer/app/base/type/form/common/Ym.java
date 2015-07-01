package org.doxer.app.base.type.form.common;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.validation.validator.MaxLengthFieldValidator;
import com.github.hatimiti.flutist.common.validation.validator.YearMonthFieldValidator;

public class Ym extends SingleFormType {

	public Ym(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		new MaxLengthFieldValidator(c).max(length()).check(vval(), owner, label(), length());
		new YearMonthFieldValidator(c).check(vval(), owner, label());
	}

	@Override
	public int length() {
		return 6;
	}

	public static Ym of(String val) {
		Ym obj = new Ym(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

}
