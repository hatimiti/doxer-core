package org.doxer.app.sample.hello;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.doxer.app.sample.type.Val;
import org.doxer.xbase.model.DoxModel;
import org.springframework.stereotype.Component;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class HelloModel extends DoxModel {

	private Val val;
}
