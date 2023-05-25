package dao;

import java.util.List;

import entities.College;
import entities.Student;
import exceptions.CollegeException;
import exceptions.StudentException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import utilities.EMUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public Student registerStudent(Student student) throws StudentException {
		if(student==null) {
			throw new StudentException("Student Not Found");
		}
		
		EntityManager em=EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		em.close();
		return student;
	}

	@Override
	public Student getStudentFromStudentId(int studentId) throws StudentException {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
		Student student=em.find(Student.class, studentId);
		if(student==null) {
			throw new StudentException("Student not found");
		}
		
		return student;
	}

	@Override
	public List<Student> getAllActiveStudents() throws StudentException {
		EntityManager em=EMUtil.provideEntityManager();
		Query q= em.createQuery("Select s from Student s");
		List<Student> students=q.getResultList();
		if(students.size()==0) {
			throw new StudentException("Students Not Found");
		}
		em.close();
		
		return students.stream().filter(s->s.isStatus()).toList();
		
	}

	@Override
	public College getCollegeFromStudentId(int studentId) throws CollegeException, StudentException {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
		Student student=em.find(Student.class, studentId);
		if(student==null) {
			throw new StudentException("Student not found");
		}
		if(student.getCollege()==null) {
			throw new CollegeException("College Not added");
		}
		
		return student.getCollege();
	}

}
