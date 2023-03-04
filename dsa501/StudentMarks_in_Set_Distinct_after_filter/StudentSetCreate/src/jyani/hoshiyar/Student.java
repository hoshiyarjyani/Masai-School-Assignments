package jyani.hoshiyar;

import java.util.Objects;

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

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return marks == student.marks &&
            Objects.equals(name, student.name);
}

@Override
public int hashCode() {
    return Objects.hash(name, marks);
}

}