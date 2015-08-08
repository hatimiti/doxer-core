package org.doxer.xbase.form;

import lombok.Getter;
import lombok.Setter;

import org.doxer.xbase.support.SortOrder;
import org.doxer.xbase.support.TableHeaderSortableForm;

import com.github.hatimiti.doxer.common.domain.supports.Condition;

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
	@Condition String sortColName;

	/**
	 * 昇順(Asc) / 降順(Desc) を保持する．
	 */
	@Setter
	@Getter
	@Condition String sortOrder = SortOrder.ASC.toString();

	/*
	 * コンストラクタ
	 */
	public BaseSortPageForm() {
		this.sortColName = getDefaultSortColName().getColumnDbName();
	}

}
