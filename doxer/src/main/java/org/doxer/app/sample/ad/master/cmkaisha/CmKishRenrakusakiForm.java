package org.doxer.app.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.doxer.app.base.type.form.common.MailAddress;
import org.doxer.app.base.type.form.common.TelNo;
import org.doxer.app.base.type.form.sample.ad.master.CmKaishaId;
import org.doxer.app.base.type.form.sample.ad.master.CmKishRenrakusakiId;
import org.doxer.app.base.type.form.sample.ad.master.RenrakusakiYotoKb;
import org.doxer.app.db.dbflute.exentity.CmKishRenrakusaki;
import org.doxer.xbase.form.BaseEntityForm;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.domain.supports.Condition;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.util._Num;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class CmKishRenrakusakiForm extends BaseEntityForm<CmKishRenrakusaki> {

	@Condition CmKishRenrakusakiId cmKishRenrakusakiId = new CmKishRenrakusakiId(ARBITRARY, "cmKishRenrakusakiId", "cmKishRenrakusakiId");
	@Condition CmKaishaId cmKaishaId = new CmKaishaId(ARBITRARY, "cmKaishaId", "cmKaishaId");
	@Condition TelNo telNo = new TelNo(ARBITRARY, "telNo", "telNo");
	@Condition MailAddress mailAddress = new MailAddress(ARBITRARY, "mailAddress", "mailAddress");
	@Condition RenrakusakiYotoKb renrakusakiYotoKb = new RenrakusakiYotoKb(REQUIRED, "renrakusakiYotoKb", "renrakusakiYotoKb");

	public void validate(AppMessagesContainer container, String name, int index) {
		this.cmKishRenrakusakiId.validate(container, name, index);
		this.cmKaishaId.validate(container, name, index);
		this.telNo.validate(container, name, index);
		this.mailAddress.validate(container, name, index);
		this.renrakusakiYotoKb.validate(container, name, index);
	}

	@Override
	public void copyToEntity(CmKishRenrakusaki entity) {
		entity.setCmKaishaId(this.cmKaishaId.getValL());
		entity.setTelNo1(_Num.toI_Null(this.telNo.getVal()[0]));
		entity.setTelNo2(_Num.toI_Null(this.telNo.getVal()[1]));
		entity.setTelNo3(_Num.toI_Null(this.telNo.getVal()[2]));
		entity.setMailAddress(this.mailAddress.getVal());
		entity.setRenrakusakiYotoKbAsRenrakusakiYotoKb(this.renrakusakiYotoKb.toKb());
	}

}
