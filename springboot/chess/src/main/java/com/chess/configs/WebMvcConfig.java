package com.chess.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		// jquery
		registry.addResourceHandler("/jquery/**") //
				.addResourceLocations("classpath:/META-INF/resources/webjars/jquery/3.4.1/");

		// bootstrap
		registry.addResourceHandler("/bootstrap/**") //
				.addResourceLocations("classpath:/META-INF/resources/webjars/bootstrap/4.4.1/");

	}
}
