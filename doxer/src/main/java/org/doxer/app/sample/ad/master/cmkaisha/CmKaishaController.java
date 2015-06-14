package org.doxer.app.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.util._Obj.*;
import static org.doxer.xbase.aop.interceptor.supports.DoValidation.TransitionMethod.*;
import static org.doxer.xbase.aop.interceptor.supports.TokenType.*;
import static org.doxer.xbase.controller.DoxController.DoxModelAndView.*;

import javax.annotation.Resource;

import org.doxer.app.base.controller.BaseMasterController;
import org.doxer.app.base.type.form.sample.ad.master.CmKaishaId;
import org.doxer.app.db.dbflute.allcommon.CDef.Mode;
import org.doxer.app.db.dbflute.exentity.CmKaisha;
import org.doxer.app.sample.ad.master.cmkaisha.CmKaishaForm.ValidAddTesuryo;
import org.doxer.app.sample.ad.master.cmkaisha.CmKaishaForm.ValidId;
import org.doxer.app.sample.ad.master.cmkaisha.CmKaishaForm.Validate;
import org.doxer.xbase.aop.interceptor.supports.DoValidation;
import org.doxer.xbase.aop.interceptor.supports.Token;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.hatimiti.flutist.common.annotation.Function;

/**
 * sample
 * @author hatimiti
 */
@Controller
@Function("S0101")
@SessionAttributes(types = { CmKaishaListForm.class, CmKaishaForm.class })
@RequestMapping(CmKaishaController.BASE_URI)
public class CmKaishaController extends BaseMasterController {

	public static final String BASE_URI = "/sample/ad/master/cmKaisha/";

	@Resource CmKaishaService cmKaishaService;

	// 一覧

	@RequestMapping
	public DoxModelAndView index(CmKaishaListForm form) {
		return view(BASE_URI, "index.html", form);
	}

	@DoValidation(v = { CmKaishaListForm.Validate.class }, to = BASE_URI + "index.html")
	@RequestMapping("search")
	public DoxModelAndView search(CmKaishaListForm form) {
		this.cmKaishaService.search(form);
		return view(BASE_URI, "index.html", form);
	}

	// 登録

	@Token(SET)
	@RequestMapping(params = "prepareRegister")
	public DoxModelAndView prepareRegister(CmKaishaForm form) {
		copy(new CmKaishaForm(), form);
		form.mode = Mode.Register;
		this.cmKaishaService.prepareRegister(form);
		return view(BASE_URI, "edit.html", form);
	}

	@DoValidation(v = { Validate.class }, to = "backToPrepare", transition = FORWORD)
	@RequestMapping(params = "confirmRegister")
	public DoxModelAndView confirmRegister(CmKaishaForm form) {
		return view(BASE_URI, "confirm.html", form);
	}

	@Token(CHECK)
	@DoValidation(v = { Validate.class }, to = "backToList", transition = FORWORD)
	@RequestMapping(params = "register")
	public DoxModelAndView register(CmKaishaForm form, RedirectAttributes ra) {
		CmKaisha kaisha = this.cmKaishaService.register(form);
		saveRegisterMessage(kaisha.getCmKaishaId());
		return redirect("complete", ra);
	}

	// 更新

	@Token(SET)
	@DoValidation(v = { ValidId.class }, to = "backToList")
	@RequestMapping(params = "prepareUpdate")
	public DoxModelAndView prepareUpdate(CmKaishaForm form) {

		final CmKaishaId tmpId = form.cmKaishaId;
		copy(new CmKaishaForm(), form);
		form.cmKaishaId = tmpId;

		form.mode = Mode.Update;
		this.cmKaishaService.prepareUpdate(form);

		return view(BASE_URI, "edit.html", form);
	}

	@DoValidation(v = { Validate.class, ValidId.class }, to = "backToPrepare", transition = FORWORD)
	@RequestMapping(params = "confirmUpdate")
	public DoxModelAndView confirmUpdate(CmKaishaForm form) {
		return view(BASE_URI, "confirm.html", form);
	}

	@Token(CHECK)
	@DoValidation(v = { Validate.class, ValidId.class }, to = "backToList", transition = FORWORD)
	@RequestMapping(params = "update")
	public DoxModelAndView update(CmKaishaForm form, RedirectAttributes ra) {
		CmKaisha kaisha = this.cmKaishaService.update(form);
		saveUpdateMessage(kaisha.getCmKaishaId());
		return redirect("complete", ra);
	}

	// 削除

	@Token(SET)
	@DoValidation(v = { ValidId.class }, to = "backToList", transition = FORWORD)
	@RequestMapping(params = "confirmDelete")
	public DoxModelAndView confirmDelete(CmKaishaForm form) {

		final CmKaishaId tmpId = form.cmKaishaId;
		copy(new CmKaishaForm(), form);
		form.cmKaishaId = tmpId;

		form.mode = Mode.Delete;
		this.cmKaishaService.confirmDelete(form);
		return view(BASE_URI, "confirm.html", form);
	}


	@Token(CHECK)
	@DoValidation(v = { ValidId.class }, to = "backToList", transition = FORWORD)
	@RequestMapping(params = "delete")
	public DoxModelAndView delete(CmKaishaForm form, RedirectAttributes ra) {
		CmKaisha kaisha = this.cmKaishaService.delete(form);
		saveDeleteMessage(kaisha.getCmKaishaId());
		return redirect("complete", ra);
	}

	// 共通

	@DoValidation(v = { ValidAddTesuryo.class }, to = "backToPrepare", transition = FORWORD)
	@RequestMapping(params = "addTesuryo")
	public DoxModelAndView addTesuryo(CmKaishaForm form) {
		this.cmKaishaService.addTesuryo(form);
		return backToPrepare(form);
	}

	@RequestMapping(params = "addRenrakusaki")
	public DoxModelAndView addRenrakusaki(CmKaishaForm form) {
		this.cmKaishaService.addRenrakusaki(form);
		return backToPrepare(form);
	}

	@RequestMapping("complete")
	public DoxModelAndView complete(CmKaishaForm form) {
		return view(BASE_URI, "complete.html", form);
	}

	@RequestMapping(params = "backToList")
	public DoxModelAndView backToList(CmKaishaForm form, RedirectAttributes ra) {
		return redirect("search", ra);
	}

	@RequestMapping(params = "backToPrepare")
	public DoxModelAndView backToPrepare(CmKaishaForm form) {
		if (Mode.Delete == form.mode) {
			return backToList(form, null);
		}
		return view(BASE_URI, "edit.html", form);
	}

}
