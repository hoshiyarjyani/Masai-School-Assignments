package com.masai;

public class Main {
   public static void main(String [] args) {
	   Demo demo = Integer::parseInt;
	   int result = demo.convertStringToNumber("123");
	   System.out.println(result);  
   }
}
