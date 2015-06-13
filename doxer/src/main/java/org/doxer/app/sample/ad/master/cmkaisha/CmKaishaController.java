package org.doxer.app.sample.ad.master.cmkaisha;

import static com.github.hatimiti.flutist.common.util._Obj.*;
import static org.doxer.xbase.aop.interceptor.supports.DoValidation.TransitionMethod.*;
import static org.doxer.xbase.aop.interceptor.supports.TokenType.*;

import javax.annotation.Resource;

import org.doxer.app.base.controller.BaseMasterController;
import org.doxer.app.base.type.form.sample.ad.master.CmKaishaId;
import org.doxer.app.db.dbflute.allcommon.CDef.Mode;
import org.doxer.app.db.dbflute.exentity.CmKaisha;
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
@SessionAttributes("cmKaishaForm")
@RequestMapping(CmKaishaController.BASE_URI)
public class CmKaishaController extends BaseMasterController {

	public static final String BASE_URI = "/sample/ad/master/cmKaisha";

	@Resource CmKaishaService cmKaishaService;

	@RequestMapping("/")
	public String index(CmKaishaForm form) {
		return prepareRegister(form);
	}

	// 登録

	@Token(SET)
	@RequestMapping("/prepareRegister")
	public String prepareRegister(CmKaishaForm form) {
		copy(new CmKaishaForm(), form);
		form.mode = Mode.Register;
		this.cmKaishaService.prepareRegister(form);
		return view(BASE_URI + "/prepareRegister", form);
	}

	@DoValidation(value = "backToPrepare", transition = FORWORD)
	@RequestMapping(value = "/", params = "confirmRegister")
	public String confirmRegister(CmKaishaForm form) {
		return view(BASE_URI + "/confirmRegister", form);
	}

	@Token(CHECK)
	@DoValidation(value = "prepareRegister", transition = REDIRECT)
	@RequestMapping("/register")
	public String register(CmKaishaForm form) {
		CmKaisha kaisha = this.cmKaishaService.register(form);
		saveRegisterMessage(kaisha.getCmKaishaId());
		return "complete";
	}

	// 更新

	@Token(SET)
	@DoValidation(value = "backToList", method = "validId")
	@RequestMapping("/prepareUpdate")
	public String prepareUpdate(CmKaishaForm form) {

		final CmKaishaId tmpId = form.cmKaishaId;
		copy(new CmKaishaForm(), form);
		form.cmKaishaId = tmpId;

		form.mode = Mode.Update;
		this.cmKaishaService.prepareUpdate(form);

		return "prepareUpdate.jsp";
	}

	@DoValidation(value = "prepareUpdate.jsp", method = "validate, validId")
	@RequestMapping("/confirmUpdate")
	public String confirmUpdate(CmKaishaForm form) {
		return "confirmUpadte.jsp";
	}

	@Token(CHECK)
	@DoValidation(value = "prepareUpdate.jsp", method = "validate, validId", transition = REDIRECT)
	@RequestMapping("/update")
	public String update(CmKaishaForm form) {
		CmKaisha kaisha = this.cmKaishaService.update(form);
		saveUpdateMessage(kaisha.getCmKaishaId());
		return "complete";
	}

	// 削除

	@Token(SET)
	@DoValidation(value = "backToList", method = "validId")
	@RequestMapping("/confirmDelete")
	public String confirmDelete(CmKaishaForm form) {

		final CmKaishaId tmpId = form.cmKaishaId;
		copy(new CmKaishaForm(), form);
		form.cmKaishaId = tmpId;

		form.mode = Mode.Delete;
		this.cmKaishaService.confirmDelete(form);
		return "confirmDelete.jsp";
	}


	@Token(CHECK)
	@DoValidation(value = "backToList", method = "validId", transition = REDIRECT)
	@RequestMapping("/delete")
	public String delete(CmKaishaForm form) {
		CmKaisha kaisha = this.cmKaishaService.delete(form);
		saveDeleteMessage(kaisha.getCmKaishaId());
		return "complete";
	}

	// 共通

	@DoValidation(value = "backToPrepare", method = "validAddTesuryo", transition = FORWORD)
	@RequestMapping(value = "/", params = "addTesuryo")
	public String addTesuryo(CmKaishaForm form) {
		this.cmKaishaService.addTesuryo(form);
		return backToPrepare(form);
	}

	@RequestMapping(value = "/", params = "addRenrakusaki")
	public String addRenrakusaki(CmKaishaForm form) {
		this.cmKaishaService.addRenrakusaki(form);
		return backToPrepare(form);
	}

	@RequestMapping("/complete")
	public String complete(CmKaishaForm form) {
		return "complete.jsp";
	}

	@RequestMapping("/backToList")
	public String backToList(CmKaishaForm form, RedirectAttributes ra) {
		return redirect("/sample/ad/master/cmKaishaList/search", ra);
	}

	@RequestMapping("/backToPrepare")
	public String backToPrepare(CmKaishaForm form) {
		switch (form.mode) {
		case Register:
			return view(BASE_URI + "/prepareRegister", form);
		case Update:
			return view(BASE_URI + "/prepareUpdate", form);
		case Delete:
			return view(BASE_URI + "/prepareDelete", form);
		case Replicate:
		default:
			return view(BASE_URI + "/prepareRegister", form);
		}
	}

}
