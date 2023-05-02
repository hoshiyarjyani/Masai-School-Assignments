package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.model.Student;
import com.masai.model.StudentDTO;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	//public  Student findByAddress(String address);
	
	public  List<Student> findByAddress(String address);
	
	//named parameter
	//@Query("select s.name from Student s where s.roll=:roll")        
	//public String getStudentNameByRoll(@Param("roll") int roll);
	
	//positional parameter
	@Query("select name from Student where roll=?1")        
	public String getStudentNameByRoll(int roll);
	
	@Query("select marks from Student")        
	public List<Integer> getStudentMarks();
	
	
	@Query("select s from Student s where s.address=?1")
	public List<Student> getAllStudents(String address);
	
	@Query("select s from Student s where s.roll=?1")
	public Student getAllStudents2(Integer roll);
	
	
	@Query("select s.name,s.marks from Student s where s.roll=?1")
	public String getNameAndMarksfromStudent(int roll);
	
	
	//@Query("select s.name,s.address,s.marks from Student s where s.roll=?1")
	//public String getNameAddressAndMarksfromStudent(int roll);
	
	//String result= "Ram,Delhi,900";
	
	//@Query("select new com.masai.model.StudentDTO(s.name,s.address,s.marks) from Student s where s.roll=?1")
	//public StudentDTO getNameAddressAndMarksfromStudent(int roll);
	
	@Query("select new com.masai.model.StudentDTO(s.name,s.address,s.marks) from Student s")
	public List<StudentDTO> getNameAddressAndMarksfromStudent();
	
	
	
}
