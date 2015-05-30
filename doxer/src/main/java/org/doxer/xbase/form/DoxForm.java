package org.doxer.xbase.form;

import lombok.Data;

import com.github.hatimiti.flutist.common.message.AppMessagesContainer;

@Data
public abstract class DoxForm implements Form {
	
	public abstract void validate(AppMessagesContainer container);
	
}

