package com.masai;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
   public static void main(String[] args) {
	   Map<String,Student> map = new HashMap<>();
	   map.put("India",new Student(1,"Hoshiyar Singh","hoshiyarjyani@gmail.com",450));
	   map.put("Pakistan",new Student(2,"Raju","hoshiyarjyani@gmail.com",750));
	   map.put("USA",new Student(3,"Ravi kumar","hoshiyarjyani@gmail.com",550));
	   map.put("Russia",new Student(4,"Manoj","abc@gmail.com",490));
	   map.put("Africa",new Student(5,"Anil","anil@gmail.com",250));
	   map.put("Caneda",new Student(6,"Abhishek","abhishek@gmail.com",460));
	   map.put("Norway",new Student(7,"Nitesh","nitesh@gmail.com",340));
	   map.put("Ukrane",new Student(8,"Singh","hoshiyarjyani@gmail.com",450));
	   map.put("Afganistan",new Student(9,"Naresh","Naresh@gmail.com",200));
	   map.put("Australia",new Student(10,"Manish","Manish@gmail.com",650));
	 System.out.println(map);  
	   
	 List<Map.Entry<String,Student>> list = new ArrayList<>(map.entrySet());
	 Collections.sort(list,(a,b)->a.getValue().getName().compareTo(b.getValue().getName()));
	   System.out.println(list);  
	   Collections.sort(list,(a,b)->b.getValue().getName().compareTo(a.getValue().getName()));
	   System.out.println(list); 
	   
   }
}
