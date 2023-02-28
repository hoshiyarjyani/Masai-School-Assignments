package com.masai;

public class Student {
	 
	 
	private int roll;
	private String name;
	private String email;
	private int marks;
	public Student(int roll, String name, String email, int marks) {
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [Roll No=" + roll + ", Name=" + name + ", Email=" + email + ", Marks=" + marks + "]";
	}
	 
	
}
