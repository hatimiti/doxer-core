package org.doxer.app.sample.hello;

import javax.annotation.Resource;

import org.doxer.app.db.dbflute.exbhv.TcmSampleBhv;
import org.doxer.app.db.dbflute.exentity.TcmSample;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

	@Resource
	public TcmSampleBhv tcmSampleBhv;
	
	public void search(HelloForm model) {
		model.setResults(tcmSampleBhv.findBySampleName(model.getVal()));

		if ("register".equals(model.getVal().getVal())) {
			register(model);
		}
	}

	public void register(HelloForm model) {
		TcmSample entity = new TcmSample();
		entity.setSampleName("hatimiti");
		tcmSampleBhv.insert(entity);
	}
}
