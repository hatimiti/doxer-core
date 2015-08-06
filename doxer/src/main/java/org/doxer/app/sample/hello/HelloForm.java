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

import com.github.hatimiti.flutist.common.domain.supports.Condition;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.RequiredFieldValidator;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class HelloForm extends DoxForm {

	@Condition Val fval = new Val(REQUIRED);
	@Condition TelNo telNo = new TelNo(REQUIRED);
	@Condition String fileName;
	@Condition MultipartFile file;

	private ListResultBean<TcmSample> results;

	class Validate implements FormValidator {
		@Override
		public void validate(AppMessagesContainer c) {
			fval.validate(c);
			telNo.validate(c);
		}
	}

	class ValidateDownload implements FormValidator {
		@Override
		public void validate(AppMessagesContainer c) {
			new RequiredFieldValidator(c).check(Vval.of(fileName), Owner.of("fileName"), "fileName");
		}
	}

}
