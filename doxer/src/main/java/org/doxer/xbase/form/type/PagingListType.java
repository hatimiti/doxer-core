package org.doxer.xbase.form.type;

import org.dbflute.cbean.result.PagingResultBean;

import com.github.hatimiti.flutist.common.domain.type.ListType;

public class PagingListType<O>
		extends ListType<O, PagingResultBean<O>> {

	public PagingListType(PagingResultBean<O> list) {
		super(list);
	}

}
