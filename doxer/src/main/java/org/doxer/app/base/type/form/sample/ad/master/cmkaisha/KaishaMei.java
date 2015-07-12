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

public class KaishaMei extends Mei {

	public KaishaMei(InputAttribute inputAttribute) {
		super(inputAttribute, "kaishaMei", "kaishaMei");
	}

	public KaishaMei(InputAttribute inputAttribute, String property, String labelKey) {
		super(inputAttribute, property, labelKey);
	}

	@Override
	public int length() {
		return CmKaishaDbm.getInstance().columnKaishaMei().getColumnSize();
	}

	public void validWithUniqueCheck(AppMessagesContainer c, CmKaishaId pk) {

		super.validate(c);

		if (isNotEmpty(getVal())) {
			CmKaishaCB cb = new CmKaishaCB();
			cb.ignoreNullOrEmptyQuery();
			cb.query().setKaishaMei_Equal(getVal());
			cb.query().setCmKaishaId_NotEqual(pk.getValL());
			new NotExistsFieldValidator(c, CmKaishaBhv.class, cb).check(vval(), owner(), label());
		}
	}

	public static KaishaMei of(String val) {
		KaishaMei obj = new KaishaMei(ARBITRARY);
		obj.setStrictVal(val);
		return obj;
	}
}
