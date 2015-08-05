package org.doxer.xbase.exception;

public abstract class DoxRuntimeException extends RuntimeException {

	public DoxRuntimeException(String message) {
		super(message);
	}

	public DoxRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public DoxRuntimeException(Throwable cause) {
		super(cause);
	}

	protected DoxRuntimeException(String message, Throwable cause,
			boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
