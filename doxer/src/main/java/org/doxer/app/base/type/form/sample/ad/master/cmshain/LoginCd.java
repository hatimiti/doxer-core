package org.doxer.app.base.type.form.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.doxer.app.base.type.form.sample.ad.master.cmkaisha.CmKaishaId;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmShainDbm;
import org.doxer.app.db.dbflute.cbean.CmShainCB;
import org.doxer.app.db.dbflute.exbhv.CmShainBhv;
import org.doxer.xbase.form.type.SingleFormType;
import org.doxer.xbase.validation.validator.NotExistsFieldValidator;

import com.github.hatimiti.flutist.common.domain.supports.InputAttribute;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.validation.validator.HalfSizeAlphanumericValidator;
import com.github.hatimiti.flutist.common.validation.validator.MaxLengthFieldValidator;

public class LoginCd extends SingleFormType {

	public LoginCd(InputAttribute inputAttribute) {
		super(inputAttribute, "loginCd", "loginCd");
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		new MaxLengthFieldValidator(c).max(length()).check(vval(), owner, label());
		new HalfSizeAlphanumericValidator(c).check(vval(), owner, label());
	}

	public void validWithUniqueCheck(
			AppMessagesContainer c,
			CmShainId pk,
			CmKaishaId uniqueKey) {

		validWithUniqueCheck(c, pk, uniqueKey, null, null);
	}

	public void validWithUniqueCheck(
			AppMessagesContainer c,
			CmShainId pk,
			CmKaishaId uniqueKey,
			String name,
			Integer index) {

		super.validate(c);

		CmShainCB cb = new CmShainCB();
		cb.ignoreNullOrEmptyQuery();
		cb.query().setLoginCd_Equal(getVal());
		cb.query().setCmKaishaId_Equal(uniqueKey.getValL());
		cb.query().setCmShainId_NotEqual(pk.getValL());
		new NotExistsFieldValidator(c, CmShainBhv.class, cb).check(vval(), owner(name, index), label());
	}

	@Override
	public int length() {
		return CmShainDbm.getInstance().columnLoginCd().getColumnSize();
	}

	public static LoginCd of(String val) {
		LoginCd obj = new LoginCd(ARBITRARY);
		obj.setStrictVal(val);
		return obj;
	}

}
