package org.doxer.app.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import static com.github.hatimiti.flutist.common.message.AppMessageLevel.*;
import static com.github.hatimiti.flutist.common.util._Obj.*;
import static java.util.stream.IntStream.*;

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
import com.github.hatimiti.flutist.common.message.OwnedMessages;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class CmKaishaForm extends BaseEntityForm<CmKaisha> {

	@Condition CmKaishaId cmKaishaId = new CmKaishaId(CONDITION, "cmKaishaId", "cmKaishaId");
	@Condition KaishaMei kaishaMei = new KaishaMei(REQUIRED, "kaishaMei", "kaishaMei");
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
		if (isEmpty(this.cmKishTesuryoForms)) {
			container.add(new OwnedMessages("cmKishTesuryoForm", ERROR, "valid.required", "vers.kaishaTesuryo"));
		}

		// 連絡先
		range(0, this.cmKishRenrakusakiForms.size())
			.forEach(i -> get(this.cmKishRenrakusakiForms, i)
					.validate(container, "cmKishRenrakusakiForms", i));

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
