package org.doxer.xbase.form.type;

import com.github.hatimiti.doxer.common.domain.supports.InputAttribute;
import com.github.hatimiti.doxer.common.validation.Vval;

public abstract class SingleFormType extends FormType<String> {

	public SingleFormType(
			InputAttribute inputAttribute, String propertyName, String labelKey) {
		super(inputAttribute, propertyName, labelKey);
		this.val = "";
	}

	/**
	 * フレームワークが呼び出します。
	 * アプリケーション側からの呼び出しは非推奨です。
	 * @param val
	 */
	@Deprecated
	public final void setVal(String val) {
		this.val = val;
	}

	public final SingleFormType temporary(String val) {
		setVal(val);
		return this;
	}

	@Override
	protected final Vval vval() {
		return Vval.of(getVal());
	}

	@Override
	public boolean isEmpty() {
		return val == null || val.isEmpty();
	}

}
