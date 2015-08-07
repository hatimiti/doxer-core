package org.doxer.app.sample.time.calc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.doxer.xbase.form.DoxForm;
import org.doxer.xbase.validation.validator.FormValidator;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.domain.supports.Condition;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.IntFieldValidator;
import com.github.hatimiti.flutist.common.validation.validator.IntRangeFieldValidator;
import com.github.hatimiti.flutist.common.validation.validator.RequiredFieldValidator;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class DateAndTimeAPICalcForm extends DoxForm {

	@Condition String val1;
	@Condition String val2;

	@Condition String val3;
	@Condition String val4;

	String afterNDayFromNow;
	String nextDayOfWeek;
	String endOfMonth;

	public String getNowDt() {
		LocalDate now = LocalDate.now();
		return now.format(DateTimeFormatter.ISO_DATE);
	}

	class ValidateNowAfterN implements FormValidator {
		@Override
		public void validate(AppMessagesContainer c) throws Exception {
			new RequiredFieldValidator(c).check(Vval.of(val1), Owner.of("val1"), "N");
			new IntFieldValidator(c).check(Vval.of(val1), Owner.of("val1"), "N");
		}
	}

	class ValidateNextDayOfWeek implements FormValidator {
		@Override
		public void validate(AppMessagesContainer c) throws Exception {
			Vval value = Vval.of(val2);
			Owner owner = Owner.of("val2");
			new RequiredFieldValidator(c).check(value, owner, "曜日");
			new IntRangeFieldValidator(c).range(1, 7).check(value, owner, "曜日", 1, 7);
		}
	}

	class ValidateEndOfMonth implements FormValidator {
		@Override
		public void validate(AppMessagesContainer c) throws Exception {
			Vval value = Vval.of(val3);
			Owner owner = Owner.of("val3");
			new RequiredFieldValidator(c).check(value, owner, "年");
			new IntRangeFieldValidator(c).range(1970, 3000).check(value, owner, "年", 1970, 3000);

			Vval value2 = Vval.of(val4);
			Owner owner2 = Owner.of("val4");
			new RequiredFieldValidator(c).check(value2, owner2, "月");
			new IntRangeFieldValidator(c).range(1, 12).check(value2, owner2, "月", 1, 12);
		}
	}

}
