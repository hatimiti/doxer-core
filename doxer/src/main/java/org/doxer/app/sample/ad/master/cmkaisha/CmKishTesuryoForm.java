package org.doxer.app.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.doxer.app.base.type.form.common.Dt;
import org.doxer.app.base.type.form.sample.ad.master.CmKaishaId;
import org.doxer.app.base.type.form.sample.ad.master.CmKishTesuryoId;
import org.doxer.app.base.type.form.sample.ad.master.TesuryoDmSu;
import org.doxer.app.base.type.form.sample.ad.master.TesuryoIntSu;
import org.doxer.app.base.type.form.sample.ad.master.TesuryoKb;
import org.doxer.app.db.dbflute.allcommon.CDef;
import org.doxer.app.db.dbflute.exentity.CmKishTesuryo;
import org.doxer.xbase.form.BaseEntityForm;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.domain.supports.Condition;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.util._Str;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class CmKishTesuryoForm extends BaseEntityForm<CmKishTesuryo> {

	@Condition CmKishTesuryoId cmKishTesuryoId = new CmKishTesuryoId(ARBITRARY, "cmKishTesuryoId", "CM会社手数料ID");
	@Condition CmKaishaId cmKaishaId = new CmKaishaId(ARBITRARY, "cmKaishaId", "CM会社ID");
	@Condition Dt tekiyoKikanFromDt = new Dt(REQUIRED, "tekiyoKikanFromDt", "適用期間(From)");
	@Condition Dt tekiyoKikanToDt = new Dt(ARBITRARY, "tekiyoKikanToDt", "適用期間(To)");
	@Condition TesuryoIntSu tesuryoIntSu = new TesuryoIntSu(REQUIRED, "tesuryoIntSu", "手数料(整数)");
	@Condition TesuryoDmSu tesuryoDmSu = new TesuryoDmSu(ARBITRARY, "tesuryoDmSu", "手数料(小数)");
	@Condition TesuryoKb tesuryoKb = new TesuryoKb(REQUIRED, "tesuryoKb", "手数料区分");

	public String getTesuryoSu() {
		String tesuryoSu = this.tesuryoIntSu.getVal();
		if (CDef.TesuryoKb.Percent.toString()
				.equals(this.tesuryoKb.getVal())) {
			tesuryoSu += "." + _Str.toZeroIfEmpty(this.tesuryoDmSu.getVal());
		}
		return tesuryoSu;
	}

	@Override
	public void validate(AppMessagesContainer container) {
	}

	public void validate(AppMessagesContainer container, String name) {
		this.cmKishTesuryoId.validate(container, name);
		this.cmKaishaId.validate(container, name);
		this.tekiyoKikanFromDt.validate(container, name);
		this.tekiyoKikanToDt.validate(container, name);
		this.tesuryoIntSu.validate(container, name);
		this.tesuryoDmSu.validate(container, name);
		this.tesuryoKb.validate(container, name);
	}

	@Override
	public void copyToEntity(CmKishTesuryo entity) {
		entity.setCmKaishaId(this.cmKaishaId.getValL());
		entity.setTekiyoKikanFromDt(this.tekiyoKikanFromDt.getVal());
		entity.setTekiyoKikanToDt(this.tekiyoKikanToDt.getVal());
		entity.setTesuryoSu(new BigDecimal(this.getTesuryoSu()));
		entity.setTesuryoKbAsTesuryoKb(this.tesuryoKb.getKb());
	}

}
