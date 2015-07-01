package org.doxer.app.base.type.form.hello;

import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;

public class Val extends SingleFormType {

	public Val(InputAttribute inputAttribute) {
		super(inputAttribute, "val", "val");
	}

	@Override
	public int length() {
		return 10;
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
	}
}
