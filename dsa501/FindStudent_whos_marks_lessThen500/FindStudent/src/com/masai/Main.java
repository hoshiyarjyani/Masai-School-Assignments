package com.masai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public List<Student> getStudents(List<Student> students) {
	    List<Student> Students = new ArrayList<>();
	    
	    //use of lambda expression
	    
	    students.forEach(s -> {
	        if (s.getMarks() < 500) {
	        	Students.add(s);
	        }
	    });
	    return Students;
	}
	
	
	public static void main(String[] args) {
	List<Student> list = new ArrayList<>();
     Student s1 = new Student("Hoshiyar",450);
     Student s2 = new Student("Mohit",550);
     Student s3 = new Student("Ravi",490);
     Student s4 = new Student("Raju",560);
     Student s5 = new Student("Manoj",350);
     Student s6 = new Student("Abhishek",480);
     Student s7 = new Student("Manish",600);
     Student s8 = new Student("Ishu",450);
     Student s9 = new Student("Riya",700);
     Student s10 = new Student("Rajat",800);
     list.addAll(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10));
     System.out.println(list);
     
     // use of method reference
     Main obj = new Main();
     Intr itr = obj::getStudents;
     List<Student> updateList = itr.findStudent(list);
     System.out.println(updateList);
     
     
     
     
	}

}
