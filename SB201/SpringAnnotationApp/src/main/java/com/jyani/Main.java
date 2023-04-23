package com.jyani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext apx = new AnnotationConfigApplicationContext(AppConfig.class);

		Demo obj = apx.getBean(Demo.class);
		obj.showDetails();
		((AnnotationConfigApplicationContext) apx).close();
	}
}
