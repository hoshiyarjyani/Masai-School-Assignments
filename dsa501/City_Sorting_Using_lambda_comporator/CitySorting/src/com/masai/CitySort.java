package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CitySort {
 public static void main(String[] args) {
	 List<String> city = new ArrayList<>();
	 city.add("Jaipur");
	 city.add("Ajmer");
	 city.add("Mumbai");
	 city.add("Goa");
	 city.add("Panipat");
	 city.add("Sirsa");
	 city.add("Kolkata");
	 Collections.sort(city,(a,b)->b.compareTo(a));
	 System.out.println(city);
 }

}
