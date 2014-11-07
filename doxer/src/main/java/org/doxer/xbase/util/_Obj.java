package org.doxer.xbase.util;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * オブジェクト全般ユーティリティクラス
 * @author m-kakimi
 */
public final class _Obj {

	/**
	 * private コンストラクタ
	 */
	private _Obj() {
	}

	public static boolean isEmpty(Object val) {
		if (val instanceof String) {
			return ((String) val).isEmpty();
		} else if (val instanceof Collection<?>) {
			return ((Collection<?>) val).isEmpty();
		} else if (val instanceof AbstractMap<?, ?>) {
			return ((AbstractMap<?, ?>) val).isEmpty();
		} else if (val instanceof Iterator<?>) {
			return !((Iterator<?>) val).hasNext();
		}
		return val == null;
	}

	public static boolean isNotEmpty(Object val) {
		return !isEmpty(val);
	}

	/**
	 * いずれかが空であれば真を返す．
	 * @param values
	 * @return
	 */
	@SafeVarargs
	public static <O> boolean isEmptyAnyIn(O... values) {
		if (isEmpty(values)) {
			return true;
		}
		return Arrays.stream(values)
				.anyMatch(v -> isEmpty(v));
	}

	/**
	 * 渡された文字列配列が null または、空配列かどうかを判断する．
	 * 配列内の値も走査し、全て空文字の配列である場合も真を返す．
	 * @param 判定文字列配列
	 * @return null または空配列の場合は true を返す．<br>
	 */
	@SafeVarargs
	public static <O> boolean isEmptyAllIn(O... values) {
		if (isEmpty(values)) {
			return true;
		}
		return !Arrays.stream(values)
				.anyMatch(v -> isNotEmpty(v));
	}

	public static boolean eq(Object a, Object b) {
		if (a == null || b == null) {
			return false;
		}
		return a.equals(b);
	}

	public static boolean ne(Object a, Object b) {
		return !eq(a, b);
	}

	/**
	 * Logger オブジェクトを取得する．
	 * @return log4j のロガーオブジェクト
	 */
	public static Logger getLogger() {
		return LoggerFactory.getLogger(new Throwable().getStackTrace()[1].getClassName());
	}

}
