package org.doxer.xbase.support;

import org.dbflute.dbmeta.info.ColumnInfo;


/**
 * 画面上でヘッダソートする際に Form に実装する．
 * @author hatimiti
 */
public interface TableHeaderSortableForm {

	/**
	 * ソートするカラム名．
	 */
	String getSortColName();

	/**
	 * 昇順(Asc) / 降順(Desc) を保持する．
	 */
	String getSortOrder();

	/**
	 * 初回のデフォルトソートカラム情報を返すように実装する．
	 */
	ColumnInfo getDefaultSortColName();

}
