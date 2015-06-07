package org.doxer.app.base.type.form.common;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.Vval;
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
	protected void validateCustom(AppMessagesContainer container, String property) {
		new MaxLengthFieldValidator(container).max(getLength()).check(Vval.of(getVal()), property, getLabel(), getLength());
	}

	@Override
	public int getLength() {
		return 1000;
	}

	public static Naiyo valueOf(String val) {
		Naiyo obj = new Naiyo(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

}
