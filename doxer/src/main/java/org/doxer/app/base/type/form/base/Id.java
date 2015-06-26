package org.doxer.app.base.type.form.base;

import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.util._Num;
import com.github.hatimiti.flutist.common.util._Str;
import com.github.hatimiti.flutist.common.validation.validator.LongFieldValidator;
import com.github.hatimiti.flutist.common.validation.validator.MaxLengthFieldValidator;

public abstract class Id extends SingleFormType {

	public Id(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	public Long getValL() {
		return _Num.toL_Null(this.val);
	}

	public void setStrictValL(Long val) {
		setStrictVal(_Str.toNullIfEmpty(val));
	}

	@Override
	protected void validateCustom(AppMessagesContainer c) {
		new MaxLengthFieldValidator(c).max(length()).check(vval(), owner(), label(), length());
		new LongFieldValidator(c).check(vval(), owner(), label());
	}

}
