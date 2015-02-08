package org.doxer.app.event.http.connpass;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class ConnpassRequestQuery implements Serializable {

	/**
	 * <pre>
	 * イベントID
	 * 整数
	 * イベント毎に割り当てられた番号で検索します。複数指定可能です*1
	 * URLが http://connpass.com/event/364/ のイベントの場合、イベントIDは 364 になります。
	 * </pre>
	 */
	private List<Integer> eventIds;

	/**
	 * <pre>
	 * キーワード (AND)
	 * 文字列(UTF-8)
	 * イベントのタイトル、キャッチ、概要、住所をAND条件部分一致で検索します。複数指定可能です*1
	 * </pre>
	 */
	private List<String> keywordANDs;

	/**
	 * <pre>
	 * キーワード (OR)
	 * 文字列(UTF-8)
	 * イベントのタイトル、キャッチ、概要、住所をOR条件部分一致で検索します。複数指定可能です*1
	 * </pre>
	 */
	private List<String> keywords;

	/**
	 * <pre>
	 * イベント開催年月
	 * 整数
	 * 指定した年月に開催されているイベントを検索します。複数指定可能です*1
	 * yyyymm(例) 201204
	 * </pre>
	 */
	private List<Integer> yms;

	/**
	 * <pre>
	 * イベント開催年月日
	 * 整数
	 * 指定した年月日に開催されているイベントを検索します。複数指定可能です*1
	 * yyyymmdd(例) 20120406
	 * </pre>
	 */
	private List<Integer> ymds;

	/**
	 * <pre>
	 * 参加者のニックネーム
	 * 文字列(UTF-8)
	 * 指定したニックネームのユーザが参加しているイベントを検索します。複数指定可能です*1
	 * </pre>
	 */
	private List<String> nicknames;

	/**
	 * <pre>
	 * 管理者のニックネーム
	 * 文字列(UTF-8)
	 * 指定したニックネームのユーザが管理しているイベントを検索します。複数指定可能です*1
	 * </pre>
	 */
	private List<String> ownerNicknames;
	private List<Integer> seriesIds;
	private Integer start;
	private Integer order;
	private Integer count;
	private String format;

}
