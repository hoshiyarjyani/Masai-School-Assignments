package com.jyani;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jyani")
public class AppConfig {

	@Bean
	public List<Student> getStudents() {
		List<Student> studentList = Arrays.asList(new Student("Hoshiyar", 87), new Student("Rayshio", 97));
		return studentList;
	}

	@Bean
	public List<String> getCity() {
		List<String> cityList = Arrays.asList("Delhi", "Jaipur", "Sirsa");
		return cityList;
	}

}
