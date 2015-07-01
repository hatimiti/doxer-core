package org.doxer.app.base.type.form.common;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.validation.validator.MaxLengthFieldValidator;

/**
 * 内容データを表す型
 * @author hatimiti
 *
 */
public class Naiyo extends SingleFormType {

	public Naiyo(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		new MaxLengthFieldValidator(c).max(length()).check(vval(), owner, label(), length());
	}

	@Override
	public int length() {
		return 1000;
	}

	public static Naiyo of(String val) {
		Naiyo obj = new Naiyo(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

}
