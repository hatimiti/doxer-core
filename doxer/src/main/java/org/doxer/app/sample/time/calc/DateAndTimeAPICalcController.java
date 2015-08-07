package org.doxer.app.sample.time.calc;

import static com.github.hatimiti.flutist.common.util._Num.*;
import static org.doxer.xbase.controller.DoxController.DoxModelAndView.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

import org.doxer.app.base.controller.BaseMasterController;
import org.doxer.app.sample.time.calc.DateAndTimeAPICalcForm.ValidateEndOfMonth;
import org.doxer.app.sample.time.calc.DateAndTimeAPICalcForm.ValidateNextDayOfWeek;
import org.doxer.app.sample.time.calc.DateAndTimeAPICalcForm.ValidateNowAfterN;
import org.doxer.xbase.aop.interceptor.supports.DoValidation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.hatimiti.flutist.common.annotation.Function;

/**
 * sample
 * @author hatimiti
 */
@Controller
@Function("T0101")
@RequestMapping(DateAndTimeAPICalcController.BASE_URI)
public class DateAndTimeAPICalcController extends BaseMasterController {

	public static final String BASE_URI = "/sample/timeapi/calc/";

	@RequestMapping
	public DoxModelAndView index(DateAndTimeAPICalcForm form) {
		return view(BASE_URI, "index.html", form);
	}

	@DoValidation(v = { ValidateNowAfterN.class }, to = BASE_URI + "index.html")
	@RequestMapping(params = "nowAfterN")
	public DoxModelAndView nowAfterN(DateAndTimeAPICalcForm form) {

		LocalDate now = LocalDate.now();
		LocalDate afterN = now.plusDays(Long.parseLong(form.val1));
		form.afterNDayFromNow = afterN.format(DateTimeFormatter.ofPattern("yyyy/MM/dd(E)"))
				+ (afterN.isLeapYear() ? " [閏年]" : "");

		return view(BASE_URI, "index.html", form);
	}

	@DoValidation(v = { ValidateNextDayOfWeek.class }, to = BASE_URI + "index.html")
	@RequestMapping(params = "nextDayOfWeek")
	public DoxModelAndView nextDayOfWeek(DateAndTimeAPICalcForm form) {

		DayOfWeek dow = DayOfWeek.of(asIntOrNull(form.val2));
		LocalDate next = LocalDate.now().with(TemporalAdjusters.next(dow));
		form.nextDayOfWeek = next.format(DateTimeFormatter.ofPattern("yyyy/MM/dd(E)"));

		return view(BASE_URI, "index.html", form);
	}

	@DoValidation(v = { ValidateEndOfMonth.class }, to = BASE_URI + "index.html")
	@RequestMapping(params = "endOfMonth")
	public DoxModelAndView endOfMonth(DateAndTimeAPICalcForm form) {

		YearMonth ym = YearMonth.of(asIntOrNull(form.val3), asIntOrNull(form.val4));
		form.endOfMonth = String.valueOf(ym.atEndOfMonth().getDayOfMonth());

		return view(BASE_URI, "index.html", form);
	}

}
