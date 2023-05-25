package dao;

import java.util.List;

import entities.College;
import entities.Student;
import exceptions.CollegeException;
import exceptions.StudentException;

public interface StudentDao {
	
	public Student registerStudent(Student student) throws StudentException;
	
	public Student getStudentFromStudentId(int studentId) throws StudentException;
	
	public List<Student> getAllActiveStudents() throws StudentException;
	
	public College getCollegeFromStudentId(int studentId) throws CollegeException, StudentException;
}
