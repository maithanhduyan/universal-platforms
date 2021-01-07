/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.configs;

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
	// font-awesome
	registry.addResourceHandler("/font-awesome/**") //
		.addResourceLocations("classpath:/META-INF/resources/webjars/font-awesome/5.13.0/");

	// icheck bootstrap
	registry.addResourceHandler("/icheck-bootstrap/**") //
		.addResourceLocations("classpath:/META-INF/resources/webjars/icheck-bootstrap/3.0.1/");

	// aos
	registry.addResourceHandler("/aos/**") //
		.addResourceLocations("classpath:/META-INF/resources/webjars/aos/2.1.1/dist/");

	// jquery.easing
	registry.addResourceHandler("/jquery.easing/**") //
		.addResourceLocations("classpath:/META-INF/resources/webjars/jquery.easing/1.4.1/");
	
	// adminlte
	registry.addResourceHandler("/adminlte/**") //
	.addResourceLocations("classpath:/META-INF/resources/webjars/AdminLTE/3.0.5/");

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
	
	// websocket
	registry.addResourceHandler("/stomp-websocket/**") //
	.addResourceLocations("classpath:/META-INF/resources/webjars/stomp-websocket/2.3.3-1/");
	
	registry.addResourceHandler("/sockjs-client/**") //
	.addResourceLocations("classpath:/META-INF/resources/webjars/sockjs-client/1.1.2/");

    }
}
