package com.masaischool.dto;

import java.time.LocalDate;

public interface Employee {
	/**
	 * return employee id for the calling object
	 * @return String the employee id for the calling object
	 */
	public String getEmpId();
	public void setEmpId(String empId);
	public String getName();
	public void setName(String name);
	public double getSalary();
	public void setSalary(double salary);
	public LocalDate getJoiningDate();
	public void setJoiningDate(LocalDate date);
}
