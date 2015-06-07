package org.doxer.app.base.type.sample.ad.master;

import java.util.Collections;
import java.util.Comparator;

import org.doxer.app.sample.ad.master.cmkaisha.CmKishTesuryoForm;

import com.github.hatimiti.flutist.common.domain.type.ArrayListType;
import com.github.hatimiti.flutist.common.util._Date;
import com.github.hatimiti.flutist.common.util._Obj;

public class CmKishTesuryoFormList extends ArrayListType<CmKishTesuryoForm> {

	public boolean putTesuryo(CmKishTesuryoForm tesuryo) {

		boolean isOverride = false;

		for (CmKishTesuryoForm tesuryoForm : list) {

			if (!tesuryoForm.getTekiyoKikanFromDt()
					.equals(tesuryo.getTekiyoKikanFromDt())) {
				continue;
			}

			// 同一の適用期間(From)が既に存在する場合はそれを上書き
			tesuryoForm.getTesuryoKb().setStrictVal(tesuryo.getTesuryoKb().getVal());
			tesuryoForm.getTesuryoIntSu().setStrictVal(tesuryo.getTesuryoIntSu().getVal());
			tesuryoForm.getTesuryoDmSu().setStrictVal(tesuryo.getTesuryoDmSu().getVal());
			isOverride = true;
		}

		if (!isOverride) {
			list.add(tesuryo);
		}

		return isOverride;
	}

	/**
	 * 現在のデータを洗い替える。
	 * 適用期間Fromでソートされ、適用期間Toが順序通りに設定される。
	 */
	public void launder() {
		sortByFromDt();
		launderToDt();
	}

	private void sortByFromDt() {
		// 適用期間Fromで並び替え
		Collections.sort(list, new Comparator<CmKishTesuryoForm>() {
			@Override
			public int compare(CmKishTesuryoForm o1, CmKishTesuryoForm o2) {
				return o1.getTekiyoKikanFromDt().getVal()
						.compareTo(o2.getTekiyoKikanFromDt().getVal());
			}
		});
	}


	/**
	 * 適用期間Toを洗い替える。
	 */
	private void launderToDt() {
		// 適用期間Toの洗い替え
		for (int i = 0; i < list.size(); i++) {
			CmKishTesuryoForm curForm = _Obj.get(list, i);
			CmKishTesuryoForm nextForm = _Obj.get(list, i + 1);
			curForm.getTekiyoKikanToDt().setStrictVal(
				nextForm == null
					? "20991231"
					: _Date.addDayToYyyyMmDd(nextForm.getTekiyoKikanFromDt().getVal(), -1));
		}
	}

}
