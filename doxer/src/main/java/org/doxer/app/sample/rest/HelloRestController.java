package org.doxer.app.sample.rest;


import lombok.Data;

import org.doxer.app.sample.hello.HelloForm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sample/rest")
public class HelloRestController  {

	@RequestMapping(value = "/hello")
	public Person hello (HelloForm model) {
		Person person = new Person();
		person.name = "hatimiti";
		return person;
	}

	@Data
	public static class Person {
		 private String name;
	}
}
