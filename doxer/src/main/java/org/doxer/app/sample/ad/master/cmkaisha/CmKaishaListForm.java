package org.doxer.app.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;

import org.dbflute.dbmeta.info.ColumnInfo;
import org.doxer.app.base.type.form.base.Id;
import org.doxer.app.base.type.form.base.Mei;
import org.doxer.app.base.type.form.sample.ad.master.CmKaishaId;
import org.doxer.app.base.type.form.sample.ad.master.KaishaMei;
import org.doxer.app.base.type.sample.ad.master.CmKaishaList;
import org.doxer.app.db.dbflute.bsentity.dbmeta.CmKaishaDbm;
import org.doxer.xbase.form.BaseSortPageForm;
import org.doxer.xbase.support.Condition;

import com.github.hatimiti.flutist.common.message.AppMessagesContainer;

public class CmKaishaListForm extends BaseSortPageForm {

	@Condition(session = true)
	public Id cmKaishaId = new CmKaishaId(ARBITRARY, "cmKaishaId", "会社ID");
	@Condition(session = true)
	public Mei kaishaMei = new KaishaMei(ARBITRARY, "kaishaMei", "会社名");

	public CmKaishaList kaishaList;

	@Override
	public void validate(AppMessagesContainer container) {
		this.cmKaishaId.validate(container);
		this.kaishaMei.validate(container);
	}

	@Override
	protected ColumnInfo getDefaultSortColName() {
		return CmKaishaDbm.getInstance().columnCmKaishaId();
	}

}
