package org.doxer.app.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.doxer.app.base.type.form.base.Mei;
import org.doxer.app.base.type.form.sample.ad.master.cmkaisha.CmKaishaId;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.CmShainId;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.LoginCd;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.Password;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.ShainMei;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.ShainMeiEn;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.ShainSei;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.ShainSeiEn;
import org.doxer.app.db.dbflute.allcommon.CDef.Mode;
import org.doxer.app.db.dbflute.exentity.CmShain;
import org.doxer.xbase.form.BaseEntityForm;
import org.doxer.xbase.validation.validator.FormValidator;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.domain.supports.Condition;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class CmShainForm extends BaseEntityForm<CmShain> {

	@Condition CmShainId cmShainId = new CmShainId(CONDITION);
	@Condition CmKaishaId cmKaishaId = new CmKaishaId(REQUIRED);
	@Condition Mei shainSei = new ShainSei(REQUIRED);
	@Condition Mei shainMei = new ShainMei(REQUIRED);
	@Condition Mei shainSeiEn = new ShainSeiEn(ARBITRARY);
	@Condition Mei shainMeiEn = new ShainMeiEn(ARBITRARY);

	@Condition LoginCd loginCd = new LoginCd(REQUIRED);
	@Condition Password password = new Password(REQUIRED);

//	@Session
	Mode mode;

	class Validate implements FormValidator {
		@Override
		public void validate(AppMessagesContainer c) {
			cmShainId.validate(c);
			cmKaishaId.validate(c);
			shainSei.validate(c);
			shainMei.validate(c);
			shainSeiEn.validate(c);
			shainMeiEn.validate(c);
			loginCd.validWithUniqueCheck(c, cmShainId, cmKaishaId);
			password.validate(c);
		}
	}

	class ValidId implements FormValidator {
		@Override
		public void validate(AppMessagesContainer container) {
			cmShainId.inCompleteRequired().validate(container);
		}
	}

	@Override
	public void copyFrom(CmShain entity) {
		this.cmShainId.setStrictValL(entity.getCmShainId());
		this.cmKaishaId.setStrictValL(entity.getCmKaishaId());
		this.shainSei.setStrictVal(entity.getShainSei());
		this.shainMei.setStrictVal(entity.getShainMei());
		this.shainSeiEn.setStrictVal(entity.getShainSeiEn());
		this.shainMeiEn.setStrictVal(entity.getShainMeiEn());
		this.loginCd.setStrictVal(entity.getLoginCd());
		this.password.setStrictVal(entity.getPassword());
		this.versionNo = entity.getVersionNo();
	}

}
