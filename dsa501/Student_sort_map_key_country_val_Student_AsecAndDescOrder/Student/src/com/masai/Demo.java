package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<>();
		map.put("India", new Student(1, "Hoshiyar Singh", "hoshiyarjyani@gmail.com", 450));
		map.put("Pakistan", new Student(2, "Raju", "hoshiyarjyani@gmail.com", 750));
		map.put("USA", new Student(3, "Ravi Kumar", "hoshiyarjyani@gmail.com", 550));
		map.put("Russia", new Student(4, "Manoj", "abc@gmail.com", 490));
		map.put("Africa", new Student(5, "Anil", "anil@gmail.com", 250));
		map.put("Canada", new Student(6, "Abhishek", "abhishek@gmail.com", 460));
		map.put("Norway", new Student(7, "Nitesh", "nitesh@gmail.com", 340));
		map.put("Ukraine", new Student(8, "Singh", "hoshiyarjyani@gmail.com", 450));
		map.put("Afghanistan", new Student(9, "Naresh", "Naresh@gmail.com", 200));
		map.put("Australia", new Student(10, "Manish", "Manish@gmail.com", 650));

		System.out.println("Original map: " + map);

		List<Map.Entry<String, Student>> list = new ArrayList<>(map.entrySet());

		System.out.println("===================Ascending Order====================");
		Collections.sort(list, (a, b) -> a.getValue().getName().compareTo(b.getValue().getName()));
		Map<String, Student> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<String, Student> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println("Sorted map: " + sortedMap);

		System.out.println("===================Descending Order====================");
		Collections.sort(list, (a, b) -> b.getValue().getName().compareTo(a.getValue().getName()));
		sortedMap = new LinkedHashMap<>();
		for (Map.Entry<String, Student> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println("Sorted map: " + sortedMap);
	}
}
