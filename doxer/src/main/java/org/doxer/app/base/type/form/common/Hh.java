package org.doxer.app.base.type.form.common;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import java.sql.Time;

import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.util._Time;
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
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		new RegexFieldValidator(c) {
			protected String getDefaultMessageKey() {
				return "valid.time.hh";
			};
		}.regex("([0-1][0-9]|2[0-3])").check(vval(), owner, label());
	}

	@Override
	public int length() {
		return 2;
	}

	public Time getValT() {
		return _Time.getFromHh(getVal());
	}

	public static Hh of(String val) {
		Hh obj = new Hh(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

	public static Hh of(Time val) {
		return of(_Time.formatHh(val));
	}

}
