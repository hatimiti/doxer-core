package org.doxer.xbase.form;

import org.dbflute.cbean.result.PagingResultBean;
import org.doxer.xbase.form.type.PagingListType;
import org.doxer.xbase.support.Page;
import org.doxer.xbase.support.Pagenator;

import com.github.hatimiti.flutist.common.util._Num;

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
	public String pageNumber = "1";

	/**
	 * ページリンク情報
	 */
	private Page page = new Page();

	public Page getPage() {
		return this.page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public void setupPage(final PagingListType<?> prb) {
		setupPage(prb.getVal());
	}

	public void setupPage(final PagingResultBean<?> prb) {
		if (this.page == null) {
			this.page = new Page();
		}
		this.page.setup(prb, getPageRangeSize(), this);
	}

	@Override
	public int getPageSize() {
		return _Num.toI("20", 10);
	}

	@Override
	public int getPageNumber() {
		return _Num.toI(this.pageNumber, 1);
	}

	@Override
	public int getPageRangeSize() {
		return _Num.toI("10", 10);
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

}
