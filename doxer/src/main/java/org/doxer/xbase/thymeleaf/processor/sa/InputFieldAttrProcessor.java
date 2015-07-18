package org.doxer.xbase.thymeleaf.processor.sa;

import static com.github.hatimiti.flutist.common.util._Obj.*;
import static java.lang.String.*;

import org.doxer.xbase.thymeleaf.processor.JAbstractAttrProcessor;
import org.springframework.web.servlet.support.BindStatus;
import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.ProcessorResult;

import com.github.hatimiti.flutist.common.util._Str;

/**
 * @author hatimiti
 *
 */
public class InputFieldAttrProcessor extends JAbstractAttrProcessor {

	public static final String PROCESSOR_NAME = "field";

	public InputFieldAttrProcessor() {
		super(PROCESSOR_NAME);
	}

	@Override
	protected ProcessorResult executeAttribute(
			Arguments arguments,
			Element element,
			String attributeName) {

		String part1 = getAttributeValuePart(0);
		String part2 = getAttributeValuePart(1);
		part2 = "." + (isEmpty(part2) ? "val" : part2);

		BindStatus bindStatus = getBindStatus(part1);

		final String path = bindStatus.getPath();
		final String name = bindStatus.getExpression() + part2;
		final String value = _Str.asStrOrEmpty(eval(format("${%s%s}", path, part2)));
		final String length = _Str.asStrOrEmpty(eval(format("${%s.length()}", path)));

		element.setAttribute("name", name);
		element.setAttribute("value", value);
		element.setAttribute("maxlength", length);
		element.setAttribute("size", length);

		element.removeAttribute(attributeName);
		return ProcessorResult.OK;
	}

	@Override
	public int getPrecedence() {
		return 100;
	}

}
