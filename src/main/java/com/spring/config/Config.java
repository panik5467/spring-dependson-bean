package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.spring.beans.A;
import com.spring.beans.B;
import com.spring.beans.C;

@Configuration
public class Config {

	@Bean(name= "beanone")
	@DependsOn(value= { "beantwo", "beanthree" })
	public A getA() {
		return new A();
	}

	@Bean(name= "beantwo")
	public B getB() {
		return new B();
	}

	@Bean(name= "beanthree")
	public C getC() {
		return new C();
	}
}