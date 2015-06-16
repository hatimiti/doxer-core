package org.doxer.xbase.thymeleaf.processor.sa;

import static org.doxer.xbase.util._Container.*;

import org.doxer.xbase.thymeleaf.processor.JAbstractAttrProcessor;
import org.doxer.xbase.util.TokenProcessor;
import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.ProcessorResult;

/**
 * @author hatimiti
 *
 */
public class HiddenTokenAttrProcessor extends JAbstractAttrProcessor {

	public static final String PROCESSOR_NAME = "token";

	public HiddenTokenAttrProcessor() {
		super(PROCESSOR_NAME);
	}

	@Override
	protected ProcessorResult executeAttribute(
			Arguments arguments,
			Element element,
			String attributeName) {

		element.setAttribute("name", TokenProcessor.TOKEN_KEY);
		element.setAttribute("value", (String) getHttpSession().getAttribute(TokenProcessor.TRANSACTION_TOKEN_KEY));
		element.removeAttribute(attributeName);
		return ProcessorResult.OK;
	}

	@Override
	public int getPrecedence() {
		return 100;
	}

}
