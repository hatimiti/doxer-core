package org.doxer.app;

import org.doxer.app.hello.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {
	public static void main(String[] args) {
		ApplicationContext ctx
			= new AnnotationConfigApplicationContext(Application.class);
		HelloService service = ctx.getBean(HelloService.class);
		System.out.println(service.hello());
	}
}
