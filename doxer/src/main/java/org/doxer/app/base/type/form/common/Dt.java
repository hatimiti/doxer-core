package org.doxer.app.base.type.form.common;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import java.util.Date;

import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.util._Date;
import com.github.hatimiti.flutist.common.validation.validator.DateFieldValidator;

public class Dt extends SingleFormType {

	public Dt(InputAttribute inputAttribute, String property, String labelKey) {
		super(inputAttribute, property, labelKey);
	}

	public Dt(InputAttribute inputAttribute, String property) {
		super(inputAttribute, property, property);
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		new DateFieldValidator(c).check(vval(), owner, label(), "");
	}

	@Override
	public int length() {
		return 8;
	}

	public Date getValDt() {
		return _Date.getDate(getVal());
	}

	public static Dt of(String val) {
		Dt obj = new Dt(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

	public static Dt of(Date date) {
		return of(_Date.formatYyyyMmDd(date));
	}

}
