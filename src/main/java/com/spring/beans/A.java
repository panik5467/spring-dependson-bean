package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

public class A {

	@Autowired
	private B b;

	@Autowired
	private C c;

	public A() {
		System.out.println("====== Bean A is initialized. ======");
	}

	public void doSomething() {
		System.out.println("Inside doSomething() method of 'A' bean.");
		b.doSomething();
		c.doSomething();
	}
}