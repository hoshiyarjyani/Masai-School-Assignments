package com.masaischool.jdbcexone;

public class BlockExample {
	static {//by kapil
		System.out.println("Inside static block by kapil");
	}
	
	static {//by sanjay
		System.out.println("Inside static block by sanjay");
	}
	
	{
		System.out.println("Inside non-static block by kapil");
	}
	
	{
		System.out.println("Inside non-static block by sanjay");
	}
	
	BlockExample(){
		System.out.println("Inside constructor of BlockExample");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		BlockExample ex1 = new BlockExample();
		System.out.println("");
		BlockExample ex2 = new BlockExample();
		
	}
}
