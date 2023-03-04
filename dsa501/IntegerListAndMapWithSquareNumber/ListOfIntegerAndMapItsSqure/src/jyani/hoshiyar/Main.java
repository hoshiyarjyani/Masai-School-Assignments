package jyani.hoshiyar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
     //List is Created of 1-10 using method asList
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("===================List of Integers ==============");
		
		list.forEach(System.out::print); //12345678910
		System.out.println(list); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		list.forEach(x -> System.out.print(x+" ")); //1 2 3 4 5 6 7 8 9 10
		
     //Square List is Created with Stream
		System.out.println("===================SqureList of Integers ==============");
		
		List<Integer> SqureList = list.stream().map(x->x*x).collect(Collectors.toList());
		SqureList.forEach(System.out::print);//149162536496481100
		System.out.println(SqureList);//[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
		SqureList.forEach(x -> System.out.print(x+" ")); // 1 4 9 16 25 36 49 64 81 100 
	}
}
