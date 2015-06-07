package org.doxer.xbase.form;

import org.dbflute.dbmeta.info.ColumnInfo;
import org.doxer.xbase.support.SortOrder;

/**
 * テーブルヘッダなどによるソーティングを行う ActionForm のための基底クラス．
 * @author m-kakimi
 *
 */
public abstract class BaseSortPageForm extends BasePageForm {

	private static final long serialVersionUID = 1L;

	/**
	 * ソートするカラム名．
	 */
	public String sortColName;

	/**
	 * 昇順(Asc) / 降順(Desc) を保持する．
	 */
	public String sortOrder = SortOrder.ASC.toString();

	/*
	 * コンストラクタ
	 */
	public BaseSortPageForm() {
		this.sortColName = getDefaultSortColName().getColumnDbName();
	}

	/**
	 * 初回のデフォルトソートカラム情報を返すように実装する．
	 */
	abstract protected ColumnInfo getDefaultSortColName();

}
