package com.masai;

import java.util.Arrays;
import java.util.List;

public class Main {
	void printcity(List<String> list) {
		 for(int i = 0; i<list.size();i++) {
			 System.out.println(list.get(i));
		 }
	}
	
  public static void main(String[] args) {
	  List<String> cities = Arrays.asList("Jaipur","Hanumangarh","Pune","Goa","Bathida");
	  Main obj = new Main();
	  PrintList pl = obj::printcity;
	  pl.display(cities);
	  
  }
}
