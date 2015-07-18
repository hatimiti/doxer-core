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

	@Condition CmKishRenrakusakiId cmKishRenrakusakiId = new CmKishRenrakusakiId(ARBITRARY);
	@Condition CmKaishaId cmKaishaId = new CmKaishaId(ARBITRARY);
	@Condition TelNo telNo = new TelNo(ARBITRARY);
	@Condition MailAddress mailAddress = new MailAddress(ARBITRARY);
	@Condition RenrakusakiYotoKb renrakusakiYotoKb = new RenrakusakiYotoKb(REQUIRED);

	public CmKishRenrakusakiForm(CmKishRenrakusaki entity) {
		this.copyFrom(entity);
	}

	public void validate(AppMessagesContainer c, String name, int index) {
		this.cmKishRenrakusakiId.validate(c, name, index);
		this.cmKaishaId.validate(c, name, index);
		this.telNo.validate(c, name, index);
		this.mailAddress.validate(c, name, index);
		this.renrakusakiYotoKb.validate(c, name, index);
	}

	@Override
	public void copyFrom(CmKishRenrakusaki entity) {
		this.cmKishRenrakusakiId.setStrictValL(entity.getCmKishRenrakusakiId());
		this.cmKaishaId.setStrictValL(entity.getCmKaishaId());
		this.telNo.setStrictVal(new String[] {
				_Str.asStrOrEmpty(entity.getTelNo1()),
				_Str.asStrOrEmpty(entity.getTelNo2()),
				_Str.asStrOrEmpty(entity.getTelNo3())});
		this.mailAddress.setStrictVal(entity.getMailAddress());
		this.renrakusakiYotoKb.setStrictVal(entity.getRenrakusakiYotoKb());
	}

}
