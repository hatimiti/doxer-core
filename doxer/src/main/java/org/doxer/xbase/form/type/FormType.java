package org.doxer.xbase.form.type;

import static com.github.hatimiti.flutist.common.util._Obj.*;

import java.util.Optional;

import org.doxer.xbase.util._Container;

import com.github.hatimiti.flutist.common.domain.supports.Condition;
import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.domain.type.Type;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.util._Obj;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.RequiredFieldValidator;

public abstract class FormType<T> extends Type<T> {

	@Condition
	protected T val;

	protected InputAttribute inputAttribute;
	protected String propertyName;
	protected String labelKey;

	protected boolean isRequiredCheckTarget;

	public FormType(
			final InputAttribute inputAttribute,
			final String propertyName,
			final String label) {

		if (_Obj.isEmpty(propertyName)
				|| _Obj.isEmpty(label)) {
			 throw new IllegalArgumentException("propertyName and label are required.");
		}

		this.inputAttribute = inputAttribute;
		this.propertyName = propertyName;
		this.labelKey = label;

		if (eq(InputAttribute.REQUIRED, inputAttribute)) {
			this.isRequiredCheckTarget = true;
		}
	}

	@Override
	public T getVal() {
		return this.val;
	}

	public void setStrictVal(final T val) {
		T tmp = this.val;
		this.val = val;
		if (!isValidVal()) {
			this.val = tmp;
			throw new IllegalStateException("ドメイン型に適した値ではありません。");
		}
	}

	public void validate(final AppMessagesContainer container) {
		validate(container, (String) null, (Integer) null);
	}

	public void validate(final AppMessagesContainer container, final String name) {
		validate(container, name, (Integer) null);
	}

	public void validate(final AppMessagesContainer container, final String name, final Integer idx) {
		if (this.isRequiredCheckTarget) {
			new RequiredFieldValidator(container).check(vval(), getProperty(name, idx), getLabel());
		}
		validateCustom(container, getProperty(name, idx));
	}

	protected String getProperty(final String name, final Integer idx) {

		StringBuilder pn = new StringBuilder();
		if (isNotEmpty(name)) {
			pn.append(name);
		}
		if (isNotEmpty(idx)) {
			pn.append("[" + idx + "]");
		}
		if (isNotEmpty(name) || isNotEmpty(idx)) {
			pn.append(".");
		}

		pn.append(this.propertyName + ".val");
		return pn.toString();
	}

	protected void checkValidVal() {
		if (!isValidVal()) {
			throw new IllegalStateException("ドメイン型に適した値ではありません。");
		}
	}

	protected boolean isValidVal() {
		AppMessagesContainer container = new AppMessagesContainer();
		validateCustom(container, "");
		return container.isEmpty();
	}

	public FormType<T> inCompleteRequiredCondition() {

		if (ne(InputAttribute.CONDITION, this.inputAttribute)) {
			throw new IllegalStateException("InputAttribute.CONDITIONの場合のみ呼び出しが可能です。");
		}

		this.isRequiredCheckTarget = true;
		return this;
	}

	public FormType<T> notInCompleteRequiredCondition() {

		if (ne(InputAttribute.CONDITION, this.inputAttribute)) {
			throw new IllegalStateException("InputAttribute.CONDITIONの場合のみ呼び出しが可能です。");
		}

		this.isRequiredCheckTarget = false;
		return this;
	}

	protected String getLabel() {
		return _Container.buildMessage(this.labelKey);
	}

	public abstract int getLength();
	protected abstract Vval vval();
	protected abstract void validateCustom(AppMessagesContainer container, String propertyName);

	@Override
	public String toString() {
		return Optional.ofNullable(getVal()).map(Object::toString).orElse("");
	}

}
