package com.dao;

import javax.persistence.EntityManager;

import com.model.Department;
import com.model.Employee;
import com.util.EmUtils;

public class EmpDeptDAO {
	public static void main(String[] args) {
		EntityManager em = EmUtils.getEntityManager();

		Department dept = new Department();
		dept.setDeptname("HR");
		dept.setCity("Jaipur");

		Employee emp1 = new Employee();
		emp1.setName("Hoshiyar");
		emp1.setSalary(5000);
		emp1.setDept(dept);

		Employee emp2 = new Employee();
		emp2.setName("Manish");
		emp2.setSalary(8000);
		emp2.setDept(dept);

		em.getTransaction().begin();
		em.persist(emp1);
		em.persist(emp2);
		em.getTransaction().commit();
		em.close();
		System.out.println("Sucessfully Added");

	}
}
