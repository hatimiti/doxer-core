package org.doxer.xbase.thymeleaf.processor;

import org.doxer.xbase.form.DoxForm;
import org.springframework.web.servlet.support.BindStatus;
import org.thymeleaf.Arguments;
import org.thymeleaf.Configuration;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.ProcessorResult;
import org.thymeleaf.processor.attr.AbstractAttrProcessor;
import org.thymeleaf.spring4.util.FieldUtils;
import org.thymeleaf.standard.expression.IStandardExpression;
import org.thymeleaf.standard.expression.IStandardExpressionParser;
import org.thymeleaf.standard.expression.StandardExpressions;

public abstract class JAbstractAttrProcessor extends AbstractAttrProcessor {

	private Arguments arguments;
	private Element element;
	private String attributeName;
	private String[] attributeValues;

	protected JAbstractAttrProcessor(String name) {
		super(name);
	}

	@Override
	protected final ProcessorResult processAttribute(
			Arguments arguments,
			Element element,
			String attributeName) {

		this.arguments = arguments;
		this.element = element;
		this.attributeName = attributeName;

		this.attributeValues = getAttributeValue().split(",");

		return executeAttribute(arguments, element, attributeName);
	}

	protected abstract ProcessorResult executeAttribute(
			Arguments arguments,
			Element element,
			String attributeName);

	protected Object eval(String expression) {
		final Configuration configuration = arguments.getConfiguration();
		final IStandardExpression valExpression
			= getParser().parseExpression(configuration, arguments, expression);
		return valExpression.execute(configuration, arguments);
	}

	protected String getAttributeValue() {
		return element.getAttributeValue(attributeName);
	}

	protected BindStatus getBindStatus(String attributeValue) {
		return FieldUtils.getBindStatus(arguments.getConfiguration(), arguments, attributeValue);
	}

	protected String getAttributeValuePart(int no) {
		try {
			return attributeValues[no];
		} catch (Throwable t) {
			return "";
		}
	}

	protected IStandardExpressionParser getParser() {
		return StandardExpressions.getExpressionParser(
				arguments.getConfiguration());
	}

	protected DoxForm getForm(Arguments arguments) {
		return (DoxForm) arguments.getContext().getVariables().get("form");
	}

	protected boolean isRadioElement(Element element) {
		return "radio".equals(element.getAttributeValue("type"));
	}

	@Override
	public int getPrecedence() {
		return Integer.MAX_VALUE;
	}

}
