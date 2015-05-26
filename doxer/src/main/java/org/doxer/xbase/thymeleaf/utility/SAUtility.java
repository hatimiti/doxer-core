package org.doxer.xbase.thymeleaf.utility;

import java.util.List;
import java.util.Optional;

import org.doxer.xbase.util._Container;

import com.github.hatimiti.flutist.common.message.AppMessage;
import com.github.hatimiti.flutist.common.message.AppMessages;


public class SAUtility {

	public List<AppMessage> errors() {
		return errors(null);
	}
	
	public List<AppMessage> errors(String property) {
		Optional<AppMessages> messages = _Container.getAppMessagesInRequest();
		if (!messages.isPresent()) {
			return null;
		}
		return messages.get().copyMessageListOf(property);
	}
	
}
