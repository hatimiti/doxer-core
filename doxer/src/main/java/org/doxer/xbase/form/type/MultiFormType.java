package org.doxer.xbase.form.type;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.validation.Vval;

public abstract class MultiFormType extends FormType<String[]> {

	public MultiFormType(
			InputAttribute inputAttribute, String propertyName, String labelKey) {
		super(inputAttribute, propertyName, labelKey);
		this.val = new String[size()];
	}

	@Override
	protected final Vval vval() {
		return Vval.of(getVal());
	}

	protected abstract int size();
}
