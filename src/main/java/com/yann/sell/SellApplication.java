package com.yann.sell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class SellApplication /*extends SpringBootServletInitializer implements WebApplicationInitializer */{

/*	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringApplication.class);
	}*/
	public static void main(String[] args) {
		SpringApplication.run(SellApplication.class, args);
	}
}
