/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
public class JspViewResolverConfig {
    @Bean
    public ViewResolver jspViewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

	viewResolver.setViewClass(JstlView.class);
	viewResolver.setPrefix("/WEB-INF/pages/");
	viewResolver.setSuffix(".jsp");
	viewResolver.setContentType("text/html");

	// Make sure > Thymeleaf order & FreeMarker order.
	viewResolver.setOrder(2);

	return viewResolver;
    }
}
