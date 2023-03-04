package jyani.hoshiyar;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//6 student is created in 6 student one is duplicate also
		Student st1 = new Student("Hoshiyar", 300);
		Student st2 = new Student("Saroj", 900);
		Student st3 = new Student("Ravi", 560);
		Student st4 = new Student("Mohit", 400);
		Student st5 = new Student("Hoshiyar", 300);//Duplicate
		Student st6 = new Student("Manish", 690);
		
		//Now We Are Create a Set
		Set<Student> set = new HashSet<>();
		
		//Adding Student Object in our Set
		set.add(st1);
		set.add(st2);
		set.add(st3);
		set.add(st4);
		set.add(st5);
		set.add(st6);
		
		//Print our Original Set using Method Reference, Lambda Expression , Simple Print
		System.out.println("//1.Method Reference");
		set.forEach(System.out::println);
		
		
		System.out.println("//2.Lambda Expression");
		set.forEach(x->System.out.println(x));
		
		System.out.println("//3.Simple Print");
	    System.out.println(set);
		
//	    whose marks is less than 500 and put all the filtered Student object inside another Set object.
//	    Note: Make sure that there should not be any duplicate Student objects.
	    //Use Of Stream,Filter,Distinct,Collectors.toSet
	   Set<Student> filterSet = set.stream().filter(x->x.getMarks()<500).distinct().collect(Collectors.toSet());
	    
	 //Print our Filter Set using Method Reference, Lambda Expression , Simple Print
	 		System.out.println("//1.Method Reference");
	 		filterSet.forEach(System.out::println);
	 		
	 		
	 		System.out.println("//2.Lambda Expression");
	 		filterSet.forEach(x->System.out.println(x));
	 		
	 		System.out.println("//3.Simple Print");
	 	    System.out.println(filterSet);
	}

}