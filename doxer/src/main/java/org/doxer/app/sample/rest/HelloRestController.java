package org.doxer.app.sample.rest;


import static org.springframework.context.annotation.ScopedProxyMode.*;

import javax.annotation.Resource;

import lombok.Data;

import org.doxer.app.sample.hello.HelloModel;
import org.doxer.xbase.util.BeanProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope(proxyMode = TARGET_CLASS)
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
