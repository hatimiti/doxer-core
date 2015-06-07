package org.doxer.xbase.support;

public interface Pagenator {
	/** 現在のページ番号 */
	int getPageNumber();
	/** 1ページの件数 */
	int getPageSize();
	/** ページリンク表示数 */
	int getPageRangeSize();
}
