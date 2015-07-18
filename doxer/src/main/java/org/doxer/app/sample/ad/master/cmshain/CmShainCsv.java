package org.doxer.app.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import lombok.ToString;

import org.doxer.app.base.type.form.sample.ad.master.cmkaisha.CmKaishaId;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.CmShainId;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.LoginCd;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.ShainMei;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.ShainMeiEn;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.ShainSei;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.ShainSeiEn;
import org.doxer.app.db.dbflute.exentity.CmShain;
import org.doxer.xbase.form.DoxInputCsv;

import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.util._Num;
import com.orangesignal.csv.annotation.CsvColumn;
import com.orangesignal.csv.annotation.CsvEntity;

@ToString
@CsvEntity
public class CmShainCsv implements DoxInputCsv {

	public static final int MAX_COL_NUM = 7;

	@CsvColumn(position = 0) String cmShainId;
	@CsvColumn(position = 1) String cmKaishaId;
	@CsvColumn(position = 2) String shainSei;
	@CsvColumn(position = 3) String shainMei;
	@CsvColumn(position = 4) String shainSeiEn;
	@CsvColumn(position = 5) String shainMeiEn;
	@CsvColumn(position = 6) String loginCd;

	public static CmShainCsv createHader() {
		/*
		 * ヘッダも多言語化する際のことを考慮して
		 * @CsvColumnのname属性ではなく、個別に生成している。
		 * 多言語化することがなければ@CsvColmunを利用してもよい。
		 */
		CmShainCsv header = new CmShainCsv();
		header.cmShainId = "CM社員ID";
		header.cmKaishaId = "CM会社ID";
		header.shainSei = "社員(姓)";
		header.shainMei = "社員(名)";
		header.shainSeiEn = "社員(姓)(英)";
		header.shainMeiEn = "社員(名)(英)";
		header.loginCd = "ログインコード";
		return header;
	}

	@Override
	public void validate(AppMessagesContainer c, String name, int index) {

		CmShainId sid = (CmShainId) new CmShainId(CONDITION).temporary(cmShainId);
		boolean isValidCmShainId = sid.validate(c, name, index);

		CmKaishaId kid = (CmKaishaId) new CmKaishaId(REQUIRED).temporary(cmKaishaId);
		boolean isValidCmKaishaId = kid.validate(c, name, index);

		new ShainSei(REQUIRED).temporary(shainSei).validate(c, name, index);
		new ShainMei(REQUIRED).temporary(shainMei).validate(c, name, index);
		new ShainSeiEn(ARBITRARY).temporary(shainSeiEn).validate(c, name, index);
		new ShainMeiEn(ARBITRARY).temporary(shainMeiEn).validate(c, name, index);

		if (isValidCmShainId && isValidCmKaishaId) {
			((LoginCd) new LoginCd(REQUIRED).temporary(loginCd))
				.validWithUniqueCheck(c, sid, kid, name, index);
		}
	}

	public void copyFrom(CmShain shain) {
		this.cmShainId = shain.getCmShainId().toString();
		this.cmKaishaId = shain.getCmKaishaId().toString();
		this.shainSei = shain.getShainSei();
		this.shainMei = shain.getShainMei();
		this.shainSeiEn = shain.getShainSeiEn();
		this.shainMeiEn = shain.getShainMeiEn();
		this.loginCd = shain.getLoginCd();
	}

	public CmShain copyTo(CmShain shain) {
		shain.setCmShainId(_Num.asLongOrNull(cmShainId));
		shain.setCmKaishaId(_Num.asLongOrNull(cmKaishaId));
		shain.setShainSei(shainSei);
		shain.setShainMei(shainMei);
		shain.setShainSeiEn(shainSeiEn);
		shain.setShainMeiEn(shainMeiEn);
		shain.setLoginCd(loginCd);
		shain.setPassword("aaaaaaaab@");
		return shain;
	}

}
