package org.doxer.xbase.util;

import static com.github.hatimiti.flutist.common.util.MIMEType.*;
import static java.lang.String.*;
import static org.doxer.xbase.util._Container.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Paths;
import java.util.function.BiConsumer;

import org.doxer.xbase.form.DoxForm;

import com.github.hatimiti.flutist.common.util.CharacterEncoding;
import com.github.hatimiti.flutist.common.util._Http;

public class Downloads {

	public static <T extends DoxForm> void downloadPlainCsv(
			String fileName,
			T form, CharacterEncoding enc, BiConsumer<T, Writer> csvWriter) throws Exception {
		try (Writer out = _Http.getWriterForDownload(
				getHttpServletResponse(), enc, APPL_OCTET_STREAM, fileName)) {
			csvWriter.accept(form, out);
		}
	}

	public static <T extends DoxForm> void downloadZipCsv(
			String fileName,
			T form, CharacterEncoding enc, BiConsumer<T, Writer> csvWriter) throws Exception {

		long tmpSuffix = System.nanoTime();
		File tmpZipFile = Paths.get(format("/Temp/%s_%s", fileName, tmpSuffix)).toFile();
		try (Writer out = new BufferedWriter(new FileWriter(tmpZipFile))) {
			csvWriter.accept(form, out);
			_Http.downloadZip(getHttpServletResponse(), enc, tmpZipFile, fileName);
		} finally {
			tmpZipFile.delete();
		}
	}

}
