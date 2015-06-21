package org.doxer.xbase.form;

import lombok.Getter;
import lombok.Setter;

import org.doxer.xbase.support.SortOrder;
import org.doxer.xbase.support.TableHeaderSortableForm;

/**
 * テーブルヘッダなどによるソーティングを行う ActionForm のための基底クラス．
 * @author hatimiti
 *
 */
public abstract class BaseSortPageForm extends BasePageForm
		implements TableHeaderSortableForm {

	private static final long serialVersionUID = 1L;

	/**
	 * ソートするカラム名．
	 */
	@Setter
	@Getter
	private String sortColName;

	/**
	 * 昇順(Asc) / 降順(Desc) を保持する．
	 */
	@Setter
	@Getter
	private String sortOrder = SortOrder.ASC.toString();

	/*
	 * コンストラクタ
	 */
	public BaseSortPageForm() {
		this.sortColName = getDefaultSortColName().getColumnDbName();
	}

}
