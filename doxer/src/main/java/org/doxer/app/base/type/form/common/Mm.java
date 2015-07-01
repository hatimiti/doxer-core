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
 * 2桁(00-59)の時間(分)を表す型
 * @author hatimiti
 *
 */
public class Mm extends SingleFormType {

	public Mm(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		new RegexFieldValidator(c) {
			@Override
			protected String getDefaultMessageKey() {
				return "valid.time.mm";
			}
		}.regex("[0-5][0-9]").check(vval(), owner, label());
	}

	@Override
	public int length() {
		return 2;
	}

	public Time getValT() {
		return _Time.getFromMm(getVal());
	}

	public static Mm of(String val) {
		Mm obj = new Mm(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

	public static Mm of(Time val) {
		return of(_Time.formatMm(val));
	}
}
