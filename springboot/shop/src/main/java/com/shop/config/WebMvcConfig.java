/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean(name = "messageSource")
    public MessageSource getMessageResource() {
	ReloadableResourceBundleMessageSource messageResource = new ReloadableResourceBundleMessageSource();

	messageResource.setBasename("classpath:i18n/messages");
	messageResource.setDefaultEncoding("UTF-8");
	return messageResource;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
	LocaleChangeInterceptor localeInterceptor = new LocaleChangeInterceptor();
	localeInterceptor.setParamName("lang");

	registry.addInterceptor(localeInterceptor).addPathPatterns("/*");
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

	// jquery
	registry.addResourceHandler("/jquery/**") //
		.addResourceLocations("classpath:/META-INF/resources/webjars/jquery/3.4.1/");

	// bootstrap
	registry.addResourceHandler("/bootstrap/**") //
		.addResourceLocations("classpath:/META-INF/resources/webjars/bootstrap/4.4.1/");
	// font-awesome
	registry.addResourceHandler("/font-awesome/**") //
		.addResourceLocations("classpath:/META-INF/resources/webjars/font-awesome/5.13.0/");
	
	// icheck bootstrap
	registry.addResourceHandler("/icheck-bootstrap/**") //
	.addResourceLocations("classpath:/META-INF/resources/webjars/icheck-bootstrap/3.0.1/");
	
	// node_modules
	registry.addResourceHandler("/node_modules/**") //
	.addResourceLocations("classpath:/static/node_modules/");

	// css
	registry.addResourceHandler("/css/**") //
		.addResourceLocations("classpath:/static/css/");

	// js
	registry.addResourceHandler("/js/**") //
		.addResourceLocations("classpath:/static/js/");
	
	// image
	registry.addResourceHandler("/img/**") //
	.addResourceLocations("classpath:/static/img/");

    }
}
