package org.doxer.xbase.support;

import org.dbflute.cbean.AbstractConditionBean;


/**
 * 画面上でヘッダソートする際に Bhv に実装する．
 * @author hatimiti
 */
public interface TableHeaderSortableBhv<C extends AbstractConditionBean> {

	void setOrder(final C cb, final String sortColName, final String sort);

}
