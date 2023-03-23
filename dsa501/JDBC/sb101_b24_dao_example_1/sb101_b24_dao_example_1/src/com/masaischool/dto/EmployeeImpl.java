package com.masaischool.dto;

import java.time.LocalDate;

public class EmployeeImpl implements Employee {
	private String empId;
	private String name;
	private double salary;
	private LocalDate date;
	
	public EmployeeImpl(String empId, String name, double salary, LocalDate date) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.date = date;
	}

	@Override
	public String getEmpId() {
		return empId;
	}
	@Override
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public double getSalary() {
		return salary;
	}
	@Override
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public LocalDate getJoiningDate() {
		return date;
	}
	
	@Override
	public void setJoiningDate(LocalDate date) {
		this.date = date;
	}
}
