package org.doxer.xbase.aop.interceptor.exception;

/**
 * トークンチェックによる例外．
 * @author hatimiti
 *
 */
public class IllegalTokenException
		extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IllegalTokenException() {
	}

	public IllegalTokenException(String message) {
		super(message);
	}

	public IllegalTokenException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public IllegalTokenException(Throwable throwable) {
		super(throwable);
	}

}
