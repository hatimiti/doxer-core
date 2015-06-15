package org.doxer.xbase.util;

import java.util.Arrays;

import org.springframework.core.env.Environment;

public final class _Env {

	private static final Environment ENV;

	private _Env() {}

	static {
		ENV = _Container.getWebApplicationContext().getEnvironment();
	}

	public static boolean isDev() {
		return contains(Env.DEV.value);
	}

	public static boolean isUt() {
		return contains(Env.UT.value);
	}

	public static boolean isIt() {
		return contains(Env.IT.value);
	}

	public static boolean isProd() {
		return contains(Env.PROD.value);
	}

	public static boolean isItOrProd() {
		return isIt() || isProd();
	}

	private static boolean contains(String env) {
		return 0 < Arrays.stream(ENV.getActiveProfiles())
			.filter(e -> e.equals(env))
			.count();
	}

	private static enum Env {
		DEV("dev"),
		UT("ut"),
		IT("it"),
		PROD("prod")
		;

		String value;

		Env(String value) {
			this.value = value;
		}
	}

}
