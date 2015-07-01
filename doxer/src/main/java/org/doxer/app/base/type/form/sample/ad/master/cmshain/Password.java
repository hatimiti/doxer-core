package org.doxer.app.base.type.form.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.db.dbflute.bsentity.dbmeta.CmShainDbm;
import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.validation.validator.ContainsCharsFieldValidator;
import com.github.hatimiti.flutist.common.validation.validator.HalfSizeFieldValidator;
import com.github.hatimiti.flutist.common.validation.validator.RangeLengthFieldValidator;

public class Password extends SingleFormType {

	public Password(InputAttribute inputAttribute) {
		super(inputAttribute, "password", "password");
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		new RangeLengthFieldValidator(c).range(8, length()).check(vval(), owner, label(), 8, length());
		new HalfSizeFieldValidator(c).check(vval(), owner, label());
		new ContainsCharsFieldValidator(c).chars('@', '.', '$', '+').check(vval(), owner, label(), "(@/./$/+)");
	}

	@Override
	public int length() {
		return CmShainDbm.getInstance().columnPassword().getColumnSize();
	}

	public static Password of(String val) {
		Password obj = new Password(ARBITRARY);
		obj.setStrictVal(val);
		return obj;
	}

}
