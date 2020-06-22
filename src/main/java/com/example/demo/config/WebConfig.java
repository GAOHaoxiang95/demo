package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/us/addDiary").setViewName("/us/success");
//
//	}

	@Bean
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver m = new CommonsMultipartResolver();
		//m.setMaxUploadSize(10000000);
		return m;
	}

}