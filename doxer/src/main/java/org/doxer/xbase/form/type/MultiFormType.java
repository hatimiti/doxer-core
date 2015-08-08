package org.doxer.xbase.form.type;

import com.github.hatimiti.doxer.common.domain.supports.InputAttribute;
import com.github.hatimiti.doxer.common.validation.Vval;

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

	@Override
	public boolean isEmpty() {
		return val == null || val.length == 0;
	}

	protected abstract int size();
}
