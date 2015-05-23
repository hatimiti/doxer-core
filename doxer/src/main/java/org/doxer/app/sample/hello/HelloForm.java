package org.doxer.app.sample.hello;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.dbflute.cbean.result.ListResultBean;
import org.doxer.app.db.dbflute.exentity.TcmSample;
import org.doxer.app.sample.type.Val;
import org.doxer.xbase.form.DoxForm;
import org.springframework.stereotype.Component;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class HelloForm extends DoxForm {

	private Val val;

	private ListResultBean<TcmSample> results;
}
