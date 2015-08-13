package org.doxer.xbase.config;

import static com.github.hatimiti.doxer.common.util.CharacterEncoding.*;
import static java.util.Arrays.*;

import java.util.HashMap;

import javax.servlet.Filter;

import org.doxer.xbase.filter.ThreadLocalInitFilter;
import org.doxer.xbase.servlet.DoxDispatcherServlet;
import org.seasar.extension.filter.RequestDumpFilter;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public abstract class DoxWebXml extends SpringBootServletInitializer {

	@Bean
	public DoxDispatcherServlet dispatcherServlet() {
		return new DoxDispatcherServlet();
	}

	@Bean
	public ServletRegistrationBean dispatcherServletRegistration() {
		ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet());
		return registration;
	}

	@Bean
	public FilterRegistrationBean registCharacterEncodingFilter() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		Filter filter = new CharacterEncodingFilter();
		registrationBean.setFilter(filter);
		registrationBean.setOrder(1);
		registrationBean.setInitParameters(new HashMap<String, String>() {{
			put("encoding", UTF8.toString());
			put("forceEncoding", "true");
		}});
		registrationBean.setUrlPatterns(asList(new String[] { "/*" }));
		return registrationBean;
	}

	@Bean
	public FilterRegistrationBean registThreadLocalInitFilter() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		Filter filter = new ThreadLocalInitFilter();
		registrationBean.setFilter(filter);
		registrationBean.setOrder(2);
		registrationBean.setUrlPatterns(asList(new String[] { "/*" }));
		return registrationBean;
	}

	@Bean
	public FilterRegistrationBean registRequestDumpFilter() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		Filter filter = new RequestDumpFilter();
		registrationBean.setFilter(filter);
		registrationBean.setOrder(3);
		registrationBean.setInitParameters(new HashMap<String, String>() {{
			put("beforeContextAttribute", "false");
			put("afterContextAttribute", "false");
		}});
		registrationBean.setUrlPatterns(asList(new String[] { "/*" }));
		return registrationBean;
	}

}
