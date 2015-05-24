package org.doxer.xbase.thymeleaf.processor.sa;

import java.util.ArrayList;
import java.util.List;

import org.doxer.xbase.thymeleaf.processor.JAbstractAttrProcessor;
import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.dom.Node;
import org.thymeleaf.processor.ProcessorResult;

import com.github.hatimiti.flutist.common.util._Obj;

public class ErrorsMessageProcessor extends JAbstractAttrProcessor {

	public static final String ALL_MESSAGE_KEY = "all";
	public static final String PROCESSOR_NAME = "errors";

	public ErrorsMessageProcessor() {
		super(PROCESSOR_NAME);
	}
	
	@Override
	protected ProcessorResult executeAttribute(
			Arguments arguments, Element element, String attributeName) {

		List<Node> r = getMessageNodes(element, attributeName);
		
		if (_Obj.isEmpty(r)) {
			element.getParent().removeChild(element);
		} else {
			element.setChildren(r);
			element.removeAttribute(attributeName);
		}

		return ProcessorResult.OK;
	}

	protected List<Node> getMessageNodes(Element element, String attributeName) {
		
		List<Node> r = new ArrayList<>();
		
		final String value = element.getAttributeValue(attributeName);
		final boolean isAll = ALL_MESSAGE_KEY.equals(value);
		
//		for (Iterator<AppMessage> i = getErrorsIterator(isAll ? "" : value); i.hasNext();) {
//			AppMessage m = i.next();
//			
//			r.add(new Text(m.isResource() ? /* TODO */"" : m.getKeyOrMessage()));
//			r.add(new Br().toNode());
//		}

		return r;
	}
	
}
