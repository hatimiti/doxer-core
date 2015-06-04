package org.doxer.xbase.thymeleaf.processor.sa;

import static org.thymeleaf.standard.expression.StandardExpressions.*;

import java.util.Locale;

import org.doxer.xbase.form.AccessUser;
import org.doxer.xbase.util._Container;
import org.thymeleaf.Arguments;
import org.thymeleaf.Configuration;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.attr.AbstractTextChildModifierAttrProcessor;
import org.thymeleaf.standard.expression.IStandardExpression;

import com.github.hatimiti.flutist.common.util._Regex;

/**
 * @author hatimiti
 *
 */
public class I18nTextAttrProcessor extends AbstractTextChildModifierAttrProcessor  {

	public static final String PROCESSOR_NAME = "i18n";

	public I18nTextAttrProcessor() {
		super(PROCESSOR_NAME);
	}


	@Override
	public int getPrecedence() {
		return 100;
	}

	@Override
	protected String getText(
			Arguments arguments,
			Element element,
			String attributeName) {

		String attributeValue = getAttributeValue(element, attributeName);

		AccessUser user = _Container.getAccessUser();
		Locale loc = user.getLocale();

		if (Locale.ENGLISH.equals(loc)) {
			attributeValue = "${" + _Regex.replaceAll(attributeValue, "\\$\\{(.+)\\}", "$1En") + "}";
		}

		return execute(arguments, attributeValue);
	}

	protected String execute(Arguments arguments, final String attributeValue) {
		return (String) getExpression(arguments, attributeValue)
				.execute(arguments.getConfiguration(), arguments);
	}

	protected IStandardExpression getExpression(
			final Arguments arguments,
			final String attributeValue) {

		Configuration configuration = arguments.getConfiguration();
		return getExpressionParser(configuration)
				.parseExpression(configuration, arguments, attributeValue);
	}

	protected String getAttributeValue(Element element, String attributeName) {
		return element.getAttributeValue(attributeName);
	}

}
