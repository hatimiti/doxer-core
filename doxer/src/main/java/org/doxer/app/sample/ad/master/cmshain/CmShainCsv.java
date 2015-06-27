package org.doxer.app.sample.ad.master.cmshain;

import lombok.Data;

import com.orangesignal.csv.annotation.CsvColumn;
import com.orangesignal.csv.annotation.CsvEntity;

@Data
@CsvEntity
public class CmShainCsv {

	@CsvColumn String cmShainId;
	@CsvColumn String cmKaishaId;
	@CsvColumn String shainSei;
	@CsvColumn String shainMei;
	@CsvColumn String shainSeiEn;
	@CsvColumn String shainMeiEn;

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
		return header;
	}

}
