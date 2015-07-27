package org.doxer.app.base.type.form.common;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Kb;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;

public class Flag extends Kb<org.doxer.app.db.dbflute.allcommon.CDef.Flag> {

	public Flag(InputAttribute inputAttribute, String propertyName) {
		super(inputAttribute, propertyName, propertyName);
	}

	@Override
	public int length() {
		return 1;
	}

	public static Flag of(String val) {
		Flag obj = new Flag(ARBITRARY, "");
		obj.setStrictVal(val);
		return obj;
	}

	public void on() {
		this.setStrictVal(org.doxer.app.db.dbflute.allcommon.CDef.Flag.On.toString());
	}

	public void off() {
		this.setStrictVal(org.doxer.app.db.dbflute.allcommon.CDef.Flag.Off.toString());
	}

	public boolean isOn() {
		return org.doxer.app.db.dbflute.allcommon.CDef.Flag.On == toKb();
	}

	public boolean isOff() {
		return org.doxer.app.db.dbflute.allcommon.CDef.Flag.Off == toKb();
	}

	@Override
	protected org.doxer.app.db.dbflute.allcommon.CDef.Flag toKb() {
		return org.doxer.app.db.dbflute.allcommon.CDef.Flag.codeOf(getVal());
	}

}
