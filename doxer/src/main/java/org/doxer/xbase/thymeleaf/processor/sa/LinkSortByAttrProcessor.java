package org.doxer.xbase.thymeleaf.processor.sa;

import static java.lang.String.*;

import java.util.Arrays;

import org.doxer.xbase.support.SortOrder;
import org.doxer.xbase.support.TableHeaderSortableForm;
import org.doxer.xbase.thymeleaf.processor.JAbstractAttrProcessor;
import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.dom.Text;
import org.thymeleaf.processor.ProcessorResult;

import com.github.hatimiti.flutist.common.util._Str;


/**
 * @author hatimiti
 *
 */
public class LinkSortByAttrProcessor extends JAbstractAttrProcessor {

	public static final String PROCESSOR_NAME = "sortby";

	public LinkSortByAttrProcessor() {
		super(PROCESSOR_NAME);
	}

	@Override
	protected ProcessorResult executeAttribute(
			Arguments arguments,
			Element element,
			String attributeName) {

		TableHeaderSortableForm sortForm = (TableHeaderSortableForm) getForm(arguments);
		String nowSortColName = sortForm.getSortColName();
		String sortColName = _Str.toEmpty(eval(getAttributeValuePart(0)));
		String sortOrder = sortForm.getSortOrder();

		StringBuilder query = new StringBuilder("?")
			.append(format("sortColName=%s&", sortColName))
			.append(format("sortOrder=%s", getNextSortOrder(sortColName, nowSortColName, sortOrder)));

		element.setAttribute("href", element.getAttributeValue("href") + query.toString());
		element.setChildren(Arrays.asList(new Text(getSortMark(sortColName, nowSortColName, sortOrder))));

		element.removeAttribute(attributeName);
		return ProcessorResult.OK;
	}

	protected SortOrder getNextSortOrder(String sortColName, String nowSortColName, String sortOrder) {
		return sortColName.equals(nowSortColName)
				? SortOrder.valueOf(sortOrder).reverse() : SortOrder.ASC;
	}

	protected String getSortMark(String sortColName, String nowSortColName, String sortOrder) {
		return sortColName.equals(nowSortColName)
				? SortOrder.ASC.toString().equals(sortOrder) ? "▲" : "▼"
				: "△";
	}

	@Override
	public int getPrecedence() {
		return 100;
	}

}
