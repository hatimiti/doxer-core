package org.doxer.xbase.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

public class DoxDispatcherServlet extends DispatcherServlet {

	public static final String MODEL_AND_VIEW_FORM_KEY = "__DOX_MODEL_AND_VIEW_FORM_KEY__";

	@Override
	protected void render(
			ModelAndView mv,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		if (!mv.hasView()) {
			// getDefaultViewName() メソッドで null が返された際の対応
			return;
		}

		// JUnit実行時はテスト専用のDispatcherServlet(TestDispatcherServlet)が呼び出されるため
		// 当クラスでユニットテストに影響ある処理を実装するとテストがエラーとなるため注意
		// 上記理由より下記処理は一旦削除
//		mv.addObject("form", request.getAttribute(MODEL_AND_VIEW_FORM_KEY));
		super.render(mv, request, response);
	}

	@Override
	protected String getDefaultViewName(HttpServletRequest request)
			throws Exception {
		/*
		 * ファイルダウンロード処理実装時にコントローラ戻り値をnullにした際に
		 * 当メソッドでデフォルトのView名が設定され、レンダリング処理に進んでしまうため
		 * nullでオーバーライドすることとする．
		 */
		return null;
	}

}
