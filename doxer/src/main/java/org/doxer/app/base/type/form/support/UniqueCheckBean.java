package org.doxer.app.base.type.form.support;

public class UniqueCheckBean {

	protected boolean isUniqueCheckTarget;
	protected String key;

	public UniqueCheckBean(
			final boolean isUniqueCheckTarget,
			final String key) {
		this.isUniqueCheckTarget = isUniqueCheckTarget;
		this.key = key;
	}

}
