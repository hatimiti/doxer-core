package org.doxer.app.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import org.doxer.app.base.type.form.common.Dt;
import org.doxer.app.base.type.form.sample.ad.master.cmkaisha.CmKaishaId;
import org.doxer.app.base.type.form.sample.ad.master.cmkishtesuryo.CmKishTesuryoId;
import org.doxer.app.base.type.form.sample.ad.master.cmkishtesuryo.TesuryoDmSu;
import org.doxer.app.base.type.form.sample.ad.master.cmkishtesuryo.TesuryoIntSu;
import org.doxer.app.base.type.form.sample.ad.master.cmkishtesuryo.TesuryoKb;
import org.doxer.app.db.dbflute.allcommon.CDef;
import org.doxer.app.db.dbflute.exentity.CmKishTesuryo;
import org.doxer.xbase.form.BaseEntityForm;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.domain.supports.Condition;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.util._Str;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Component
public class CmKishTesuryoForm extends BaseEntityForm<CmKishTesuryo> {

	@Condition CmKishTesuryoId cmKishTesuryoId = new CmKishTesuryoId(ARBITRARY);
	@Condition CmKaishaId cmKaishaId = new CmKaishaId(ARBITRARY);
	@Condition Dt tekiyoKikanFromDt = new Dt(REQUIRED, "tekiyoKikanFromDt");
	@Condition Dt tekiyoKikanToDt = new Dt(ARBITRARY, "tekiyoKikanToDt");
	@Condition TesuryoIntSu tesuryoIntSu = new TesuryoIntSu(REQUIRED);
	@Condition TesuryoDmSu tesuryoDmSu = new TesuryoDmSu(ARBITRARY);
	@Condition TesuryoKb tesuryoKb = new TesuryoKb(REQUIRED);

	public CmKishTesuryoForm(CmKishTesuryo entity) {
		this.copyFrom(entity);
	}

	public String getTesuryoSu() {
		String tesuryoSu = this.tesuryoIntSu.getVal();
		if (CDef.TesuryoKb.Percent.toString()
				.equals(this.tesuryoKb.getVal())) {
			tesuryoSu += "." + _Str.toZeroIfEmpty(this.tesuryoDmSu.getVal());
		}
		return tesuryoSu;
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
	public void copyFrom(CmKishTesuryo entity) {
		this.getCmKishTesuryoId().setStrictValL(entity.getCmKishTesuryoId());
		this.getCmKaishaId().setStrictValL(entity.getCmKaishaId());
		this.getTekiyoKikanFromDt().setStrictVal(entity.getTekiyoKikanFromDt());
		this.getTekiyoKikanToDt().setStrictVal(entity.getTekiyoKikanToDt());
		this.getTesuryoKb().setStrictVal(entity.getTesuryoKb());
		this.getTesuryoIntSu().setStrictVal(_Str.getIntegerOf(entity.getTesuryoSu()));
		this.getTesuryoDmSu().setStrictVal(_Str.getDecimalOf(entity.getTesuryoSu()));
	}

}
