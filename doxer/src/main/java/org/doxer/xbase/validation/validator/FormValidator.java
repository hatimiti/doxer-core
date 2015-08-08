package org.doxer.xbase.validation.validator;

import com.github.hatimiti.doxer.common.message.AppMessagesContainer;

@FunctionalInterface
public interface FormValidator {
	void validate(AppMessagesContainer c) throws Exception;
}
