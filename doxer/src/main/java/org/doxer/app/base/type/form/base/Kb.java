package org.doxer.app.base.type.form.base;

import org.doxer.app.db.dbflute.allcommon.CDef;
import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessageLevel;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.OwnedMessages;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.validation.validator.MaxLengthFieldValidator;

public abstract class Kb<K extends CDef> extends SingleFormType {

	public Kb(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		new MaxLengthFieldValidator(c).max(length()).check(vval(), owner, label(), length());
		if (toKb() == null) {
			c.add(new OwnedMessages(owner(), AppMessageLevel.ERROR, "valid.exists", label()));
		}
	}

	protected abstract K toKb();

}
