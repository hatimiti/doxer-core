package org.doxer.app.db;

import org.dbflute.bhv.readable.EntityRowHandler;

/**
 * DBFluteの標準実装であるEntityRowHandlerのhandlerメソッドに対して throws Exception を付加した
 * 関数型インターフェースである。
 * ラムダ式内のtry/catchを省略するための uncheck メソッドを定義している。
 * @author hatimiti
 *
 * @param <ENTITY>
 * @see org.dbflute.bhv.readable.EntityRowHandler<ENTITY>
 */
@FunctionalInterface
public interface ExEntityRowHandler<ENTITY> {

	void handle(ENTITY e) throws Exception;

	public static <ENTITY> EntityRowHandler<ENTITY> uncheck(ExEntityRowHandler<ENTITY> ex) {
		return entity -> { try { ex.handle(entity); } catch (Exception e) { throw new RuntimeException(e); } };
	}
}