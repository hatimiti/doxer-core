package org.doxer.app.sample.mail;

import static com.github.hatimiti.flutist.common.message.AppMessageLevel.*;
import static org.doxer.app.sample.mail.SendMailController.*;
import static org.doxer.xbase.controller.DoxController.DoxModelAndView.*;
import static org.doxer.xbase.util._Container.*;

import org.doxer.app.sample.mail.SampleMailDataModel.NestedModel;
import org.doxer.xbase.controller.BaseLangController;
import org.doxer.xbase.mail.DoxMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.hatimiti.flutist.common.message.AppMessage;

@Controller
@RequestMapping(BASE_URI)
public class SendMailController extends BaseLangController {

	public static final String BASE_URI = "/sample/sendmail/";

	@RequestMapping
	public DoxModelAndView index(SendMailForm form) {
		return view(BASE_URI, "mail.html", form);
	}

	@RequestMapping(params = "send")
	public DoxModelAndView send(SendMailForm form) throws Exception {
		new DoxMailSender(createModel()).send();
		addMessage(new AppMessage(INFO, false, "メール送信が完了しました。"));
		return view(BASE_URI, "mail.html", form);
	}

	private SampleMailDataModel createModel() {

		SampleMailDataModel m = new SampleMailDataModel();
		m.setName("ここは動的な名前");
		m.setAge(10);

		m.addNestedModel(new NestedModel("value1"));
		m.addNestedModel(new NestedModel("value2"));
		m.addNestedModel(new NestedModel("value3"));

		return m;
	}

}
