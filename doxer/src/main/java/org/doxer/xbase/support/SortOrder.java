package org.doxer.xbase.support;

/**
 * 並び替えの順序を表す列挙型
 * @author hatimiti
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
	 * 自身の逆順を表す値を返す．
	 * @return 自身がASCの場合はDESC、自身がDESCの場合はASCを返す．
	 */
	public SortOrder reverse() {
		switch (this) {
		case ASC: return DESC;
		default: return ASC;
		}
	}

	/**
	 * 並び替え順序を表す文字列を取得する．
	 * @return 昇順の場合は "ASC", 降順の場合は "DESC" を返す．
	 */
	@Override
	public String toString() {
		return this.value;
	}

	public boolean isAsc() {
		return this == ASC;
	}

	public boolean isDesc() {
		return this == DESC;
	}

	public static boolean isAsc(String value) {
		return valueOf(value) == ASC;
	}

	public static boolean isDesc(String value) {
		return valueOf(value) == DESC;
	}

}
