package org.doxer.xbase.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.web.multipart.MultipartFile;

import com.orangesignal.csv.CsvConfig;
import com.orangesignal.csv.CsvReader;
import com.orangesignal.csv.io.CsvEntityReader;

public class DoxCsvEntityReader<E> implements Iterable<E>, Closeable {

	private CsvEntityReader<E> reader;

	public DoxCsvEntityReader(MultipartFile in, CsvConfig config, Class<E> clazz) throws IOException {
		this(in.getInputStream(), config, clazz);
	}

	public DoxCsvEntityReader(InputStream in, CsvConfig config, Class<E> clazz) {
		reader = new CsvEntityReader<>(
				new CsvReader(new InputStreamReader(in), config), clazz);
	}

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			E nextLine = null;

			@Override
			public boolean hasNext() {
				if (nextLine != null) {
					return true;
				} else {
					try {
						nextLine = reader.read();
						return (nextLine != null);
					} catch (IOException e) {
						throw new UncheckedIOException(e);
					}
				}
			}

			@Override
			public E next() {
				if (nextLine != null || hasNext()) {
					E line = nextLine;
					nextLine = null;
					return line;
				} else {
					throw new NoSuchElementException();
				}
			}
		};
	}

	public Stream<E> stream() {
		return StreamSupport.stream(spliterator(), false);
	}

	@Override
	public void close() throws IOException {
		this.reader.close();
	}

}
