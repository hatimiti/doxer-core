package org.doxer.app.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import static com.github.hatimiti.flutist.common.message.AppMessageLevel.*;
import static com.github.hatimiti.flutist.common.util._Obj.*;
import static java.util.stream.IntStream.*;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.doxer.app.base.type.form.sample.ad.master.cmkaisha.CmKaishaId;
import org.doxer.app.base.type.form.sample.ad.master.cmkaisha.KaishaMei;
import org.doxer.app.base.type.form.sample.ad.master.cmkaisha.KaishaMeiEn;
import org.doxer.app.base.type.sample.ad.master.CmKishTesuryoFormList;
import org.doxer.app.db.dbflute.allcommon.CDef.Mode;
import org.doxer.app.db.dbflute.allcommon.CDef.TesuryoKb;
import org.doxer.app.db.dbflute.exentity.CmKaisha;
import org.doxer.xbase.form.BaseEntityForm;
import org.doxer.xbase.validation.validator.FormValidator;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.domain.supports.Condition;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.OwnedMessages;
import com.github.hatimiti.flutist.common.message.Owner;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class CmKaishaForm extends BaseEntityForm<CmKaisha> {

	@Condition CmKaishaId cmKaishaId = new CmKaishaId(CONDITION);
	@Condition KaishaMei kaishaMei = new KaishaMei(REQUIRED);
	@Condition KaishaMeiEn kaishaMeiEn = new KaishaMeiEn(ARBITRARY);
	@Condition CmKishTesuryoForm cmKishTesuryoForm;
	@Condition(session = true) List<CmKishRenrakusakiForm> cmKishRenrakusakiForms;

//	@Session
	Mode mode;
//	@Session
	CmKishTesuryoFormList cmKishTesuryoForms;

	class Validate implements FormValidator {
		@Override
		public void validate(AppMessagesContainer c) {
			cmKaishaId.validate(c);
			kaishaMei.validWithUniqueCheck(c, cmKaishaId);
			kaishaMeiEn.validWithUniqueCheck(c, cmKaishaId);

			// 手数料必須チェック
			if (isEmpty(cmKishTesuryoForms)) {
				c.add(new OwnedMessages(Owner.of("cmKishTesuryoForm"), ERROR,
						"valid.required", "vers.kaishaTesuryo"));
			}

			// 連絡先
			range(0, cmKishRenrakusakiForms.size()).forEach(
					i -> get(cmKishRenrakusakiForms, i)
						.validate(c, "cmKishRenrakusakiForms", i));
		}
	}

	class ValidAddTesuryo implements FormValidator {
		@Override
		public void validate(AppMessagesContainer container) {
			cmKishTesuryoForm.validate(container, "cmKishTesuryoForm");
		}
	}

	class ValidId implements FormValidator {
		@Override
		public void validate(AppMessagesContainer container) {
			cmKaishaId.inCompleteRequired().validate(container);
		}
	}

	public void copyFrom(CmKaisha entity) {
		this.cmKaishaId.setStrictValL(entity.getCmKaishaId());
		this.kaishaMei.setStrictVal(entity.getKaishaMei());
		this.kaishaMeiEn.setStrictVal(entity.getKaishaMeiEn());
		this.versionNo = entity.getVersionNo();
	}

	public void clearCmKishTesuryoFormByDefault() {
		this.cmKishTesuryoForm = createDefaultCmKishTesuryoForm();
	}

	private CmKishTesuryoForm createDefaultCmKishTesuryoForm() {
		CmKishTesuryoForm form = new CmKishTesuryoForm();
		form.tesuryoKb.setStrictVal(TesuryoKb.Percent.toString());
		return form;
	}

}
