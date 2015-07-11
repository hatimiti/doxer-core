package org.doxer.app.sample.ad.login;

import static com.github.hatimiti.flutist.common.domain.supports.InputAttribute.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.doxer.app.base.type.form.sample.ad.master.cmshain.LoginCd;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.Password;
import org.doxer.xbase.form.DoxForm;
import org.doxer.xbase.validation.validator.FormValidator;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.domain.supports.Condition;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class LoginForm extends DoxForm {

	@Condition LoginCd loginCd = new LoginCd(REQUIRED);
	@Condition Password password = new Password(REQUIRED);

	class Validate implements FormValidator {
		@Override
		public void validate(AppMessagesContainer c) {
			loginCd.validateOnlyRequired(c);
			password.validateOnlyRequired(c);
		}
	}

}
