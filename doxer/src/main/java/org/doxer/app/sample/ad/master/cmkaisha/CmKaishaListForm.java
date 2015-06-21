package org.doxer.app.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.dbflute.dbmeta.info.ColumnInfo;
import org.doxer.app.base.type.form.base.Id;
import org.doxer.app.base.type.form.base.Mei;
import org.doxer.app.base.type.form.sample.ad.master.CmKaishaId;
import org.doxer.app.base.type.form.sample.ad.master.KaishaMei;
import org.doxer.app.base.type.sample.ad.master.CmKaishaList;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKaishaDbm;
import org.doxer.xbase.form.BaseSortPageForm;
import org.doxer.xbase.support.Condition;
import org.doxer.xbase.validation.validator.FormValidator;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.message.AppMessagesContainer;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class CmKaishaListForm extends BaseSortPageForm {

	@Condition(session = true) Id cmKaishaId = new CmKaishaId(ARBITRARY, "cmKaishaId", "cmKaishaId");
	@Condition(session = true) Mei kaishaMei = new KaishaMei(ARBITRARY, "kaishaMei", "kaishaMei");

	CmKaishaList kaishaList;

	class Validate implements FormValidator {
		@Override
		public void validate(AppMessagesContainer c) {
			cmKaishaId.validate(c);
			kaishaMei.validate(c);
		}
	}

	@Override
	public ColumnInfo getDefaultSortColName() {
		return CmKaishaDbm.getInstance().columnCmKaishaId();
	}

}
