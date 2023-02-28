package com.masai;

public class Employee {
	private int empId;
	private String name;
	private String address;
	private int salary;

	public Employee(int empId, String name, String address, int salary) {
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Employee Id=" + empId + ", Name=" + name + ", Address=" + address + ", Salary=" + salary
				+ "]";
	}

}
