package org.doxer.app.sample.hello;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.dbflute.cbean.result.ListResultBean;
import org.doxer.app.db.dbflute.exentity.TcmSample;
import org.doxer.app.sample.type.TelNo;
import org.doxer.app.sample.type.Val;
import org.doxer.xbase.form.DoxForm;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.message.AppMessagesContainer;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class HelloForm extends DoxForm {

	private Val fval = new Val(REQUIRED, "fval", "dictionary.val");
	private TelNo telNo = new TelNo(REQUIRED, "telNo", "dictionary.telNo");

	private ListResultBean<TcmSample> results;
	
	@Override
	public void validate(AppMessagesContainer container) {
		fval.valid(container);
		telNo.valid(container);
	}

}
