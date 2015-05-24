package org.doxer.app.sample.hello;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.val;

import org.dbflute.cbean.result.ListResultBean;
import org.doxer.app.db.dbflute.exentity.TcmSample;
import org.doxer.app.sample.type.Val;
import org.doxer.xbase.form.DoxForm;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.message.AppMessages;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.RequiredFieldValidator;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class HelloForm extends DoxForm {

	private Val val;

	private ListResultBean<TcmSample> results;
	
	public AppMessages validate() {
		val messages = new AppMessages();
		val required = new RequiredFieldValidator(messages);
		
		required.check(Vval.of(val.getVal()), "val");
		required.check(Vval.of(val.getVal()), "val");
		
		return messages;
	}
	
}
