package org.doxer.app.sample.hello;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.val;

import org.dbflute.cbean.result.ListResultBean;
import org.doxer.app.db.dbflute.exentity.TcmSample;
import org.doxer.app.sample.type.Val;
import org.doxer.xbase.form.DoxForm;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.validation.ValidationMessage;
import com.github.hatimiti.flutist.common.validation.ValidationMessages;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class HelloForm extends DoxForm {

	private Val val;

	private ListResultBean<TcmSample> results;
	
	public ValidationMessages validate() {
		val errors = new ValidationMessages();
		System.out.println("Validate HOGEHOGE");
		errors.add("val", new ValidationMessage("mes.req"));
		return errors;
	}
	
}
