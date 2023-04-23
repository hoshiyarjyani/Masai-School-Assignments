package com.jyani;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Demo {
	@Autowired
	private Map<Department, Employee> theMap;

	// use setter injection to inject theMap;
	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}

	@PostConstruct
	public void myInit() {
		System.out.println("inside myInit method");
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("inside cleanUp method");
	}

	public void showDetails() {
		System.out.println("inside showDetails of Demo class");
		// print all the details of all the employees department-wise.
		System.out.println(theMap);
	}
}
