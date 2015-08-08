package org.doxer.xbase.form;

import lombok.Getter;
import lombok.Setter;

import org.dbflute.cbean.result.PagingResultBean;
import org.doxer.xbase.form.type.PagingListType;
import org.doxer.xbase.support.Page;
import org.doxer.xbase.support.Pagenator;

import com.github.hatimiti.doxer.common.domain.supports.Condition;
import com.github.hatimiti.doxer.common.util._Num;

/**
 * ページング処理を行う ActionForm のための基底クラス．
 * @author hatimiti
 *
 */
public abstract class BasePageForm extends DoxForm implements Pagenator {

	private static final long serialVersionUID = 1L;

	/**
	 * 現在のページ番号
	 */
	@Setter
	@Condition String pageNumber = "1";

	/**
	 * ページリンク情報
	 */
	@Getter
	protected Page page = new Page();

	public void setupPage(final PagingListType<?> prb) {
		setupPage(prb.getVal());
	}

	public void setupPage(final PagingResultBean<?> prb) {
		this.page.setup(prb, getPageRangeSize(), this);
	}

	@Override
	public int getPageSize() {
		return _Num.asIntOrDefault("20", 10);
	}

	@Override
	public int getPageNumber() {
		return _Num.asIntOrDefault(this.pageNumber, 1);
	}

	@Override
	public int getPageRangeSize() {
		return _Num.asIntOrDefault("10", 10);
	}

}
