package com.jyani;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CityAndStudent {
	
	@Autowired
	List<String> cityList;
	
	@Autowired
	List<Student> studentList;

	@PostConstruct
	public void init() {
		System.out.println("Starting the journy");
	}

	public void ShowDetails() {
		System.out.println(cityList + "  \n" + studentList);
	}

	@PreDestroy
	public void bsKhtm() {
		System.out.println("Tata bye bye khtm");
	}
}
