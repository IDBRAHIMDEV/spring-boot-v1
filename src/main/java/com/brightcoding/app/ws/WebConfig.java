package com.brightcoding.app.ws;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    
	public void addCorsMappings(CorsRegistry registry) {
		
		registry
		  .addMapping("/**")
		  .allowedMethods("*")
		  .allowedOrigins("*");
		
	}
}
