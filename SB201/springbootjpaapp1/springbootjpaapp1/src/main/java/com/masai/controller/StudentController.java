package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDTO;
import com.masai.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/students")
	public ResponseEntity<Student> registerStudentHandler(@RequestBody Student student){
		
		Student registeredStudent= studentService.saveStudent(student);
		
		
		return new ResponseEntity<>(registeredStudent,HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getStudentByRollHandler(@PathVariable("roll") Integer roll){
		
		
		Student student= studentService.getStudentByRoll(roll);
		
		return new ResponseEntity<>(student,HttpStatus.OK);
		
		
	}
	
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudentDetailsHandler(){
		
		List<Student> students= studentService.getAllStudentDetails();
		
		return new ResponseEntity<>(students,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/students/{roll}")
	public ResponseEntity<Student> deleteStudentByRollHandler(@PathVariable Integer roll){
		
		
		Student deletedStudent= studentService.deleteStudentByRoll(roll);
		
		
		return new ResponseEntity<>(deletedStudent, HttpStatus.OK);
	}
	
	@PutMapping("/students/{roll}")
	public ResponseEntity<Student> updateStudentByRollHandler(@PathVariable("roll") Integer roll, @RequestBody StudentDTO student){
		
		Student updatedStudent= studentService.updateStudent(roll, student);
		
		return new ResponseEntity<>(updatedStudent,HttpStatus.ACCEPTED);
		
	}
	
	@PatchMapping("/students/{roll}")
	public ResponseEntity<Student> updateStudentMarksHandler(@PathVariable Integer roll, @RequestParam(value =  "gmarks", required = false, defaultValue = "20") Integer gmarks){
		
		 Student updatedStudent= studentService.updateStudentMarks(roll, gmarks);
		
		 return new ResponseEntity<>(updatedStudent, HttpStatus.ACCEPTED);
		
		
		
	}
	
	@GetMapping("/getstudent")
	public ResponseEntity<List<Student>> getStudentByAddressHandler(@RequestParam("address") String address){
		
		List<Student> students= studentService.getStudentByAddress(address);
		
		return new ResponseEntity<>(students,HttpStatus.OK);
		
	}
	
	
}
