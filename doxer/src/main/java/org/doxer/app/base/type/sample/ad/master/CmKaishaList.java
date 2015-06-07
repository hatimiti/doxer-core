package org.doxer.app.base.type.sample.ad.master;

import org.dbflute.cbean.result.PagingResultBean;
import org.doxer.app.db.dbflute.exentity.CmKaisha;
import org.doxer.xbase.form.type.PagingListType;

public class CmKaishaList extends PagingListType<CmKaisha> {

	public CmKaishaList(PagingResultBean<CmKaisha> list) {
		super(list);
	}

}
