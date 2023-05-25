package dao;

import java.util.List;

import entities.College;
import entities.Student;
import exceptions.CollegeException;
import exceptions.StudentException;

public interface CollegeDao {

	public College registerCollege(College college) throws CollegeException;
	
	public College getCollegeFromCollegeId(int collegeId) throws CollegeException;
	
	public List<College> getAllCollege() throws CollegeException;
	
	public Student registerStudentToCollege(int studentId, int collegeId) throws CollegeException, StudentException;
		
	public List<Student> getAllStudentsFromCollegeId(int collegeId) throws CollegeException, StudentException;
}
