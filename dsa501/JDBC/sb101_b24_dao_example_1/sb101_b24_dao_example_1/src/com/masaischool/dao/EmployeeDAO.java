package com.masaischool.dao;

import java.time.LocalDate;
import java.util.List;

import com.masaischool.dto.Employee;
import com.masaischool.exception.SomethingWentWrongException;
import com.masaischool.exception.NoRecordFoundException;

public interface EmployeeDAO {
	public void addEmployee(Employee emp) throws SomethingWentWrongException;
	public void updateEmployee(Employee emp) throws SomethingWentWrongException;
	public void deleteEmployee(String empId) throws SomethingWentWrongException;
	public List<Employee> getEmployeeList() throws SomethingWentWrongException, NoRecordFoundException;
	public List<Employee> searchEmployeeByJoiningDateRange(LocalDate startDate, LocalDate endDate) throws SomethingWentWrongException, NoRecordFoundException;
}
