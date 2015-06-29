package org.doxer.xbase.thymeleaf.utility;

import java.util.List;

import org.doxer.xbase.util._Container;


public class SAUtility {

	public List<String> allMessages() {
		return _Container.getAllMessages();
	}

	public List<String> globalMessages() {
		return _Container.getGlobalMessages();
	}

	public List<String> messagesOf(String owner) {
		return _Container.getParsedOwnedMessages(owner);
	}

	public List<String>  messagesOfPrefix(String ownerPrefix) {
		return _Container.getParsedOwnedMessagesByOwnerPrefix(ownerPrefix);
	}

}
