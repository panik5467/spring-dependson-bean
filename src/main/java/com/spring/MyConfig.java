package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class MyConfig {


	@Value("${config.a}")
	private String confA;
	@Value("${config.b}")
	private String confB;

	@Bean
	public MyConfig getConfig() {
		MyConfig config = new MyConfig();
		printValues();
		return config;
	}

	public void printValues() {
		System.out.println("Config prop.txt =" + confA);
		System.out.println("Config prop.txt =" + confB);

	}

}