package org.doxer.app.sample.mail;

import static com.github.hatimiti.flutist.common.message.AppMessageLevel.*;
import static org.doxer.app.sample.mail.SendMailController.*;
import static org.doxer.xbase.controller.DoxController.DoxModelAndView.*;
import static org.doxer.xbase.util._Container.*;

import org.doxer.xbase.controller.BaseLangController;
import org.doxer.xbase.mail.DoxMailSender;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.hatimiti.flutist.common.message.AppMessage;
import com.github.hatimiti.flutist.common.util._Obj;

@Controller
@RequestMapping(BASE_URI)
public class SendMailController extends BaseLangController {

	public static final String BASE_URI = "/sample/sendmail/";

	private static final Logger LOG = _Obj.getLogger();

	@RequestMapping
	public DoxModelAndView index(SendMailForm form) {
		return view(BASE_URI, "mail.html", form);
	}

	@RequestMapping(params = "send")
	public DoxModelAndView send(SendMailForm form) throws Exception {

		SampleMailDataModel model = new SampleMailDataModel();

		model.setName("ここは動的な名前");

		DoxMailSender mailSender = new DoxMailSender(model);
		mailSender.send();

		addMessage(new AppMessage(INFO, false, "メール送信が完了しました。"));
		return view(BASE_URI, "mail.html", form);
	}

}
