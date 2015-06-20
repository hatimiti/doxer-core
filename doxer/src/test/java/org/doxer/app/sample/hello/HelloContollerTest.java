package org.doxer.app.sample.hello;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import javax.annotation.Resource;

import org.doxer.xbase.test.DoxControllerTestCase;
import org.junit.Test;

public class HelloContollerTest extends DoxControllerTestCase {

	@Resource
	private HelloController controller;

	/**
	 * <h5>試験背景</h5><p>
	 * 通常操作に対するユニットテストの実施．
	 * <h5>試験概要</h5><p>
	 * Hello画面を初期表示し、正常にページが表示できることを確認する．
	 * <h5>試験方法</h5>
	 * <ol>
	 * <li>GETメソッドでURLに"/sample/hello/index"を指定してアクセスする．
	 * <li>結果HTTPステータスが"200"であることを確認する．
	 * <li>結果HTMLの見出し要素に文字列"Basic Input"が含まれていることを確認する．
	 * <li>結果HTML名が"/hello/hello.html"であることを確認する．
	 * </ol>
	 * <h5>期待結果</h5><p>
	 * 各試験方法の結果通りとなること．
	 */
	@Test
	public void No001_初期表示_正常_() throws Exception {
		mockMvc.perform(get("/sample/hello/index"))
			.andExpect(status().isOk())
//			.andExpect(content().contentType(MediaType.TEXT_HTML))
			.andExpect(xpath("/html/body/div/div/h3/text()").string("Basic Input"))
			.andExpect(view().name("/hello/hello.html"))
		;
	}

	/**
	 * <h5>試験背景</h5><p>
	 * 通常操作に対するユニットテストの実施．
	 * <h5>試験概要</h5><p>
	 * Hello画面で値を入力せずアクセス、正常にページを表示後、エラーメッセージが
	 * 表示されていることを確認する．
	 * <h5>試験方法</h5>
	 * <ol>
	 * <li>POSTメソッドでURLに"/sample/hello/input"を指定してアクセスする．
	 * <li>結果HTTPステータスが"200"であることを確認する．
	 * <li>結果HTMLのdiv要素にエラーメッセージ"入力値 は必須入力です。"が含まれていることを確認する．
	 * <li>結果HTMLのdiv要素にエラーメッセージ"電話番号 は必須入力です。"が含まれていることを確認する．
	 * <li>結果HTML名が"/hello/hello.html"であることを確認する．
	 * </ol>
	 * <h5>期待結果</h5><p>
	 * 各試験方法の結果通りとなること．
	 */
	@Test
	public void No002_値入力_正常_入力チェック() throws Exception {
		mockMvc.perform(post("/sample/hello/input"))
			.andExpect(status().isOk())
			.andExpect(view().name("/hello/hello.html"))
			.andExpect(xpath("/html/body/div/div/form/div/text()").string("入力値 は必須入力です。"))
			.andExpect(xpath("/html/body/div/div/form/div[position()=2]/text()").string("電話番号 は必須入力です。"))
		;
	}

	/**
	 * <h5>試験背景</h5><p>
	 * 通常操作に対するユニットテストの実施．
	 * <h5>試験概要</h5><p>
	 * Hello画面で正しい値を入力してアクセスし、正常にページを表示できることを確認する．
	 * また、入力した値がinput要素に設定されていることを確認する．
	 * <h5>試験方法</h5>
	 * <ol>
	 * <li>入力パラメータ:入力値に"Hatimiti"を入力する．
	 * <li>入力パラメータ:電話番号1に"010"を入力する．
	 * <li>入力パラメータ:電話番号2に"1234"を入力する．
	 * <li>入力パラメータ:電話番号3に"2345"を入力する．
	 * <li>POSTメソッドでURLに"/sample/hello/input"を指定してアクセスする．
	 * <li>結果HTTPステータスが"200"であることを確認する．
	 * <li>結果HTMLのinput要素:入力値が"Hatimiti"であることを確認する．
	 * <li>結果HTMLのinput要素:電話番号1が"010"であることを確認する．
	 * <li>結果HTMLのinput要素:電話番号2が"1234"であることを確認する．
	 * <li>結果HTMLのinput要素:電話番号3が"2345"であることを確認する．
	 * <li>結果HTML名が"/hello/hello.html"であることを確認する．
	 * </ol>
	 * <h5>期待結果</h5><p>
	 * 各試験方法の結果通りとなること．
	 */
	@Test
	public void No003_値入力_正常_通常入力() throws Exception {
		mockMvc.perform(post("/sample/hello/input")
				.param("fval.val", "Hatimiti")
				.param("telNo.val[0]", "010")
				.param("telNo.val[1]", "1234")
				.param("telNo.val[2]", "2345")
			)
			.andExpect(status().isOk())
			.andExpect(view().name("/hello/hello.html"))
			.andExpect(xpath("/html/body/div/div/form/input[@name='fval.val'][@value='Hatimiti']").exists())
			.andExpect(xpath("/html/body/div/div/form/input[@name='telNo.val[0]'][@value='010']").exists())
			.andExpect(xpath("/html/body/div/div/form/input[@name='telNo.val[1]'][@value='1234']").exists())
			.andExpect(xpath("/html/body/div/div/form/input[@name='telNo.val[2]'][@value='2345']").exists())
		;
	}

}
