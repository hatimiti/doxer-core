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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.github.hatimiti.flutist.common.annotation.Function;

/**
 * sample
 * @author hatimiti
 */
@Controller
@Function("S0101")
@RequestMapping(CmKaishaController.BASE_URI)
public class CmKaishaController extends BaseMasterController {

	public static final String BASE_URI = "/sample/ad/master/cmKaisha";

	@Resource CmKaishaService cmKaishaService;

	@RequestMapping("/")
	public String index(CmKaishaForm cmKaishaForm) {
		return prepareRegister(cmKaishaForm);
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

	@DoValidation(value = "prepareRegister.html")
	@RequestMapping("/confirmRegister")
	public String confirmRegister(CmKaishaForm cmKaishaForm) {
		return "confirmRegister.jsp";
	}

	@Token(CHECK)
	@DoValidation(value = "prepareRegister.html", transition = REDIRECT)
	@RequestMapping("/register")
	public String register(CmKaishaForm cmKaishaForm) {
		CmKaisha kaisha = this.cmKaishaService.register(cmKaishaForm);
		saveRegisterMessage(kaisha.getCmKaishaId());
		return "complete";
	}

	// 更新

	@Token(SET)
	@DoValidation(value = "backToList", method = "validId")
	@RequestMapping("/prepareUpdate")
	public String prepareUpdate(CmKaishaForm cmKaishaForm) {

		final CmKaishaId tmpId = cmKaishaForm.cmKaishaId;
		copy(new CmKaishaForm(), cmKaishaForm);
		cmKaishaForm.cmKaishaId = tmpId;

		cmKaishaForm.mode = Mode.Update;
		this.cmKaishaService.prepareUpdate(cmKaishaForm);

		return "prepareUpdate.jsp";
	}

	@DoValidation(value = "prepareUpdate.jsp", method = "validate, validId")
	@RequestMapping("/confirmUpdate")
	public String confirmUpdate(CmKaishaForm cmKaishaForm) {
		return "confirmUpadte.jsp";
	}

	@Token(CHECK)
	@DoValidation(value = "prepareUpdate.jsp", method = "validate, validId", transition = REDIRECT)
	@RequestMapping("/update")
	public String update(CmKaishaForm cmKaishaForm) {
		CmKaisha kaisha = this.cmKaishaService.update(cmKaishaForm);
		saveUpdateMessage(kaisha.getCmKaishaId());
		return "complete";
	}

	// 削除

	@Token(SET)
	@DoValidation(value = "backToList", method = "validId")
	@RequestMapping("/confirmDelete")
	public String confirmDelete(CmKaishaForm cmKaishaForm) {

		final CmKaishaId tmpId = cmKaishaForm.cmKaishaId;
		copy(new CmKaishaForm(), cmKaishaForm);
		cmKaishaForm.cmKaishaId = tmpId;

		cmKaishaForm.mode = Mode.Delete;
		this.cmKaishaService.confirmDelete(cmKaishaForm);
		return "confirmDelete.jsp";
	}


	@Token(CHECK)
	@DoValidation(value = "backToList", method = "validId", transition = REDIRECT)
	@RequestMapping("/delete")
	public String delete(CmKaishaForm cmKaishaForm) {
		CmKaisha kaisha = this.cmKaishaService.delete(cmKaishaForm);
		saveDeleteMessage(kaisha.getCmKaishaId());
		return "complete";
	}

	// 共通

	@DoValidation(value = "backToPrepare", method = "validAddTesuryo")
	@RequestMapping("/addTesuryo")
	public String addTesuryo(CmKaishaForm cmKaishaForm) {
		this.cmKaishaService.addTesuryo(cmKaishaForm);
		return backToPrepare(cmKaishaForm);
	}

	@RequestMapping("/addRenrakusaki")
	public String addRenrakusaki(CmKaishaForm cmKaishaForm) {
		this.cmKaishaService.addRenrakusaki(cmKaishaForm);
		return backToPrepare(cmKaishaForm);
	}

	@RequestMapping("/complete")
	public String complete(CmKaishaForm cmKaishaForm) {
		return "complete.jsp";
	}

	@RequestMapping("/backToList")
	public String backToList(CmKaishaForm cmKaishaForm, RedirectAttributes ra) {
		return redirect("/sample/ad/master/cmKaishaList/search", ra);
	}

	@RequestMapping
	public String backToPrepare(CmKaishaForm cmKaishaForm) {
		switch (cmKaishaForm.mode) {
		case Register:
			return "prepareRegister.html";
		case Update:
			return "prepareUpdate.jsp";
		case Delete:
			return "prepareDelete.jsp";
		case Replicate:
		default:
			return "prepareRegister.html";
		}
	}

}
