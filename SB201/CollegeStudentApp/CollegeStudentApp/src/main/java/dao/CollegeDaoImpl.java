package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import entities.College;
import entities.Student;
import exceptions.CollegeException;
import exceptions.StudentException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import utilities.EMUtil;

public class CollegeDaoImpl implements CollegeDao {

	@Override
	public College registerCollege(College college) throws CollegeException {
		// TODO Auto-generated method stub
		if(college==null) {
			throw new CollegeException("College Not Found");
		}
		EntityManager em=EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(college);
		em.getTransaction().commit();
		em.close();
		return college;
	}

	@Override
	public College getCollegeFromCollegeId(int collegeId) throws CollegeException {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
		College college=em.find(College.class, collegeId);
		if(college==null) {
			throw new CollegeException("College Not Found");
		}
		em.close();
		return college;
	}

	@Override
	public List<College> getAllCollege() throws CollegeException {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
		Query q= em.createQuery("Select c from College c");
		List<College> colleges=q.getResultList();
		if(colleges.size()==0) {
			throw new CollegeException("Colleges Not Found");
		}
		em.close();
		return colleges;
	}

	@Override
	public Student registerStudentToCollege(int studentId, int collegeId) throws CollegeException, StudentException {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
		Student student=em.find(Student.class, studentId);
		if(student==null) {
			throw new StudentException("Student Id Invalid");
		}
		College college=em.find(College.class, collegeId);
		if(college==null) {
			throw new CollegeException("College Id Wrong");
		}
		
		em.getTransaction().begin();
		
		college.getStudents().add(student);
		student.setCollege(college);
		em.getTransaction().commit();
		
		return student;
	}

	@Override
	public List<Student> getAllStudentsFromCollegeId(int collegeId) throws CollegeException, StudentException {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
		College college=em.find(College.class, collegeId);
		if(college==null) {
			throw new CollegeException("College Id Wrong");
		}
		List<Student> students=college.getStudents().stream().filter((s)->s.isStatus()).toList();
		if(students.isEmpty()) {
			throw new StudentException("Students not present");
		}
		
		return students;
	}

}
