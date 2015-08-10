package org.doxer.xbase.util;

import static com.github.hatimiti.doxer.common.util.CharacterEncoding.*;
import static com.github.hatimiti.doxer.common.util.MIMEType.*;
import static com.github.hatimiti.doxer.common.util._Http.*;
import static java.lang.String.*;
import static org.doxer.xbase.util._Container.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.doxer.xbase.form.DoxForm;
import org.slf4j.Logger;

import com.github.hatimiti.doxer.common.util.CharacterEncoding;
import com.github.hatimiti.doxer.common.util.MIMEType;
import com.github.hatimiti.doxer.common.util._Http;
import com.github.hatimiti.doxer.common.util._Obj;
import com.github.hatimiti.doxer.common.util._Str;
import com.github.hatimiti.doxsl.core.Doxls;

public class Downloads {

	private static final Logger LOG = _Obj.getLogger();

	public static void downloadFile(Path filePath) throws IOException {
		try (OutputStream writer = _Http.getOutputStreamForDownload(
					getHttpServletResponse(), CharacterEncoding.UTF8,
					MIMEType.APPL_OCTET_STREAM, filePath.getFileName().toString())) {

			_Http.write(writer, filePath.toFile());

		} catch (IOException e) {
			LOG.warn("Download is missed!! message = {}, stacktrace = {}",
					e.getMessage(), e.getStackTrace());
			throw e;
		}
	}

	public static <T extends DoxForm> void downloadPlainCsv(
			String fileName,
			T form, CharacterEncoding enc, BiConsumer<T, Writer> csvWriter) throws IOException {
		try (Writer out = _Http.getWriterForDownload(
				getHttpServletResponse(), enc, APPL_OCTET_STREAM, fileName)) {
			csvWriter.accept(form, out);
		}
	}

	/**
	 *
	 * @param fileName ZIP内に格納するファイル名を指定します．(例：sample.txt)<br />
	 * ダウンロードされるZIPファイルの拡張子(.zip)は、{@code fileName}から既存の拡張子を除いて自動的に付加されます．
	 * (例：sample.zip)
	 * @param form
	 * @param enc
	 * @param csvWriter
	 * @throws IOException
	 */
	public static <T extends DoxForm> void downloadZipCsv(
			String fileName,
			T form, CharacterEncoding enc, BiConsumer<T, Writer> csvWriter) throws IOException {

		File tmpDir4Zip = Paths.get(format("/tmp/downloads/%s", _Str.createRandomHexString(12))).toFile();
		tmpDir4Zip.mkdirs();
		File tmpZipFile = new File(tmpDir4Zip, fileName);
		try (Writer out = new BufferedWriter(new FileWriter(tmpZipFile))) {
			csvWriter.accept(form, out);
			_Http.downloadZip(getHttpServletResponse(), enc, tmpZipFile, replaceExtension(fileName, ".zip"));
		} finally {
			tmpZipFile.delete();
			tmpDir4Zip.delete();
		}
	}

	private static String replaceExtension(String value, String extension) {
		int s = value.lastIndexOf(".");
		if (s < 0) {
			return value + extension;
		}
		return value.substring(0, s) + extension;
	}

	public static void downloadXls(String templatePath, String downloadFileNmae, Consumer<Doxls> valuesSetter) throws Exception {
		try (Doxls xls = new Doxls(templatePath,
				getOutputStreamForDownload(
					getHttpServletResponse(), UTF8, APPL_OCTET_STREAM, downloadFileNmae))) {

			valuesSetter.accept(xls);
			xls.output();
			xls.removeSheetByNameOf("Template");
		}
	}

}
