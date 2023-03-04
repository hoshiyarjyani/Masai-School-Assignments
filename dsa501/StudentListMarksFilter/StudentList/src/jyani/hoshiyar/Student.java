package jyani.hoshiyar;

public class Student {
String name;
int marks;
public Student(String name, int marks) {
	this.name = name;
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [Name=" + name + ", Marks=" + marks + "]";
}


}
