package org.doxer.app.base.type.form.base;

import org.doxer.app.db.dbflute.allcommon.CDef;
import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessageLevel;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.OwnedMessages;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.MaxLengthFieldValidator;

public abstract class Kb<K extends CDef> extends SingleFormType {

	public Kb(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer container, String property) {
		new MaxLengthFieldValidator(container).max(getLength()).check(Vval.of(getVal()), property, getLabel(), getLength());
		if (toKb() == null) {
			container.add(new OwnedMessages(property, AppMessageLevel.ERROR, "valid.exists", getLabel()));
		}
	}

	protected abstract K toKb();

}
