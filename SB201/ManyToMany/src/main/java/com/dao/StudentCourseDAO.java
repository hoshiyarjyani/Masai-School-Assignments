package com.dao;

import javax.persistence.EntityManager;

import com.model.Course;
import com.model.Student;
import com.util.EmUtils;

public class StudentCourseDAO {
	public static void main(String[] args) {
		EntityManager em = EmUtils.getEntityManager();

		Student s1 = new Student();
		Student s2 = new Student();

		Course c1 = new Course();
		Course c2 = new Course();

		// There are two student
		s1.setName("Hoshiyar Singh");
		s2.setName("Rahul");

		// Two course available
		c1.setCourseName("Java");
		c2.setCourseName("c++");

		// here course got the student detail
		c1.getStudentList().add(s1);

		c2.getStudentList().add(s1);
		c2.getStudentList().add(s2);

		// here student got the course detail
		s1.getCourseList().add(c1);
		s1.getCourseList().add(c2);

		s2.getCourseList().add(c2);

		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.getTransaction().commit();

		em.close();

		System.out.println("Sucessfully done");

	}

}
