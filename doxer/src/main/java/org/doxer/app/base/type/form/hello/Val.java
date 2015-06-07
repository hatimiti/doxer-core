package org.doxer.app.base.type.form.hello;

import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;

public class Val extends SingleFormType {

	public Val(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	public int getLength() {
		return 10;
	}

	@Override
	protected void validateCustom(
			AppMessagesContainer container,
			String propertyName) {
	}
}
