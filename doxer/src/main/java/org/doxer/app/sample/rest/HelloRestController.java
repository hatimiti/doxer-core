package org.doxer.app.sample.rest;


import javax.annotation.Resource;

import lombok.Data;

import org.doxer.app.sample.hello.HelloModel;
import org.doxer.xbase.util.BeanProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sample/rest")
public class HelloRestController  {

	@Resource
	private BeanProperties applicationProperties;
	
	@RequestMapping(value = "/hello")
	public Person hello (HelloModel model) {
		Person person = new Person();
		person.name = "hatimiti";
		System.out.println(applicationProperties.getModeledProperty("hello", person));
		return person;
	}

	@Data
	public static class Person {
		 private String name;
	}
}
