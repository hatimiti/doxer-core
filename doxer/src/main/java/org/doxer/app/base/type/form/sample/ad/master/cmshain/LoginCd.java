package org.doxer.app.base.type.form.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import static com.github.hatimiti.flutist.common.util._Obj.*;
import lombok.val;

import org.doxer.app.base.type.form.sample.ad.master.cmkaisha.CmKaishaId;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmShainDbm;
import org.doxer.app.db.dbflute.cbean.CmShainCB;
import org.doxer.app.db.dbflute.exbhv.CmShainBhv;
import org.doxer.xbase.form.type.SingleFormType;
import org.doxer.xbase.validation.validator.NotExistsFieldValidator;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.HalfSizeAlphanumericValidator;
import com.github.hatimiti.flutist.common.validation.validator.MaxLengthFieldValidator;

public class LoginCd extends SingleFormType {

	protected CmShainId pk;
	protected CmKaishaId uniqueKey;

	public LoginCd(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, String owner) {

		val vval = Vval.of(getVal());

		new MaxLengthFieldValidator(c).max(getLength()).check(vval, owner, getLabel());
		new HalfSizeAlphanumericValidator(c).check(vval, owner, getLabel());

		if (isNotEmpty(this.uniqueKey) && isNotEmpty(this.uniqueKey.getVal())) {
			CmShainCB cb = new CmShainCB();
			cb.ignoreNullOrEmptyQuery();
			cb.query().setLoginCd_Equal(getVal());
			cb.query().setCmKaishaId_Equal(this.uniqueKey.getValL());
			cb.query().setCmShainId_NotEqual(this.pk.getValL());
			new NotExistsFieldValidator(c, CmShainBhv.class, cb).check(vval, owner, getLabel());
		}
	}

	public void validWithUniqueCheck(
			AppMessagesContainer container,
			CmShainId pk,
			CmKaishaId uniqueKey) {
		this.pk = pk;
		this.uniqueKey = uniqueKey;
		super.validate(container);
	}

	@Override
	public int getLength() {
		return CmShainDbm.getInstance().columnLoginCd().getColumnSize();
	}

	public static LoginCd valueOf(String val) {
		LoginCd obj = new LoginCd(ARBITRARY, "", "");
		obj.setStrictVal(val);
		return obj;
	}

}
