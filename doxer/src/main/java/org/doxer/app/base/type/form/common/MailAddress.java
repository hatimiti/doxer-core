package org.doxer.app.base.type.form.common;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKishRenrakusakiDbm;
import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.EMailFieldValidator;
import com.github.hatimiti.flutist.common.validation.validator.MaxLengthFieldValidator;

public class MailAddress extends SingleFormType {

	public MailAddress(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer container, String property) {
		new MaxLengthFieldValidator(container).max(getLength()).check(Vval.of(getVal()), property, getLabel(), getLength());
		new EMailFieldValidator(container).check(Vval.of(getVal()), property, getLabel());
	}

	@Override
	public int getLength() {
		return CmKishRenrakusakiDbm.getInstance().columnMailAddress().getColumnSize();
	}

	public static MailAddress valueOf(String val) {
		MailAddress obj = new MailAddress(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

}
