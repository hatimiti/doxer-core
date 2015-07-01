package org.doxer.app.base.type.form.common;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKishRenrakusakiDbm;
import org.doxer.xbase.form.type.MultiFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.validation.validator.TelFieldValidator;

public class TelNo extends MultiFormType {

	public TelNo(InputAttribute inputAttribute) {
		super(inputAttribute, "telNo", "telNo");
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		new TelFieldValidator(c).check(vval(), owner, label());
	}

	@Override
	public int length() {
		return CmKishRenrakusakiDbm.getInstance().columnTelNo1().getColumnSize();
	}

	public static TelNo of(String val, String val2, String val3) {
		TelNo obj = new TelNo(ARBITRARY);
		obj.setStrictVal(new String[] {val, val2, val3});
		return obj;
	}

	@Override
	protected int size() {
		return 3;
	}
}
