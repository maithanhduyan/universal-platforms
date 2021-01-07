/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
public class JspViewResolverConfig {
    
    @Value("${spring.view.prefix:/WEB-INF/}") // default: /WEB-INF/
    private String prefix;

    @Value("${spring.view.suffix:.jsp}") // default: .jsp
    private String suffix;

    @Value("${spring.view.view-names:views/*}") // default: views/*
    private String viewNames;
    
    @Bean
    public ViewResolver jspViewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setViewClass(JstlView.class);
	viewResolver.setPrefix(prefix);
	viewResolver.setSuffix(suffix);
	viewResolver.setContentType("text/html");
	viewResolver.setViewNames(viewNames);
	return viewResolver;
    }
}
