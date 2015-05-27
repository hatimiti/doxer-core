package org.doxer.xbase.thymeleaf.dialect.sa;

import java.util.HashSet;
import java.util.Set;

import org.doxer.xbase.thymeleaf.processor.sa.ErrorsMessageProcessor;
import org.doxer.xbase.thymeleaf.processor.sa.ErrorsStyleClassProcessor;
import org.doxer.xbase.thymeleaf.processor.sa.RadioAttrProcessor;
import org.doxer.xbase.thymeleaf.processor.sa.TextAttrProcessor;
import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.processor.IProcessor;

public class SADialect extends AbstractDialect {

	@Override
	public String getPrefix() {
		return "sa";
	}
	
	@Override
	public Set<IProcessor> getProcessors() {

		HashSet<IProcessor> processors = new HashSet<IProcessor>();
		processors.add(new ErrorsMessageProcessor());
		processors.add(new ErrorsStyleClassProcessor());
		processors.add(new TextAttrProcessor());
		processors.add(new RadioAttrProcessor());
		return processors;
	}
	
}