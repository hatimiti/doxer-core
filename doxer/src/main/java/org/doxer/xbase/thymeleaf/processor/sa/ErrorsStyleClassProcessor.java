package org.doxer.xbase.thymeleaf.processor.sa;

import org.doxer.xbase.thymeleaf.processor.JAbstractAttrProcessor;
import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.ProcessorResult;

/**
 * 入力エラー時のCSSクラスを指定する。
 * @author hatimiti
 *
 */
public class ErrorsStyleClassProcessor extends JAbstractAttrProcessor {

	public static final String PROCESSOR_NAME = "errclass";

	public ErrorsStyleClassProcessor() {
		super(PROCESSOR_NAME);
	}

	@Override
	protected ProcessorResult executeAttribute(
			Arguments arguments, Element element, String attributeName) {

//		if (_Obj.isNotEmpty(getErrorsIterator(element.getAttributeValue("name")))) {
//			
//			final String value = element.getAttributeValue(attributeName);
//			Attribute styleClass = element.getAttributeMap().get("class");
//			
//			element.setAttribute("class",
//					styleClass == null ? value : styleClass.getValue() + " " + value);
//		}

		element.removeAttribute(attributeName);
		
		return ProcessorResult.OK;
	}

}
