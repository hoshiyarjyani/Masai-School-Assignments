package jyani.hoshiyar.ui;

import java.util.List;
import java.util.Scanner;

import jyani.hoshiyar.dao.DepartmentDAO;
import jyani.hoshiyar.dao.DepartmentDAOImpl;
import jyani.hoshiyar.dao.EmployeeDAO;
import jyani.hoshiyar.dao.EmployeeDAOImpl;
import jyani.hoshiyar.dao.EmployeeDepartmentDAO;
import jyani.hoshiyar.dto.Department;
import jyani.hoshiyar.dto.DepartmentImpl;
import jyani.hoshiyar.dto.Employee;
import jyani.hoshiyar.dto.EmployeeDepartmentDTO;
import jyani.hoshiyar.dto.EmployeeImpl;
import jyani.hoshiyar.exception.NoRecordFoundException;
import jyani.hoshiyar.exception.SomethingWentWrongException;

//● To insert details of the Employee by taking input from the User.
//● To insert details of the Department by taking input from the User.
//● To get all the Employee details who work in the “Account” department.
//● To delete the Dependent based on did, by taking the input from the user.
//● To get the Department details of those employees who live in Mumbai
public class UIMain {
	static void AddEmployeeUI(Scanner sc) {
		System.out.println("Please Enter Employee Details Here");
		System.out.println("Enter Employee Id ");
		int empId = sc.nextInt();
		System.out.println("Enter Employee Name ");
		String ename = sc.next();
		System.out.println("Enter City of Employee ");
		String address = sc.next();
		System.out.println("Enter Mobile Number ");
		String mobile = sc.next();
		System.out.println("Enter DepartmentID");
		int deptid = sc.nextInt();

		Employee emp = new EmployeeImpl(empId, ename, address, mobile, deptid);

		EmployeeDAO empDAO = new EmployeeDAOImpl();

		try {
			empDAO.AddEmployee(emp);
			System.out.println("Employee Added Sucessfully");
		} catch (SomethingWentWrongException e) {
			System.out.println(e);
		}
	}

	static void AddDepartmentUI(Scanner sc) {
		System.out.println("Please Enter Department Details Here");
		System.out.println("Enter Department Id ");
		int did = sc.nextInt();
		System.out.println("Enter Department Name ");
		String dname = sc.next();
		System.out.println("Enter Location of Department ");
		String address = sc.next();

		Department dept = new DepartmentImpl(did, dname, address);
		DepartmentDAO deptDAO = new DepartmentDAOImpl();
		try {
			deptDAO.AddDepartment(dept);
			System.out.println("Department Added Sucessfully");
		} catch (SomethingWentWrongException e) {
			System.out.println(e);
		}
	}

	static void PrintAccountDepartmentEmployeeUI() {
		EmployeeDepartmentDAO deptDAO = new EmployeeDepartmentDAO();
		try {
			List<EmployeeDepartmentDTO> list = deptDAO.PrintAccountDepartmentEmployeeUI();
			list.forEach(x -> System.out.println("Department : " + x.getDname() + " Location : " + x.getLocation()
					+ " Department ID : " + x.getDeptid() + " EmployeeName : " + x.getEname() + " Address : "
					+ x.getAddress() + " Mobile : " + x.getMobile() + " EmployeeId : " + x.getEmpId()));

		} catch (SomethingWentWrongException | NoRecordFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	static void PrintDepartmentByEmployeeLocationUI() {
		DepartmentDAO deptDAO = new DepartmentDAOImpl();
		try {
			List<DepartmentImpl> list = deptDAO.PrintDepartmentByEmployeeLocationUI();
			list.forEach(x -> System.out.println("DepartmentID : " + x.getDid() + " DepartmentName : " + x.getDname()
					+ " Location : " + x.getLocation()));

		} catch (SomethingWentWrongException | NoRecordFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	static void DeleteDepartmentByDidUI(Scanner sc) {
		System.out.println("Enter Department ID that you want to delete all record in Employee");
		String did = sc.next();
		DepartmentDAO deptDAO = new DepartmentDAOImpl();
		try {
			deptDAO.DeleteDepartmentByDidUI(did);
			System.out.println("Employee Record Deleted");
		} catch (SomethingWentWrongException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("Enter your choice\n");
			System.out.println("0. Exit Application ");
			System.out.println("1. Add Employee to Database ");
			System.out.println("2. Add Department to Database ");
			System.out.println("3. Print EmployeeList who work in 'Account' Department ");
			System.out.println("4. Delete Department By 'did' (Department-ID) ");
			System.out.println("5. Print Department list who's Employee lives in 'MUMBAI'");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thanks For Using Our Service. Bye Bye");
				break;
			case 1:
				AddEmployeeUI(sc);
				break;
			case 2:
				AddDepartmentUI(sc);
				break;
			case 3:
				PrintAccountDepartmentEmployeeUI();
				break;
			case 4:
				DeleteDepartmentByDidUI(sc);
				break;
			case 5:
				PrintDepartmentByEmployeeLocationUI();
				break;
			default:
				System.out.println("Invalid Selection please try again later");
			}

		} while (choice != 0);
		sc.close();
	}
}
