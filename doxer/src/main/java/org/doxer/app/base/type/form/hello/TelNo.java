package org.doxer.app.base.type.form.hello;

import org.doxer.xbase.form.type.MultiFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;

public class TelNo extends MultiFormType {

	public TelNo(
			InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	public int length() {
		return 5;
	}

	@Override
	protected int size() {
		return 3;
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
	}

}
