package org.doxer.xbase.validation.validator;

import static com.github.hatimiti.flutist.common.message.AppMessageLevel.*;

import java.io.UncheckedIOException;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.val;

import org.doxer.xbase.form.DoxInputCsv;
import org.doxer.xbase.util.DoxCsvEntityReader;
import org.springframework.web.multipart.MultipartFile;

import com.github.hatimiti.flutist.common.message.AppMessage;
import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.message.OwnedMessages;
import com.github.hatimiti.flutist.common.message.Owner;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.RequiredFieldValidator;
import com.orangesignal.csv.CsvConfig;
import com.orangesignal.csv.CsvTokenException;

/**
 * MultipartでアップロードされたCSVファイルの妥当性チェックを行うための基底バリデータです．
 * @author hatimiti
 *
 */
public abstract class CsvFormValidator implements FormValidator {

	/**
	 * 対象CSVファイルを返します．
	 * @return MultipartCSVファイル
	 */
	protected abstract MultipartFile getCsvFile();

	/**
	 * 対象CSVファイルの1行を表現するエンティティクラスの型を返します．
	 * @return {@link DoxInputCsv}を実装したCSVエンティティクラス型
	 */
	protected abstract <E extends DoxInputCsv> Class<E> getCsvEntityClass();

	/**
	 * 対象CSVファイルの1行に定義する列数を返します．
	 * @return CSV列数
	 */
	protected abstract int getCsvColumnNum();

	/**
	 * 対象CSVの妥当性チェックを行います．
	 * @param c バリデーションメッセージ格納用コンテナ
	 * @param name メッセージ表示時用の owner 名
	 * @return CSV行数(但し項目数不正チェックエラーの場合はその行までの番号)
	 * @throws Exception 入出力例外など
	 */
	protected int validateCsv(AppMessagesContainer c, String name) throws Exception {

		validateRequired(c, name);

		if (!c.isEmpty()) {
			return -1;
		}

		AtomicInteger csvRowCount = new AtomicInteger(0);

		val conf = new CsvConfig();
		conf.setIgnoreEmptyLines(true);
		conf.setVariableColumns(false);

		try (val csv = new DoxCsvEntityReader<>(getCsvFile(), conf, getCsvEntityClass())) {
			csv.stream().forEach(line -> {
				line.validate(c, name, csvRowCount.get());
				csvRowCount.incrementAndGet();
			});
		} catch (UncheckedIOException e) {
			if (!(e.getCause() instanceof CsvTokenException)) {
				throw e;
			}
			c.add(new OwnedMessages(Owner.of("", name, csvRowCount.get()),
					new AppMessage(ERROR, "valid.csv.col.invalid",
							getCsvColumnNum(),
							((CsvTokenException) e.getCause()).getTokens().size())));
		}

		return csvRowCount.get();
	}

	private void validateRequired(AppMessagesContainer c, String name) {
		new RequiredFieldValidator(c) {
			protected String getDefaultMessageKey() { return "valid.csv.required"; };
		}.check(Vval.of(getCsvFile().getOriginalFilename()), Owner.of(name));
	}

}
