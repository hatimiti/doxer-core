package org.doxer.xbase.support;

import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.AbstractConditionQuery;


/**
 * 画面上でヘッダソートする際に Bhv に実装する．
 * @author hatimiti
 */
public interface TableHeaderSortableBhv<B extends AbstractConditionBean, Q extends AbstractConditionQuery> {

	Q setOrder(final B cb, final String sortColName, final String sort);

}
