package org.doxer.xbase.util;

import static com.github.hatimiti.flutist.common.util.CharacterEncoding.*;
import static com.github.hatimiti.flutist.common.util.MIMEType.*;
import static com.github.hatimiti.flutist.common.util._Http.*;
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

import com.github.hatimiti.doxsl.core.Doxls;
import com.github.hatimiti.flutist.common.util.CharacterEncoding;
import com.github.hatimiti.flutist.common.util.MIMEType;
import com.github.hatimiti.flutist.common.util._Http;
import com.github.hatimiti.flutist.common.util._Obj;

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

	public static <T extends DoxForm> void downloadZipCsv(
			String fileName,
			T form, CharacterEncoding enc, BiConsumer<T, Writer> csvWriter) throws IOException {

		long tmpSuffix = System.nanoTime();
		File tmpZipFile = Paths.get(format("/Temp/%s_%s", fileName, tmpSuffix)).toFile();
		try (Writer out = new BufferedWriter(new FileWriter(tmpZipFile))) {
			csvWriter.accept(form, out);
			_Http.downloadZip(getHttpServletResponse(), enc, tmpZipFile, fileName);
		} finally {
			tmpZipFile.delete();
		}
	}

	public static void downloadXls(String templatePath, Consumer<Doxls> valuesSetter) throws Exception {
		try (Doxls xls = new Doxls(templatePath,
				getOutputStreamForDownload(
					getHttpServletResponse(), UTF8, APPL_OCTET_STREAM, "sample.xls"))) {

			valuesSetter.accept(xls);
			xls.output();
			xls.removeSheetByNameOf("Template");
		}
	}

}
