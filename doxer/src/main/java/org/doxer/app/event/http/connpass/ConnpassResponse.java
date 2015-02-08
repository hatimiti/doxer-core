package org.doxer.app.event.http.connpass;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ConnpassResponse implements Serializable {

	/** 含まれる検索結果 */
	private Integer resultsReturned;
	/** 検索結果の総件数 */
	private Integer resultsAvailable;
	/** 検索結果の開始位置 */
	private Integer resultsStart;

	/** イベントリスト */
	private List<Event> events;

	public ConnpassResponse() {
		this.events = new ArrayList<>();
	}

	@Data
	public static class Event implements Serializable {

		/** イベントID */
		private Integer eventId;
		/** タイトル */
		private String title;
		/** キャッチ */
		private String _catch;
		/** 概要(HTML形式) */
		private String description;
		/** connpass.com 上のURL */
		private String eventUrl;
		/** Twitter のハッシュタグ */
		private String hashTag;
		/** イベント開催日時(ISO-8601形式) */
		private String startedAt;
		/** イベント終了日時(ISO-8601形式) */
		private String endedAt;
		/** 定員 */
		private Integer limit;
		/** イベント参加タイプ */
		private String eventType;

		/** グループ */
		private Series series;

		/** 開催場所 */
		private String address;
		/** 開催会場 */
		private String place;
		/** 開催会場の緯度 */
		private Double lat;
		/** 開催会場の経度 */
		private Double lon;
		/** 管理者のID */
		private Integer ownerId;
		/** 管理者のニックネーム */
		private String ownerNickname;
		/** 管理者の表示名 */
		private String ownerDisplayName;
		/** 参加者数 */
		private Integer accepted;
		/** 補欠者数 */
		private Integer waiting;
		/** 更新日時(ISO-8601形式) */
		private String updatedAt;

		public void setCatch(String _catch) {
			this._catch = _catch;
		}

		public String getCatch() {
			return this._catch;
		}

	}

	/**
	 * グループ
	 * @author hatimiti
	 */
	@Data
	public static class Series implements Serializable {

		/** グループID */
		private Integer id;
		/** グループタイトル */
		private String title;
		/** グループの connpass.com 上のURL */
		private String url;

	}

}
