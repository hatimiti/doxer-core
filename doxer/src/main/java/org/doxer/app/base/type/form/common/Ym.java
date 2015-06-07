package org.doxer.app.base.type.form.common;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.MaxLengthFieldValidator;
import com.github.hatimiti.flutist.common.validation.validator.YearMonthFieldValidator;

public class Ym extends SingleFormType {

	public Ym(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer container, String property) {
		new MaxLengthFieldValidator(container).max(getLength()).check(Vval.of(getVal()), property, getLabel(), getLength());
		new YearMonthFieldValidator(container).check(Vval.of(getVal()), property, getLabel());
	}

	@Override
	public int getLength() {
		return 6;
	}

	public static Ym valueOf(String val) {
		Ym obj = new Ym(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

}
