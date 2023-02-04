package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.spring.beans.A;

@SpringBootApplication
public class Myapplication {

	public static void main(String[] args) {

System.out.println("start main...");

		ConfigurableApplicationContext context = SpringApplication.run(Myapplication.class, args);

		A a = context.getBean(A.class);
		a.doSomething();

		// Closing the context object.
		context.close();
	}
}