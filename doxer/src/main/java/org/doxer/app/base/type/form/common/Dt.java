package org.doxer.app.base.type.form.common;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import java.util.Date;

import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.util._Date;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.DateFieldValidator;

public class Dt extends SingleFormType {

	public Dt(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer container, String property) {
		new DateFieldValidator(container).check(Vval.of(getVal()), property, getLabel(), "");
	}

	@Override
	public int getLength() {
		return 8;
	}

	public Date getValDt() {
		return _Date.getDate(getVal());
	}

	public static Dt valueOf(String val) {
		Dt obj = new Dt(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

	public static Dt valueOf(Date date) {
		return valueOf(_Date.formatYyyyMmDd(date));
	}

}
