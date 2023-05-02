package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDTO;
import com.masai.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public Student saveStudent(Student student) {
		
		
		System.out.println(studentRepository.getClass().getName());
		
		Student savedStudent= studentRepository.save(student);
		
		return savedStudent;
	}


	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException{
		
		
		Optional<Student> opt= studentRepository.findById(roll);
		
		
//		if(opt.isPresent()) {
//			
//			Student existingStudent= opt.get();
//			
//			return existingStudent;
//			
//		}else {
//			throw new StudentException("Student not found with roll "+roll);
//		}
		
		
		
		return opt.orElseThrow(() -> new StudentException("Student does not exist with roll "+roll));
		
		
		
		
	}


	@Override
	public List<Student> getAllStudentDetails() throws StudentException {
		
		List<Student> students= studentRepository.findAll();
		
		if(students.isEmpty())
			throw new StudentException("No Student found..");
		else
			return students;
		
		
		
	}


	@Override
	public Student deleteStudentByRoll(Integer roll) throws StudentException {
	
		Student existingStudent= studentRepository.findById(roll).orElseThrow(()-> new StudentException("Student does not exist with roll: "+roll));
		
		
		studentRepository.delete(existingStudent);
		
		return existingStudent;
		
		
		
		
	}


	@Override
	public Student updateStudent(Integer roll, StudentDTO student) throws StudentException {
		
		
		Optional<Student> opt= studentRepository.findById(roll);
		
		
		if(opt.isPresent()) {
			
			
			Student existingStudent= opt.get();
			existingStudent.setName(student.getName());
			existingStudent.setAddress(student.getAddress());
			existingStudent.setMarks(student.getMarks());
			
			
			//here save() method will work as save or merge with respect to id feilds
			return  studentRepository.save(existingStudent);
			
			
			
			
		}else
			throw new StudentException("Invalid Student roll number :"+roll);
		
		
		
	}


	@Override
	public Student updateStudentMarks(Integer roll, Integer graceMarks) throws StudentException {
		
		
		Student existingStudent= studentRepository.findById(roll).orElseThrow(() -> new StudentException("Student does not exist with roll :"+roll));
		
		existingStudent.setMarks(existingStudent.getMarks()+graceMarks);
		
		return studentRepository.save(existingStudent);
		
		
		
	}


	@Override
	public List<Student> getStudentByAddress(String address) throws StudentException {
		
		List<Student> students= studentRepository.findByAddress(address);
		
		
		if(students.isEmpty())
			throw new StudentException("Student does not exist with Address :"+address);
		else
			return students;
		
		
	}

	
	
}
