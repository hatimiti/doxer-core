package org.doxer.app.sample.hello;

import static com.github.hatimiti.flutist.common.message.AppMessageLevel.*;
import static com.github.hatimiti.flutist.common.util.CharacterEncoding.*;
import static com.github.hatimiti.flutist.common.util.MIMEType.*;
import static com.github.hatimiti.flutist.common.util._Http.*;
import static org.doxer.xbase.aop.interceptor.supports.TokenType.*;
import static org.doxer.xbase.controller.DoxController.DoxModelAndView.*;
import static org.doxer.xbase.report.birt.DoxBirt.BIRT_OUTPUT_FORMAT.*;
import static org.doxer.xbase.util._Container.*;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.doxer.app.sample.hello.HelloForm.Validate;
import org.doxer.xbase.aop.interceptor.supports.DoValidation;
import org.doxer.xbase.aop.interceptor.supports.Token;
import org.doxer.xbase.controller.DoxController;
import org.doxer.xbase.form.AccessUser;
import org.doxer.xbase.report.birt.DoxBirt;
import org.doxer.xbase.util._Container;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.hatimiti.doxsl.core.Doxls;
import com.github.hatimiti.flutist.common.annotation.Function;
import com.github.hatimiti.flutist.common.message.AppMessage;

@Controller
@Function("S0001")
@RequestMapping("/sample/hello")
public class HelloController extends DoxController {

	@Resource HelloService helloService;
	@Resource AccessUser accessUser;

	@Token(SET)
	@RequestMapping("/index")
	public DoxModelAndView index(HelloForm form) {
		LOG.info("ログ出力テスト 時間={}", getAccessDate());
		LOG.info("user = {}", accessUser);
		accessUser.setNameMei("hatimiti");
		return view("/hello/hello.html", form);
	}

//	@Token(CHECK_AND_SET)
	@DoValidation(v = { Validate.class }, to = "/hello/hello.html")
	@RequestMapping("/input")
	public DoxModelAndView input(HelloForm form) {
		this.helloService.search(form);
		LOG.info("ログ出力テスト2, {}", form.getResults());
		addMessage(new AppMessage(INFO, "hello2", prop("val"), prop("samplemes")));
		return view("/hello/hello.html", form);
	}

	@RequestMapping("/redirect")
	public DoxModelAndView redirectTo(HelloForm form, RedirectAttributes ra) {
		ra.addAttribute("val", "リダイレクトで遷移しました");
		return redirect("input", ra);
	}

	@RequestMapping("/forward")
	public DoxModelAndView forwardTo(HelloForm form) {
		return forward("input");
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public DoxModelAndView upload(HelloForm form) {

		try (OutputStream stream = new BufferedOutputStream(
				new FileOutputStream(Paths.get("//LS-XHLE38/share/var/", form.getFileName()).toFile()))) {

			stream.write(form.getFile().getBytes());
			addMessage(new AppMessage(INFO, "completes.upload"));

		} catch (Exception e) {
			LOG.info("message = {}, stacktrace = {}", e.getMessage(), e.getStackTrace());
		}

		return view("/hello/hello.html", form);
	}

	@RequestMapping(value = "/download")
	public void downloadFile(HelloForm form) {
		_Container.downloadFile(Paths.get("//LS-XHLE38/share/var/", form.getFileName()));
	}

	@RequestMapping(value = "/output-doxls")
	public void outputReportDoxls(HelloForm form) throws Exception {
		try (Doxls xls = new Doxls("templates/report/xls/nested_command_template.xls",
				getOutputStreamForDownload(
					getHttpServletResponse(), UTF8, APPL_OCTET_STREAM, "sample.xls"))) {

			List<Employee> employees = new ArrayList<Employee>();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-dd", Locale.US);
			employees.add( new Employee("Elsa", dateFormat.parse("1970-Jul-10"), 1500, 0.15) );
			employees.add( new Employee("Oleg", dateFormat.parse("1973-Apr-30"), 2300, 0.25) );
			employees.add( new Employee("Neil", dateFormat.parse("1975-Oct-05"), 2500, 0.00) );
			employees.add( new Employee("Maria", dateFormat.parse("1978-Jan-07"), 1700, 0.15) );
			employees.add( new Employee("John", dateFormat.parse("1969-May-30"), 2800, 0.20) );

			xls.put("employees", employees);
			xls.applyAtArea(0, "Result!A1");
			xls.output();
			xls.removeSheetByNameOf("Template");
		}
	}

	@RequestMapping(value = "/output-report")
	public void outputReportPdf(HelloForm form) {
		DoxBirt birt = new DoxBirt(
				"/sample/hello/hello.rptdesign",
				"//LS-XHLE38/share/var/hello.pdf",
				PDF);
		birt.output("hello", "Hello, BIRT");

		form.setFileName("hello.pdf");
		download(form);
	}

	@RequestMapping(value = "/output-xls")
	public void outputReportXls(HelloForm form) {
		DoxBirt birt = new DoxBirt(
				"/sample/hello/hello_xls.rptdesign",
				"//LS-XHLE38/share/var/hello.xlsx",
				XLSX_OFFICE2010);
		birt.output("hello", "Hello, BIRT");

		form.setFileName("hello.xlsx");
		download(form);
	}

}
