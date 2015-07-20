package org.doxer.xbase.report.xls;

import static java.lang.String.*;

import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.doxer.app.sample.hello.Employee;
import org.jxls.area.Area;
import org.jxls.builder.AreaBuilder;
import org.jxls.builder.xls.XlsCommentAreaBuilder;
import org.jxls.common.CellRef;
import org.jxls.common.Context;
import org.jxls.transform.Transformer;
import org.slf4j.Logger;
import org.springframework.core.io.ClassPathResource;

import com.github.hatimiti.flutist.common.util._Obj;



public class Doxsl implements Closeable {

	public static final String TEMPLATE_BASE_PATH = "/templates/report/xls/";
	private static final Logger LOG = _Obj.getLogger();

	private InputStream is;
	private OutputStream os;
	private Transformer transformer;
	private AreaBuilder areaBuilder;
	private Context context;

	private List<Area> areas;

	public Doxsl(String templatePath, File outputFile) throws FileNotFoundException {
		Objects.requireNonNull(templatePath);
		Objects.requireNonNull(outputFile);
		try {
			os = new FileOutputStream(outputFile);
		} catch (FileNotFoundException e) {
			LOG.error(format("outputFile=%s", outputFile), e);
			throw e;
		}
		init(templatePath);
	}

	public Doxsl(String templatePath, OutputStream out) {
		Objects.requireNonNull(templatePath);
		Objects.requireNonNull(out);
		os = new BufferedOutputStream(out);
		init(templatePath);
	}

	private void init(String templatePath) {
		try {
			is = new ClassPathResource(TEMPLATE_BASE_PATH + templatePath).getInputStream();
		} catch (IOException e) {
			LOG.error(format("templatePath=%s", templatePath), e);
			throw new RuntimeException(e);
		}
		try {
			transformer = DoxslTransformer.createTransformer(is, os);
		} catch (InvalidFormatException | IOException e) {
			LOG.error(format("is=%s, os=%s", is, os), e);
			throw new RuntimeException(e);
		}
        areaBuilder = new XlsCommentAreaBuilder(transformer);
        context = new Context();
	}

	private List<Area> getAreas() {
		if (areas == null) {
			areas = this.areaBuilder.build();
		}
		return areas;
	}

	private Optional<Area> getArea(int i) {
		List<Area> areas = getAreas();
		if (areas.size() <= 0) {
			return Optional.empty();
		}
		try {
			return Optional.ofNullable(areas.get(i));
		} catch (IndexOutOfBoundsException e) {
			return Optional.empty();
		}
	}

	public void applyAtArea(int i, String cellRef) {
		getArea(i).ifPresent(a -> a.applyAt(new CellRef(cellRef), context));
	}

	public void put(String name, Object value) {
		this.context.putVar(name, value);
	}

	public void put(Map<String, Object> values) {
		values.entrySet().stream().forEach(e -> {
			this.context.putVar(e.getKey(), e.getValue());
		});
	}

	public void output() {
		try {
			transformer.write();
		} catch (IOException e) {
			LOG.error(format("transformer=%s", transformer), e);
			throw new RuntimeException(e);
		}
	}

	public void removeSheetByNameOf(String name) {
		// FIXME removeはoustputstream側のworkbookから削除する必要有
		doxslTransformer().removeSheetByNameOf(name);
	}

	private DoxslTransformer doxslTransformer() {
		if (!(this.transformer instanceof DoxslTransformer)) {
			throw new IllegalStateException("transformer is not DxslTransformer.");
		}
		return (DoxslTransformer) this.transformer;
	}

	@Override
	public void close() throws IOException {
		if (is != null) {
			is.close();
		}
		if (os != null) {
			os.close();
		}
	}

	public static void main(String[] args) throws Exception {
		nestedCommandDemo();
	}

	protected static void nestedCommandDemo() throws ParseException, IOException,
			FileNotFoundException {
		List<Employee> employees = new ArrayList<Employee>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-dd", Locale.US);
		employees.add( new Employee("Elsa", dateFormat.parse("1970-Jul-10"), 1500, 0.15) );
		employees.add( new Employee("Oleg", dateFormat.parse("1973-Apr-30"), 2300, 0.25) );
		employees.add( new Employee("Neil", dateFormat.parse("1975-Oct-05"), 2500, 0.00) );
		employees.add( new Employee("Maria", dateFormat.parse("1978-Jan-07"), 1700, 0.15) );
		employees.add( new Employee("John", dateFormat.parse("1969-May-30"), 2800, 0.20) );

		try (Doxsl xls = new Doxsl(
				"nested_command_template.xls",
				new File("build/reports/nested_command_template.xls"))) {

			xls.put("employees", employees);
			xls.applyAtArea(0, "Result!A1");
			xls.output();
			xls.removeSheetByNameOf("Template");
		}
	}

}
