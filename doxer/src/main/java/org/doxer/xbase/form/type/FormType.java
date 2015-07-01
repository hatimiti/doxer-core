package org.doxer.xbase.form.type;

import static com.github.hatimiti.flutist.common.util._Obj.*;
import static java.lang.String.*;

import java.util.Optional;

import org.doxer.xbase.util._Container;

import com.github.hatimiti.flutist.common.domain.supports.Condition;
import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.domain.type.Type;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.util._Obj;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.RequiredFieldValidator;

public abstract class FormType<T> extends Type<T> {

	@Condition
	protected T val;

	private InputAttribute inputAttribute;
	private String property;
	private String labelKey;

	protected boolean isRequiredCheckTarget;

	public FormType(
			final InputAttribute inputAttribute,
			final String property,
			final String labelKey) {

		if (_Obj.isEmpty(property)
				|| _Obj.isEmpty(labelKey)) {
			 throw new IllegalArgumentException("property and labelKey are required.");
		}

		this.inputAttribute = inputAttribute;
		this.property = property;
		this.labelKey = labelKey;

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
			throw new IllegalStateException(format("[%s]の値[%s]はドメイン型に適した値ではありません。",
					this.getClass().getName(),
					this.toString()));
		}
	}

	public void validate(final AppMessagesContainer c) {
		validate(c, (String) null);
	}

	public void validate(final AppMessagesContainer c, final String name) {
		validate(c, name, (Integer) null);
	}

	public void validate(final AppMessagesContainer c, final String name, final Integer idx) {
		validateRequired(c, owner(name, idx));
		validateCustom(c, owner(name, idx));
	}

	public void validateOnlyRequired(final AppMessagesContainer c) {
		validateOnlyRequired(c, (String) null);
	}

	public void validateOnlyRequired(final AppMessagesContainer c, final String name) {
		validateOnlyRequired(c, name, (Integer) null);
	}

	public void validateOnlyRequired(final AppMessagesContainer c, final String name, final Integer idx) {
		validateRequired(c, owner(name, idx));
	}

	public FormType<T> inCompleteRequired() {

		if (ne(InputAttribute.CONDITION, this.inputAttribute)) {
			throw new IllegalStateException("InputAttribute.CONDITIONの場合のみ呼び出しが可能です。");
		}

		this.isRequiredCheckTarget = true;
		return this;
	}

	public FormType<T> notInCompleteRequired() {

		if (ne(InputAttribute.CONDITION, this.inputAttribute)) {
			throw new IllegalStateException("InputAttribute.CONDITIONの場合のみ呼び出しが可能です。");
		}

		this.isRequiredCheckTarget = false;
		return this;
	}

	private void validateRequired(final AppMessagesContainer c, Owner owner) {
		if (this.isRequiredCheckTarget) {
			new RequiredFieldValidator(c).check(vval(), owner, label());
		}
	}

	protected Owner owner() {
		return owner((String) null);
	}

	protected Owner owner(final String name) {
		return owner(name, (Integer) null);
	}

	protected Owner owner(final String name, final Integer idx) {
		return Owner.of(property, name, idx);
	}

	private boolean isValidVal() {
		AppMessagesContainer container = new AppMessagesContainer();
		validateCustom(container, Owner.empty());
		return container.isEmpty();
	}

	protected String label() {
		return _Container.buildMessage(this.labelKey);
	}

	public abstract int length();
	public abstract boolean isEmpty();
	protected abstract Vval vval();
	protected abstract void validateCustom(AppMessagesContainer c, Owner owner);

	@Override
	public String toString() {
		return Optional.ofNullable(getVal()).map(Object::toString).orElse("");
	}

}
