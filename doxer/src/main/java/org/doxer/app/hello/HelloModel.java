package org.doxer.app.hello;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.doxer.app.type.Val;
import org.doxer.xbase.model.DoxModel;
import org.springframework.stereotype.Component;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class HelloModel extends DoxModel {

	private Val val;
}
