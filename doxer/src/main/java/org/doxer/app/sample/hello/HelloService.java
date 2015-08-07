package org.doxer.app.sample.hello;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import javax.annotation.Resource;

import org.doxer.app.db.dbflute.exbhv.TcmSampleBhv;
import org.doxer.app.db.dbflute.exentity.TcmSample;
import org.doxer.xbase.service.DoxService;
import org.springframework.stereotype.Service;

import com.github.hatimiti.doxsl.core.Doxls;

@Service
public class HelloService extends DoxService {

	@Resource TcmSampleBhv tcmSampleBhv;

	public void search(HelloForm model) {
		model.setResults(tcmSampleBhv.findBySampleName(model.getFval()));

		if ("register".equals(model.getFval().getVal())) {
			register(model);
		}
	}

	public Consumer<Doxls> createXlsValuesSetter(HelloForm form) {
		return xls -> {
			List<Employee> employees = new ArrayList<Employee>();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-dd", Locale.US);

			try {
				employees.add( new Employee("Elsa", dateFormat.parse("1970-Jul-10"), 1500, 0.15) );
				employees.add( new Employee("Oleg", dateFormat.parse("1973-Apr-30"), 2300, 0.25) );
				employees.add( new Employee("Neil", dateFormat.parse("1975-Oct-05"), 2500, 0.00) );
				employees.add( new Employee("Maria", dateFormat.parse("1978-Jan-07"), 1700, 0.15) );
				employees.add( new Employee("John", dateFormat.parse("1969-May-30"), 2800, 0.20) );
			} catch (Exception e) {
				throw new RuntimeException(e);
			}

			xls.put("employees", employees);
			xls.applyAtArea(0, "Result!A1");
		};
	}

	public void register(HelloForm model) {
		TcmSample entity = new TcmSample();
		entity.setSampleName("hatimiti");
		tcmSampleBhv.insert(entity);
	}
}
