package com.jyani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext apx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HolidayPackage hp = apx.getBean("Hpac",HolidayPackage.class);
		hp.showDetails();
	}
}
