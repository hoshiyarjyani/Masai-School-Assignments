package com.jyani;


public class Student {
	private String name;
	private int Marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		Marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", Marks=" + Marks + "]";
	}
}
