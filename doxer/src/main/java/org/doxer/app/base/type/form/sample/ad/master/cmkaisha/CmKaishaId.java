package org.doxer.app.base.type.form.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.base.Id;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKaishaDbm;
import org.doxer.app.db.dbflute.cbean.CmKaishaCB;
import org.doxer.app.db.dbflute.exbhv.CmKaishaBhv;
import org.doxer.xbase.validation.validator.ExistsFieldValidator;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;


public class CmKaishaId extends Id {

	public CmKaishaId(InputAttribute inputAttribute) {
		super(inputAttribute, "cmKaishaId", "cmKaishaId");
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		super.validateCustom(c, owner);
		if (getValL() != null) {
			CmKaishaCB cb = new CmKaishaCB();
			cb.query().setCmKaishaId_Equal(getValL());
			new ExistsFieldValidator(c, CmKaishaBhv.class, cb).check(vval(), owner, label());
		}
	}

	@Override
	public int length() {
		return CmKaishaDbm.getInstance().columnCmKaishaId().getColumnSize();
	}

	public static CmKaishaId of(String val) {
		CmKaishaId obj = new CmKaishaId(ARBITRARY);
		obj.setStrictVal(val);
		return obj;
	}

}
