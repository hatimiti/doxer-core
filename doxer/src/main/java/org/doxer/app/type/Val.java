package org.doxer.app.type;


public class Val {

	private String val;

	public Val(String val) {
		this.val = val;
	}

	public String getVal() {
		return this.val;
	}

	@Override
	public String toString() {
		return this.val.toString();
	}
}
