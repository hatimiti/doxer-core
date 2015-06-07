package org.doxer.app.base.controller;

import org.doxer.xbase.controller.DoxController;

public abstract class BaseMasterController extends DoxController {

	protected void saveRegisterMessage(final Long id) {
		saveMessage(id, "msg.info.complete.register");
	}

	protected void saveUpdateMessage(final Long id) {
		saveMessage(id, "msg.info.complete.update");
	}

	protected void saveReplicateMessage(final Long id) {
		saveMessage(id, "msg.info.complete.replicate");
	}

	protected void saveDeleteMessage(final Long id) {
		saveMessage(id, "msg.info.complete.delete");
	}

	protected void saveMessage(final Long id, final String key) {
		//FIXME
//		ActionMessages messages = new ActionMessages();
//		messages.add(
//				SystemConstants.GLOBAL_MESSAGE,
//				new ActionMessage(key, id));
//		_Container.saveMessageInSession(messages);
	}

}
