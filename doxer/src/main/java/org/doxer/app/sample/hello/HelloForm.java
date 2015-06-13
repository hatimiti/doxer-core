package org.doxer.app.sample.hello;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.dbflute.cbean.result.ListResultBean;
import org.doxer.app.base.type.form.common.TelNo;
import org.doxer.app.base.type.form.hello.Val;
import org.doxer.app.db.dbflute.exentity.TcmSample;
import org.doxer.xbase.form.DoxForm;
import org.doxer.xbase.validation.validator.FormValidator;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.github.hatimiti.flutist.common.message.AppMessagesContainer;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class HelloForm extends DoxForm {

	private Val fval = new Val(REQUIRED, "fval", "dictionary.val");
	private TelNo telNo = new TelNo(REQUIRED, "telNo", "dictionary.telNo");

	private String fileName;
	private MultipartFile file;

	private ListResultBean<TcmSample> results;

	class Validate implements FormValidator {
		@Override
		public void validate(AppMessagesContainer c) {
			fval.validate(c);
			telNo.validate(c);
		}
	}

}
