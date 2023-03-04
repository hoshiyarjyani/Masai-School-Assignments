package jyani.hoshiyar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student("Hoshiyar", 800);
		Student st2 = new Student("Saroj", 900);
		Student st3 = new Student("Ravi", 560);
		Student st4 = new Student("Mohit", 400);
		Student st5 = new Student("Manish", 690);
		List<Student> list = Arrays.asList(st1, st2, st3, st4, st5);
		//Print our Original List Using Method Reference
		list.forEach(System.out::println);
		System.out.println("================Option 1======================");
		//Option 1 - Print Highest Marks Student Using Stream and Method Reference
		System.out.println(list.stream().max(Comparator.comparing(Student::getMarks)));
		System.out.println("=================Option 2=====================");
		//Option 2 -Print Highest Marks Student Using Stream Lambda Expression and Reduce
		System.out.println(list.stream().reduce((s1, s2) -> s1.getMarks() > s2.getMarks() ? s1 : s2));
	}

}
