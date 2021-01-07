/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 */
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
	// css
	registry.addResourceHandler("/css/**") //
		.addResourceLocations("classpath:/static/css/");

	// js
	registry.addResourceHandler("/js/**") //
		.addResourceLocations("classpath:/static/js/");
	
	// img
	registry.addResourceHandler("/img/**") //
	.addResourceLocations("classpath:/static/img/");

	// websocket
	registry.addResourceHandler("/stomp-websocket/**") //
		.addResourceLocations("classpath:/META-INF/resources/webjars/stomp-websocket/2.3.3-1/");

	registry.addResourceHandler("/sockjs-client/**") //
		.addResourceLocations("classpath:/META-INF/resources/webjars/sockjs-client/1.1.2/");

    }
}
