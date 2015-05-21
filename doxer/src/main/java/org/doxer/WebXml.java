package org.doxer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.doxer.xbase.servlet.DoxDispatcherServlet;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class WebXml extends SpringBootServletInitializer {

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(Restbucks.class, ComponentConfiguration.class);
//	}

	@Bean
	public DoxDispatcherServlet dispatcherServlet() {
		return new DoxDispatcherServlet();
	}

	@Bean
	public ServletRegistrationBean dispatcherServletRegistration() {
		ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet());
		Map<String,String> params = new HashMap<String,String>();
		params.put("org.atmosphere.servlet","org.springframework.web.servlet.DispatcherServlet");
		params.put("contextClass","org.springframework.web.context.support.AnnotationConfigWebApplicationContext");
		params.put("contextConfigLocation","net.org.selector.animals.config.ComponentConfiguration");
		registration.setInitParameters(params);
		return registration;
	}

	@Bean
	public FilterRegistrationBean characterEncodingFilterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		Filter filter = new CharacterEncodingFilter();
		registrationBean.setFilter(filter);
		registrationBean.setOrder(1);

		registrationBean.setInitParameters(new HashMap<String, String>() {{
			put("encoding", "UTF-8");
			put("forceEncoding", "true");
		}});
		registrationBean.setUrlPatterns(Arrays.asList(new String[] { "/*" }));

		return registrationBean;
	}

}
