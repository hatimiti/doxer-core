package org.doxer.xbase.thymeleaf.processor.sa;

import static com.github.hatimiti.doxer.common.util._Obj.*;
import static java.lang.String.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

import org.doxer.xbase.thymeleaf.processor.JAbstractAttrProcessor;
import org.springframework.web.servlet.support.BindStatus;
import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.ProcessorResult;

import com.github.hatimiti.doxer.common.util._Str;

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
		final EvaluatedInfo ev = new EvaluatedInfo(
				bindStatus.getExpression() + part2,
				_Str.asStrOrEmpty(eval(format("${%s%s}", path, part2))),
				_Str.asStrOrEmpty(eval(format("${%s.length()}", path))));

		if (isRadioElement(element) || isCheckboxElement(element)) {
			setAttribute4CheckedElement(element, ev);
		} else {
			setAttribute(element, ev);
		}

		element.removeAttribute(attributeName);
		return ProcessorResult.OK;
	}

	void setAttribute4CheckedElement(Element element, EvaluatedInfo ev) {
		element.setAttribute("name", ev.getName());
		if (ev.getValue().equals(element.getAttributeValue("value"))) {
			element.setAttribute("checked", "checked");
		}
	}

	void setAttribute(Element element, EvaluatedInfo ev) {
		element.setAttribute("name", ev.getName());
		element.setAttribute("value", ev.getValue());
		element.setAttribute("maxlength", ev.getLength());
		element.setAttribute("size", ev.getLength());
	}

	@Override
	public int getPrecedence() {
		return 10000;
	}

	@Getter
	@AllArgsConstructor
	static class EvaluatedInfo {
		private String name;
		private String value;
		private String length;
	}

}
