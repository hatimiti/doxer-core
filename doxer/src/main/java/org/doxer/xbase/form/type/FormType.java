package org.doxer.xbase.form.type;

import static com.github.hatimiti.doxer.common.util._Obj.*;
import static java.lang.String.*;

import java.util.Optional;

import org.doxer.xbase.util._Container;

import com.github.hatimiti.doxer.common.domain.supports.Condition;
import com.github.hatimiti.doxer.common.domain.supports.InputAttribute;
import com.github.hatimiti.doxer.common.domain.type.Type;
import com.github.hatimiti.doxer.common.message.AppMessagesContainer;
import com.github.hatimiti.doxer.common.message.Owner;
import com.github.hatimiti.doxer.common.util._Obj;
import com.github.hatimiti.doxer.common.validation.Vval;
import com.github.hatimiti.doxer.common.validation.validator.RequiredFieldValidator;

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

	public boolean validate(final AppMessagesContainer c) {
		return validate(c, (String) null);
	}

	public boolean validate(final AppMessagesContainer c, final String name) {
		return validate(c, name, (Integer) null);
	}

	public boolean validate(final AppMessagesContainer c, final String name, final Integer idx) {
		int before = c.size();
		validateRequired(c, owner(name, idx));
		validateCustom(c, owner(name, idx));
		int after = c.size();
		return before < after;
	}

	public boolean validateOnlyRequired(final AppMessagesContainer c) {
		return validateOnlyRequired(c, (String) null);
	}

	public boolean validateOnlyRequired(final AppMessagesContainer c, final String name) {
		return validateOnlyRequired(c, name, (Integer) null);
	}

	public boolean validateOnlyRequired(final AppMessagesContainer c, final String name, final Integer idx) {
		int before = c.size();
		validateRequired(c, owner(name, idx));
		int after = c.size();
		return before < after;
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
		return _Container.prop(this.labelKey);
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
