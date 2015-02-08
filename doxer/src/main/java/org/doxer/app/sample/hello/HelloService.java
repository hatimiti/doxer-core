package org.doxer.app.sample.hello;

import javax.annotation.Resource;

import org.doxer.app.db.dbflute.exbhv.TcmSampleBhv;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

	@Resource
	public TcmSampleBhv tcmSampleBhv;

	public void search(HelloModel model) {
		model.setResults(tcmSampleBhv.findBySampleName(model.getVal()));
	}
}
