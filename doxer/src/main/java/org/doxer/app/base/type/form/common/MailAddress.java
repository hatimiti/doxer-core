package org.doxer.app.base.type.form.common;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKishRenrakusakiDbm;
import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.validation.validator.EMailFieldValidator;
import com.github.hatimiti.flutist.common.validation.validator.MaxLengthFieldValidator;

public class MailAddress extends SingleFormType {

	public MailAddress(InputAttribute inputAttribute) {
		super(inputAttribute, "mailAddress", "mailAddress");
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		new MaxLengthFieldValidator(c).max(length()).check(vval(), owner, label(), length());
		new EMailFieldValidator(c).check(vval(), owner, label());
	}

	@Override
	public int length() {
		return CmKishRenrakusakiDbm.getInstance().columnMailAddress().getColumnSize();
	}

	public static MailAddress of(String val) {
		MailAddress obj = new MailAddress(ARBITRARY);
		obj.setStrictVal(val);
		return obj;
	}

}
