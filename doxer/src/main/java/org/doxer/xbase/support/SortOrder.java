package org.doxer.xbase.support;

/**
 * 並び替えの順序を表す列挙型
 * @author m-kakimi
 */
public enum SortOrder {

	/**
	 * 昇順("ASC")
	 */
	ASC("ASC"),

	/**
	 * 降順("DESC")
	 */
	DESC("DESC");

	private String value;

	private SortOrder(final String value) {
		this.value = value;
	}

	/**
	 * 並び替え順序を表す文字列を取得する．
	 * @return 昇順の場合は "ASC", 降順の場合は "DESC" を返す．
	 */
	@Override
	public String toString() {
		return this.value;
	}

}
