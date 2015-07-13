package org.doxer.app.base.controller;

import static com.github.hatimiti.flutist.common.message.AppMessageLevel.*;

import org.doxer.xbase.controller.DoxController;
import org.doxer.xbase.util._Container;

import com.github.hatimiti.flutist.common.message.AppMessage;

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
		_Container.addMessage(new AppMessage(INFO, key, id));
	}

}
