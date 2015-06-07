package org.doxer.app.sample.ad.master.cmkaisha;

import javax.annotation.Resource;

import kite.common.action.BaseAction;
import kite.form.sample.ad.master.CmKaishaListForm;
import kite.service.sample.ad.master.CmKaishaService;

import org.seasar.struts.annotation.ActionForm;

import fw.support.annotation.JExecute;

/**
 * sample
 * @author m-kakimi
 */
public class CmKaishaListController extends BaseAction {

	@Resource
	@ActionForm
	public CmKaishaListForm cmKaishaListForm;

	@Resource
	public CmKaishaService cmKaishaService;

	@Override
	@JExecute
	public String index() {
		return "index.html";
	}

	@JExecute(v = "valid", i = "index.html")
	public String search() {
		this.cmKaishaService.search(this.cmKaishaListForm);
		return "index.html";
	}
}
