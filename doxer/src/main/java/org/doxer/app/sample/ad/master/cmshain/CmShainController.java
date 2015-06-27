package org.doxer.app.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.util.CharacterEncoding.*;
import static com.github.hatimiti.flutist.common.util.MIMEType.*;
import static com.github.hatimiti.flutist.common.util._Obj.*;
import static org.doxer.xbase.aop.interceptor.supports.DoValidation.TransitionMethod.*;
import static org.doxer.xbase.aop.interceptor.supports.TokenType.*;
import static org.doxer.xbase.controller.DoxController.DoxModelAndView.*;
import static org.doxer.xbase.util._Container.*;

import java.io.Writer;

import javax.annotation.Resource;

import lombok.val;

import org.doxer.app.base.controller.BaseMasterController;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.CmShainId;
import org.doxer.app.db.dbflute.allcommon.CDef.Mode;
import org.doxer.app.db.dbflute.exentity.CmShain;
import org.doxer.app.sample.ad.master.cmshain.CmShainForm.ValidId;
import org.doxer.app.sample.ad.master.cmshain.CmShainForm.Validate;
import org.doxer.xbase.aop.interceptor.supports.DoValidation;
import org.doxer.xbase.aop.interceptor.supports.Token;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.hatimiti.flutist.common.annotation.Function;
import com.github.hatimiti.flutist.common.util._Http;

/**
 * sample
 * @author hatimiti
 */
@Controller
@Function("S0102")
@SessionAttributes(types = { CmShainListForm.class, CmShainForm.class })
@RequestMapping(CmShainController.BASE_URI)
public class CmShainController extends BaseMasterController {

	public static final String BASE_URI = "/sample/ad/master/cmShain/";

	@Resource CmShainService cmShainService;

	// 一覧

	@RequestMapping
	public DoxModelAndView index(CmShainListForm form) {
		copy(new CmShainListForm(), form);
		return view(BASE_URI, "index.html", form);
	}

	@DoValidation(v = { CmShainListForm.Validate.class }, to = BASE_URI + "index.html")
	@RequestMapping("search")
	public DoxModelAndView search(CmShainListForm form) {
		this.cmShainService.search(form);
		return view(BASE_URI, "index.html", form);
	}

	// CSVダウンロード

	@RequestMapping(path = "search", params = "download")
	public void download(CmShainListForm form) throws Exception {
		try (Writer out = _Http.getWriterForDownload(
				getHttpServletResponse(), UTF8, APPL_OCTET_STREAM, "shain.csv")) {
			this.cmShainService.outputCsvBySearchCondition(form, out);
		}
	}

	// 登録

	@Token(SET)
	@RequestMapping(params = "prepareRegister")
	public DoxModelAndView prepareRegister(CmShainForm form) {
		copy(new CmShainForm(), form);
		form.mode = Mode.Register;
		return view(BASE_URI, "edit.html", form);
	}

	@DoValidation(v = { Validate.class }, to = "backToPrepare", transition = FORWORD)
	@RequestMapping(params = "confirmRegister")
	public DoxModelAndView confirmRegister(CmShainForm form) {
		return view(BASE_URI, "confirm.html", form);
	}

	@Token(CHECK)
	@DoValidation(v = { Validate.class }, to = "backToList", transition = FORWORD)
	@RequestMapping(params = "register")
	public DoxModelAndView register(CmShainForm form, RedirectAttributes ra) {
		CmShain shain = this.cmShainService.register(form);
		saveRegisterMessage(shain.getCmShainId());
		return redirect("complete", ra);
	}

	// 更新

	@Token(SET)
	@DoValidation(v = { ValidId.class }, to = "backToList")
	@RequestMapping(params = "prepareUpdate")
	public DoxModelAndView prepareUpdate(CmShainForm form) {

		val tmpId = form.cmShainId;
		copy(new CmShainForm(), form);
		form.cmShainId = tmpId;

		form.mode = Mode.Update;
		this.cmShainService.prepareUpdate(form);

		return view(BASE_URI, "edit.html", form);
	}

	@DoValidation(v = { Validate.class, ValidId.class }, to = "backToPrepare", transition = FORWORD)
	@RequestMapping(params = "confirmUpdate")
	public DoxModelAndView confirmUpdate(CmShainForm form) {
		return view(BASE_URI, "confirm.html", form);
	}

	@Token(CHECK)
	@DoValidation(v = { Validate.class, ValidId.class }, to = "backToList", transition = FORWORD)
	@RequestMapping(params = "update")
	public DoxModelAndView update(CmShainForm form, RedirectAttributes ra) {
		CmShain shain = this.cmShainService.update(form);
		saveUpdateMessage(shain.getCmShainId());
		return redirect("complete", ra);
	}

	// 削除

	@Token(SET)
	@DoValidation(v = { ValidId.class }, to = "backToList", transition = FORWORD)
	@RequestMapping(params = "confirmDelete")
	public DoxModelAndView confirmDelete(CmShainForm form) {

		final CmShainId tmpId = form.cmShainId;
		copy(new CmShainForm(), form);
		form.cmShainId = tmpId;

		form.mode = Mode.Delete;
		this.cmShainService.confirmDelete(form);
		return view(BASE_URI, "confirm.html", form);
	}


	@Token(CHECK)
	@DoValidation(v = { ValidId.class }, to = "backToList", transition = FORWORD)
	@RequestMapping(params = "delete")
	public DoxModelAndView delete(CmShainForm form, RedirectAttributes ra) {
		CmShain shain = this.cmShainService.delete(form);
		saveDeleteMessage(shain.getCmShainId());
		return redirect("complete", ra);
	}

	// 共通

	@RequestMapping("complete")
	public DoxModelAndView complete(CmShainForm form) {
		return view(BASE_URI, "complete.html", form);
	}

	@RequestMapping(params = "backToList")
	public DoxModelAndView backToList(CmShainForm form, RedirectAttributes ra) {
		return redirect("search", ra);
	}

	@RequestMapping(params = "backToPrepare")
	public DoxModelAndView backToPrepare(CmShainForm form) {
		if (Mode.Delete == form.mode) {
			return backToList(form, null);
		}
		return view(BASE_URI, "edit.html", form);
	}

}
