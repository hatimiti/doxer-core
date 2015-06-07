package org.doxer.xbase.support;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;

import org.apache.catalina.util.URLEncoder;
import org.dbflute.cbean.result.PagingResultBean;

import com.github.hatimiti.flutist.common.util._Ref;

/**
 * SAStruts で、EL式にListを扱う場合は、自動でListWrapperにキャストされてしまい、
 * DBFlute の PagingResultBean が ClassCastException となってしまう。
 * このクラスを間に挟み、Exception 回避する。
 * @author hatimiti
 */
public class Page implements Serializable {

	private static final long serialVersionUID = 1L;

	/** ページングなし条件での総件数 */
	private int allRecordCount;
	/** 総ページ数 */
	private int allPageCount;
	/** 対象ページ番号 */
	private int currentPageNumber;
	/** 前ページがあるか否か */
	private boolean isExistNextPage;
	/** 次ページがあるか否か */
	private boolean isExistPrePage;
	/** ナビゲーションのページリンク候補一覧 */
	private List<Integer> pageNumberList;
	/** 検索条件 */
	private String searchConditions;

	public Page() {
	}

	public Page(final PagingResultBean<?> prb, final int pageRangeSize) {
		setup(prb, pageRangeSize);
	}

	public void setup(final PagingResultBean<?> prb, final int pageRangeSize) {
		setup(prb, pageRangeSize, null);
	}

	/**
	 * ページリンクなどを計算し、ページングのセットアップを行う．
	 */
	public void setup(
			final PagingResultBean<?> prb,
			final int pageRangeSize,
			final Object form) {

		this.allRecordCount = prb.getAllRecordCount();
		this.allPageCount = prb.getAllPageCount();
		this.currentPageNumber = prb.getCurrentPageNumber();
		this.isExistNextPage = prb.existsNextPage();
		this.isExistPrePage = prb.existsPreviousPage();
		this.pageNumberList = prb.pageRange(op -> op.rangeSize(pageRangeSize)).createPageNumberList();

		if (form == null) {
			return;
		}

		StringBuilder sb = new StringBuilder();

		Class<?> formClass = form.getClass();
		for (Field formField : _Ref.getAllFields(formClass)) {
			Condition condition = formField.getAnnotation(Condition.class);
			if (condition == null) {
				continue;
			}
			final String name = formField.getName();
			if ("pageNumber".equals(name)) {
				continue;
			}
			Object value = null;
			try {
				value = formField.get(form);
				if (value != null && value instanceof String) {
					if (condition.escape()) {
						value = new URLEncoder().encode((String) value);
					}
					sb.append("&amp;" + name + "=" + value);
				}
			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
		}

		this.searchConditions = sb.toString();
	}

	public int getAllRecordCount() {
		return this.allRecordCount;
	}
	public int getAllPageCount() {
		return this.allPageCount;
	}
	public int getCurrentPageNumber() {
		return this.currentPageNumber;
	}
	public boolean getIsExistNextPage() {
		return this.isExistNextPage;
	}
	public boolean getIsExistPrePage() {
		return this.isExistPrePage;
	}
	public List<Integer> getPageNumberList() {
		return this.pageNumberList;
	}
	public String getSearchConditions() {
		return this.searchConditions;
	}
}
