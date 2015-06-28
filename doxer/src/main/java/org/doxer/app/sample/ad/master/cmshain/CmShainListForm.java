package org.doxer.app.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.dbmeta.info.ColumnInfo;
import org.doxer.app.base.type.form.sample.ad.master.cmkaisha.CmKaishaId;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.CmShainId;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.ShainMei;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmShainDbm;
import org.doxer.app.db.dbflute.exentity.CmShain;
import org.doxer.xbase.form.BaseSortPageForm;
import org.doxer.xbase.support.Condition;
import org.doxer.xbase.validation.validator.CsvFormValidator;
import org.doxer.xbase.validation.validator.FormValidator;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.github.hatimiti.flutist.common.message.AppMessagesContainer;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class CmShainListForm extends BaseSortPageForm {

	@Condition CmShainId cmShainId = new CmShainId(ARBITRARY);
	@Condition CmKaishaId cmKaishaId = new CmKaishaId(ARBITRARY);
	@Condition ShainMei shainMei = new ShainMei(ARBITRARY);

	@Condition MultipartFile uploadedCsvFile;

	PagingResultBean<CmShain> shainList;
	int csvRowCount;

	class Validate implements FormValidator {
		@Override
		public void validate(AppMessagesContainer c) {
			cmShainId.validate(c);
			cmKaishaId.validate(c);
			shainMei.validate(c);
		}
	}

	class ValidateCsv extends CsvFormValidator {
		@Override
		public void validate(AppMessagesContainer c) throws Exception {
			csvRowCount = validateCsv(c, "uploadedCsvFile");
		}
		@Override
		protected MultipartFile getCsvFile() {
			return uploadedCsvFile;
		}
		@Override
		@SuppressWarnings("unchecked")
		protected Class<CmShainCsv> getCsvEntityClass() {
			return CmShainCsv.class;
		}
		@Override
		protected int getCsvColumnNum() {
			return CmShainCsv.MAX_COL_NUM;
		}
	}

	@Override
	public ColumnInfo getDefaultSortColName() {
		return CmShainDbm.getInstance().columnCmShainId();
	}

}
