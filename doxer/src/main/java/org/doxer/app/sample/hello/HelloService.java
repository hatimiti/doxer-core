package org.doxer.app.sample.hello;

import javax.annotation.Resource;

import org.doxer.app.db.dbflute.exbhv.TcmSampleBhv;
import org.doxer.app.db.dbflute.exentity.TcmSample;
import org.doxer.xbase.service.DoxService;
import org.springframework.stereotype.Service;

@Service
public class HelloService extends DoxService {

	@Resource
	public TcmSampleBhv tcmSampleBhv;
	
	public void search(HelloForm model) {
		model.setResults(tcmSampleBhv.findBySampleName(model.getFval()));

		if ("register".equals(model.getFval().getVal())) {
			register(model);
		}
	}

	public void register(HelloForm model) {
		TcmSample entity = new TcmSample();
		entity.setSampleName("hatimiti");
		tcmSampleBhv.insert(entity);
	}
}
