package org.doxer.app.db.dbflute.exbhv;

import org.dbflute.cbean.result.ListResultBean;
import org.doxer.app.db.dbflute.bsbhv.BsTcmSampleBhv;
import org.doxer.app.db.dbflute.exentity.TcmSample;
import org.doxer.app.sample.type.Val;

/**
 * The behavior of TCM_SAMPLE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TcmSampleBhv extends BsTcmSampleBhv {

	public ListResultBean<TcmSample> findBySampleName(Val name) {
		return this.selectList(cb -> {
			cb.query().setSampleName_Equal(name.getVal());
			cb.query().addOrderBy_SampleName_Asc();
		});
	}
}