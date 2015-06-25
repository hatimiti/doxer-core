package org.doxer.app.base.type.form.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import static com.github.hatimiti.flutist.common.util._Obj.*;

import org.doxer.app.base.type.form.base.Mei;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKaishaDbm;
import org.doxer.app.db.dbflute.cbean.CmKaishaCB;
import org.doxer.app.db.dbflute.exbhv.CmKaishaBhv;
import org.doxer.xbase.validation.validator.NotExistsFieldValidator;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.Vval;

public class KaishaMei extends Mei {

	protected CmKaishaId pk;

	public KaishaMei(
			InputAttribute inputAttribute,
			String propertyName,
			String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	public int getLength() {
		return CmKaishaDbm.getInstance().columnKaishaMei().getColumnSize();
	}

	@Override
	protected void validateCustom(AppMessagesContainer container, String property) {
		super.validateCustom(container, property);

		if (isNotEmpty(getVal()) && isNotEmpty(this.pk) && isNotEmpty(this.pk.getVal())) {
			CmKaishaCB cb = new CmKaishaCB();
			cb.query().setKaishaMei_Equal(getVal());
			cb.query().setCmKaishaId_NotEqual(this.pk.getValL());
			new NotExistsFieldValidator(container, CmKaishaBhv.class, cb).check(Vval.of(getVal()), property, getLabel());
		}
	}

	public void validWithUniqueCheck(
			AppMessagesContainer container,
			CmKaishaId pk) {
		this.pk = pk;
		super.validate(container);
	}

	public static KaishaMei valueOf(String val) {
		KaishaMei obj = new KaishaMei(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}
}
