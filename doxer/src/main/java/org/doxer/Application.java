package org.doxer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("file:WebContent/WEB-INF/config/*.xml")
public class Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		//		app.setShowBanner(false);
		//		app.setWebEnvironment(false);
		app.run(args);
	}

}
