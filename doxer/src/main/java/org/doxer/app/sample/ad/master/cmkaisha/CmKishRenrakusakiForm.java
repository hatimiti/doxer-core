package org.doxer.app.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import org.doxer.app.base.type.form.common.MailAddress;
import org.doxer.app.base.type.form.common.TelNo;
import org.doxer.app.base.type.form.sample.ad.master.cmkaisha.CmKaishaId;
import org.doxer.app.base.type.form.sample.ad.master.cmkishrenrakusaki.CmKishRenrakusakiId;
import org.doxer.app.base.type.form.sample.ad.master.cmkishrenrakusaki.RenrakusakiYotoKb;
import org.doxer.app.db.dbflute.exentity.CmKishRenrakusaki;
import org.doxer.xbase.form.BaseEntityForm;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.domain.supports.Condition;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.util._Str;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Component
public class CmKishRenrakusakiForm extends BaseEntityForm<CmKishRenrakusaki> {

	@Condition CmKishRenrakusakiId cmKishRenrakusakiId = new CmKishRenrakusakiId(ARBITRARY, "cmKishRenrakusakiId", "cmKishRenrakusakiId");
	@Condition CmKaishaId cmKaishaId = new CmKaishaId(ARBITRARY, "cmKaishaId", "cmKaishaId");
	@Condition TelNo telNo = new TelNo(ARBITRARY, "telNo", "telNo");
	@Condition MailAddress mailAddress = new MailAddress(ARBITRARY, "mailAddress", "mailAddress");
	@Condition RenrakusakiYotoKb renrakusakiYotoKb = new RenrakusakiYotoKb(REQUIRED, "renrakusakiYotoKb", "renrakusakiYotoKb");

	public CmKishRenrakusakiForm(CmKishRenrakusaki entity) {
		this.copyFrom(entity);
	}

	public void validate(AppMessagesContainer container, String name, int index) {
		this.cmKishRenrakusakiId.validate(container, name, index);
		this.cmKaishaId.validate(container, name, index);
		this.telNo.validate(container, name, index);
		this.mailAddress.validate(container, name, index);
		this.renrakusakiYotoKb.validate(container, name, index);
	}

	@Override
	public void copyFrom(CmKishRenrakusaki entity) {
		this.cmKishRenrakusakiId.setStrictValL(entity.getCmKishRenrakusakiId());
		this.cmKaishaId.setStrictValL(entity.getCmKaishaId());
		this.telNo.setStrictVal(
				_Str.toEmpty(entity.getTelNo1()),
				_Str.toEmpty(entity.getTelNo2()),
				_Str.toEmpty(entity.getTelNo3()));
		this.mailAddress.setStrictVal(entity.getMailAddress());
		this.renrakusakiYotoKb.setStrictVal(entity.getRenrakusakiYotoKb());
	}

}
