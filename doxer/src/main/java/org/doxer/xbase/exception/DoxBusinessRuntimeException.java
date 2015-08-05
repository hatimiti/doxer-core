package org.doxer.xbase.exception;

import java.util.function.Supplier;

public class DoxBusinessRuntimeException extends DoxRuntimeException {

	public DoxBusinessRuntimeException(Supplier<String> message) {
		super(message.get());
	}

	public DoxBusinessRuntimeException(Supplier<String> message, Throwable cause) {
		super(message.get(), cause);
	}

	public DoxBusinessRuntimeException(Throwable cause) {
		super(cause);
	}

	protected DoxBusinessRuntimeException(Supplier<String> message, Throwable cause,
			boolean enableSuppression,
			boolean writableStackTrace) {
		super(message.get(), cause, enableSuppression, writableStackTrace);
	}

}
