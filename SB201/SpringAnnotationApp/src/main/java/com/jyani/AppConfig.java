package com.jyani;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jyani")
public class AppConfig {
	@Bean
	public Map<Department, Employee> getDeptEmp() {
		Map<Department, Employee> theMap = new HashMap<>();
		theMap.put(new Department(1, "Engineer", "Jaipur"), new Employee(1, "Hoshiyar", "Jaipur", 456250));
		return theMap;
	}

}
