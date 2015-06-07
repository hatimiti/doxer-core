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
 * 2桁(00-23)の時間(h)を表す型
 * @author hatimiti
 *
 */
public class Hh extends SingleFormType {

	public Hh(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer container, String property) {
		new RegexFieldValidator(container) {
			protected String getDefaultMessageKey() {
				return "valid.time.hh";
			};
		}.regex("([0-1][0-9]|2[0-3])").check(Vval.of(getVal()), property, getLabel());
	}

	@Override
	public int getLength() {
		return 2;
	}

	public Time getValT() {
		return _Time.getFromHh(getVal());
	}

	public static Hh valueOf(String val) {
		Hh obj = new Hh(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

	public static Hh valueOf(Time val) {
		return valueOf(_Time.formatHh(val));
	}

}
