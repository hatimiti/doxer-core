package org.doxer.xbase.controller;

import static org.doxer.xbase.util._Container.*;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

/**
 * org.springframework.web.servlet.i18n.LocaleChangeInterceptor
 * を参考にコントローラ化
 * @author hatimiti
 */
public abstract class BaseLangController extends DoxController {

	protected void setupLocale(String lang) {
		String newLocale = lang;
		if (newLocale != null) {
			LocaleResolver localeResolver
				= RequestContextUtils.getLocaleResolver(getHttpServletRequest());
			if (localeResolver == null) {
				throw new IllegalStateException(
						"No LocaleResolver found: not in a DispatcherServlet request?");
			}
			localeResolver.setLocale(
					getHttpServletRequest(),
					getHttpServletResponse(),
					StringUtils.parseLocaleString(newLocale));
		}
	}

}
