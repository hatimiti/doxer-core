package org.doxer.app.sample.hello;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.dbflute.cbean.result.ListResultBean;
import org.doxer.app.db.dbflute.exentity.TcmSample;
import org.doxer.app.sample.type.Val;
import org.doxer.xbase.model.DoxModel;
import org.springframework.stereotype.Component;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class HelloModel extends DoxModel {

	private Val val;

	private ListResultBean<TcmSample> results;
}
