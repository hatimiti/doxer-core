package org.doxer.app.sample.ad.master.cmshain;

import static com.github.hatimiti.flutist.common.message.AppMessageLevel.*;
import static com.github.hatimiti.flutist.common.util.CharacterEncoding.*;
import static com.github.hatimiti.flutist.common.util._Obj.*;
import static org.doxer.xbase.aop.interceptor.supports.DoValidation.TransitionMethod.*;
import static org.doxer.xbase.aop.interceptor.supports.TokenType.*;
import static org.doxer.xbase.controller.DoxController.DoxModelAndView.*;
import static org.doxer.xbase.util._Container.*;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import javax.annotation.Resource;

import org.doxer.app.base.controller.BaseMasterController;
import org.doxer.app.base.type.form.sample.ad.master.cmshain.CmShainId;
import org.doxer.app.db.dbflute.allcommon.CDef.Mode;
import org.doxer.app.db.dbflute.exentity.CmShain;
import org.doxer.app.sample.ad.master.cmshain.CmShainForm.ValidId;
import org.doxer.app.sample.ad.master.cmshain.CmShainForm.Validate;
import org.doxer.app.sample.ad.master.cmshain.CmShainListForm.ValidateCsvUpload;
import org.doxer.app.sample.ad.master.cmshain.CmShainListForm.ValidateDownload;
import org.doxer.app.sample.ad.master.cmshain.CmShainListForm.ValidateList;
import org.doxer.xbase.aop.interceptor.supports.DoValidation;
import org.doxer.xbase.aop.interceptor.supports.Token;
import org.doxer.xbase.util.Downloads;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.hatimiti.flutist.common.annotation.Function;
import com.github.hatimiti.flutist.common.message.AppMessage;

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
		form.compresses.off();
		return view(BASE_URI, "index.html", form);
	}

	@DoValidation(v = { ValidateList.class }, to = BASE_URI + "index.html")
	@RequestMapping("search")
	public DoxModelAndView search(CmShainListForm form) {
		this.cmShainService.search(form);
		return view(BASE_URI, "index.html", form);
	}

	// CSVダウンロード

	@DoValidation(v = { ValidateDownload.class }, to = BASE_URI + "index.html")
	@RequestMapping(path = "search", params = "download")
	public DoxModelAndView downloadShainCsv(CmShainListForm form) throws Exception {
		if (form.compresses.isOn()) {
			Downloads.downloadZipCsv(
					"shain.zip", form, UTF8, cmShainService::outputCsvBySearchCondition);
		} else {
			Downloads.downloadPlainCsv(
					"shain.csv", form, UTF8, cmShainService::outputCsvBySearchCondition);
		}
		return download(form);
	}

	// CSVアップロード

	@DoValidation(v = { ValidateCsvUpload.class }, to = BASE_URI + "index.html")
	@RequestMapping(params = "upload", method = POST)
	public DoxModelAndView upload(CmShainListForm form) {
		this.cmShainService.inputCsv(form);
		addMessage(new AppMessage(INFO, "completes.upload"));
		return view(BASE_URI, "index.html", form);
	}

	// 登録

	@Token(SET)
	@RequestMapping(params = "prepareRegister")
	public DoxModelAndView prepareRegister(CmShainForm form) {
		init(form, Mode.Register);
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
	@DoValidation(v = { ValidId.class }, to = "backToList", transition = FORWORD)
	@RequestMapping(params = "prepareUpdate")
	public DoxModelAndView prepareUpdate(CmShainForm form) {
		init(form, Mode.Update);
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
		init(form, Mode.Delete);
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

	private void init(CmShainForm form, Mode mode) {
		final CmShainId tmpId = form.cmShainId;
		copy(new CmShainForm(), form);
		form.cmShainId = tmpId;
		form.mode = mode;
	}

}
