package org.doxer.app.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String hello() {
		return "Hello, Spring!!";
	}
}
