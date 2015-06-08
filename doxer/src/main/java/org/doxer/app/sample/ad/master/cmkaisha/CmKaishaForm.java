package org.doxer.app.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.doxer.app.base.type.form.sample.ad.master.CmKaishaId;
import org.doxer.app.base.type.form.sample.ad.master.KaishaMei;
import org.doxer.app.base.type.sample.ad.master.CmKishTesuryoFormList;
import org.doxer.app.db.dbflute.allcommon.CDef.Mode;
import org.doxer.app.db.dbflute.allcommon.CDef.TesuryoKb;
import org.doxer.app.db.dbflute.exentity.CmKaisha;
import org.doxer.xbase.form.BaseEntityForm;
import org.doxer.xbase.support.Condition;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.message.AppMessagesContainer;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class CmKaishaForm extends BaseEntityForm<CmKaisha> {

	@Condition CmKaishaId cmKaishaId = new CmKaishaId(CONDITION, "cmKaishaId", "会社ID");
	@Condition KaishaMei kaishaMei = new KaishaMei(REQUIRED, "kaishaMei", "会社名");
	@Condition CmKishTesuryoForm cmKishTesuryoForm;
	@Condition(session = true) List<CmKishRenrakusakiForm> cmKishRenrakusakiForms;

//	@Session
	Mode mode;
//	@Session
	CmKishTesuryoFormList cmKishTesuryoForms;

	@Override
	public void validate(AppMessagesContainer container) {
		this.cmKaishaId.validate(container);
		this.kaishaMei.validWithUniqueCheck(container, this.cmKaishaId);

		// 手数料必須チェック
//		new RequiredFieldValidator(container).check(
//				this.cmKishTesuryoForms, "cmKishTesuryoForm", "vers.kaishaTesuryo");

		// 連絡先
//		for (int i = 0; i < this.cmKishRenrakusakiForms.size(); i++) {
//			errors.add(get(this.cmKishRenrakusakiForms, i)
//					.valid("cmKishRenrakusakiForms", i));
//		}

	}

	/**
	 * 手数料追加時の入力チェック
	 */
	public void validAddTesuryo(AppMessagesContainer container) {
		this.cmKishTesuryoForm.validate(container, "cmKishTesuryoForm");
	}

	public void validId(AppMessagesContainer container) {
//		this.cmKaishaId.inCompleteRequiredCondition().validate(container);
	}

	@Override
	public void copyToEntity(CmKaisha entity) {
		//TODO verNoもコピーの必要有り
		entity.setKaishaMei(this.kaishaMei.getVal());
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
