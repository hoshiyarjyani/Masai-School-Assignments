package com.dao;

import javax.persistence.EntityManager;

import com.model.Department;
import com.model.Employee;
import com.util.EmUtils;

public class EmpDeptDAO {
	public static void main(String[] args) {
		EntityManager em = EmUtils.getEntityManager();

		Department dept = new Department();

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		dept.setDeptname("HR");
		dept.setCity("Jaipur");
		dept.getEmplist().add(emp1);
		dept.getEmplist().add(emp2);

		emp1.setName("Hoshiyar");
		emp1.setSalary(5000);
		emp1.setDept(dept);

		emp2.setName("Manish");
		emp2.setSalary(8000);
		emp2.setDept(dept);

		em.getTransaction().begin();
		em.persist(dept);
		em.getTransaction().commit();

		em.close();
		System.out.println("Sucessfully Added");

	}
}
