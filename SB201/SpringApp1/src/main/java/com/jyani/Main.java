package com.jyani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext apx = new AnnotationConfigApplicationContext(AppConfig.class);

		CityAndStudent obj = apx.getBean(CityAndStudent.class);
		obj.ShowDetails();

		((AnnotationConfigApplicationContext) apx).close();
	}
}
