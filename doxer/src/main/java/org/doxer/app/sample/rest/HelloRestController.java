package org.doxer.app.sample.rest;


import static org.springframework.context.annotation.ScopedProxyMode.*;
import lombok.Data;

import org.doxer.app.sample.hello.HelloModel;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope(proxyMode = TARGET_CLASS)
public class HelloRestController  {

	@RequestMapping(value = "/helloRest")
	public Person hello (HelloModel model) {
		Person person = new Person();
		person.name = "hatimiti";
		return person;
	}

	@Data
	public static class Person {
		private String name;
	}
}
