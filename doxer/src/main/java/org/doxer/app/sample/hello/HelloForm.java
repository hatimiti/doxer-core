package org.doxer.app.sample.hello;

import static org.doxer.xbase.util._Container.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.val;

import org.dbflute.cbean.result.ListResultBean;
import org.doxer.app.db.dbflute.exentity.TcmSample;
import org.doxer.app.sample.type.Val;
import org.doxer.xbase.form.DoxForm;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.RequiredFieldValidator;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class HelloForm extends DoxForm {

	private Val val;

	private ListResultBean<TcmSample> results;
	
	@Override
	public void validate(AppMessagesContainer container) {
		val required = new RequiredFieldValidator(container);
		required.check(Vval.of(val.getVal()), "val", buildMessage("dictionary.val"));
		required.check(Vval.of(val.getVal()), "val", buildMessage("dictionary.val"));
	}

}
