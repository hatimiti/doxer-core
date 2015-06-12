package org.doxer.xbase.validation.validator;

import com.github.hatimiti.flutist.common.message.AppMessagesContainer;

@FunctionalInterface
public interface FormValidator {
	void validate(AppMessagesContainer c);
}
