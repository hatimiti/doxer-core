package org.doxer.app.hello;

import lombok.Data;

import org.doxer.app.type.Val;
import org.springframework.stereotype.Component;

@Data
@Component
public class HelloModel {

	private Val val;
}
