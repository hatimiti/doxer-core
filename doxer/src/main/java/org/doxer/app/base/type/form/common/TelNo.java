package org.doxer.app.base.type.form.common;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKishRenrakusakiDbm;
import org.doxer.xbase.form.type.MultiFormType;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.TelFieldValidator;

public class TelNo extends MultiFormType {

	public TelNo(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer container, String property) {
		new TelFieldValidator(container).check(Vval.of(getVal()), property, getLabel());
	}

	public void setStrictVal(String val, String val2, String val3) {
		String[] tmp = this.val;
		this.val = new String[] {val, val2, val3};
		if (!isValidVal()) {
			this.val = tmp;
			throw new IllegalStateException("ドメイン型に適した値ではありません。");
		}
	}

	@Override
	public int getLength() {
		return CmKishRenrakusakiDbm.getInstance().columnTelNo1().getColumnSize();
	}

	public static TelNo valueOf(String val, String val2, String val3) {
		TelNo obj = new TelNo(ARBITRARY, "", "");
		obj.val = new String[] {val, val2, val3};
		obj.checkValidVal();
		return obj;
	}

	@Override
	protected int size() {
		return 3;
	}
}
