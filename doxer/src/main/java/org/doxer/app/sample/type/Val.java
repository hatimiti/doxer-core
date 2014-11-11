package org.doxer.app.sample.type;

import lombok.Value;

@Value
public class Val {

	private String val;

	@Override
	public String toString() {
		return this.val;
	}
}
