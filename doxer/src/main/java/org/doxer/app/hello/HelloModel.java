package org.doxer.app.hello;

import org.doxer.app.type.Val;
import org.springframework.stereotype.Component;

@Component
public class HelloModel {

	private Val val;

	public Val getVal() {
		return val;
	}

	public void setVal(Val val) {
		this.val = val;
	}

}
