package org.doxer.app.sample.hello;

import javax.annotation.Resource;

import org.dbflute.optional.OptionalEntity;
import org.doxer.app.db.dbflute.exbhv.TcmSampleBhv;
import org.doxer.app.db.dbflute.exentity.TcmSample;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

	@Resource
	public TcmSampleBhv tcmSampleBhv;

	public String hello() {
		OptionalEntity<TcmSample> e = this.tcmSampleBhv.selectEntity(cb ->
			cb.query().setSampleName_Equal("hatimiti")
		);

		return "Hello, Spring!!" + (e.isPresent() ? e.get().getSampleName() : "None");
	}
}
