package org.doxer.xbase.report.xls;

import java.util.Objects;
import java.util.stream.IntStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.jxls.common.CellRef;

public interface DoxslPoiWorkbookModifiable {

	Workbook getWorkbook();

	default void removeSheetAt(int i) {
		getWorkbook().removeSheetAt(i);
	}

	default void removeSheetByNameOf(String name) {
		Objects.requireNonNull(name);

		IntStream.range(0, getWorkbook().getNumberOfSheets() - 1)
			.filter(i -> name.equals(getWorkbook().getSheetAt(i).getSheetName()))
			.peek(System.out::println)
			.findFirst()
			.ifPresent(this::removeSheetAt);
	}

	default Sheet getSheetBy(CellRef cellRef) {
		return getWorkbook().getSheet(cellRef.getSheetName());
	}

}
