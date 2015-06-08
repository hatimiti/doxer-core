package org.doxer.app.sample.ad.master.cmkaisha;

import javax.annotation.Resource;

import org.doxer.xbase.controller.DoxController;

/**
 * sample
 * @author m-kakimi
 */
public class CmKaishaListController extends DoxController {

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
