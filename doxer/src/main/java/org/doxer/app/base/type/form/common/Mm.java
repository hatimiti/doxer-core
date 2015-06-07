package org.doxer.app.base.type.form.common;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import java.sql.Time;

import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.util._Time;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.RegexFieldValidator;

/**
 * 2桁(00-59)の時間(分)を表す型
 * @author hatimiti
 *
 */
public class Mm extends SingleFormType {

	public Mm(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer container, String property) {
		new RegexFieldValidator(container) {
			@Override
			protected String getDefaultMessageKey() {
				return "valid.time.mm";
			}
		}.regex("[0-5][0-9]").check(Vval.of(getVal()), property, getLabel());
	}

	@Override
	public int getLength() {
		return 2;
	}

	public Time getValT() {
		return _Time.getFromMm(getVal());
	}

	public static Mm valueOf(String val) {
		Mm obj = new Mm(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

	public static Mm valueOf(Time val) {
		return valueOf(_Time.formatMm(val));
	}
}
