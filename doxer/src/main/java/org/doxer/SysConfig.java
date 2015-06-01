package org.doxer;

import nz.net.ultraq.thymeleaf.LayoutDialect;

import org.doxer.xbase.thymeleaf.dialect.sa.JUtilityDialect;
import org.doxer.xbase.thymeleaf.dialect.sa.SADialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

@Configuration
public class SysConfig {

	/**
	 * テンプレートリゾルバーの設定
	 * @return	テンプレートリゾルバー
	 */
	@Bean
	public TemplateResolver templateResolver() {
		TemplateResolver resolver = new SpringResourceTemplateResolver();
		resolver.setPrefix("classpath:/templates");
		resolver.setSuffix(".html");
		//NB, selecting HTML5 as the template mode.
		resolver.setTemplateMode("HTML5");
		resolver.setCacheable(false);
		resolver.setCharacterEncoding("UTF-8");
		return resolver;
	}

	@Bean
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine engine = new SpringTemplateEngine();

		engine.setTemplateResolver(templateResolver());
		engine.addDialect(new LayoutDialect());
		engine.addDialect(new SADialect());
		engine.addDialect(new JUtilityDialect());
		return engine;
	}

	/**
	 * Thymeleaf ビューリゾルバー設定
	 * @return	ビューリゾルバー
	 */
	@Bean
	public ViewResolver viewResolver() {
		ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(templateEngine());
		viewResolver.setOrder(1);
		viewResolver.setViewNames(new String[]{"*"});
		viewResolver.setCache(false);
		viewResolver.setCharacterEncoding("UTF-8");
		return viewResolver;
	}

}
