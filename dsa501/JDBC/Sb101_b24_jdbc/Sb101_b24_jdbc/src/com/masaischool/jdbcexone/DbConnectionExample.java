package com.masaischool.jdbcexone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.Scanner;

public class DbConnectionExample {
	/**
	 * Establish connection to the database
	 * @return Connection object that is handle for the connection with database
	 * @throws SQLException If some credentials are wrong, database not started etc ect
	 * @throws ClassNotFoundException If driver class is not found
	 */
	static Connection getConnectionTodatabase() throws SQLException, ClassNotFoundException {
		//step-1: load the Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step-2
		ResourceBundle rb = ResourceBundle.getBundle("dbdetails");
		return DriverManager.getConnection(rb.getString("url"), rb.getString("username"), rb.getString("password"));
	}
	
	/**
	 * close the connection with the database
	 * @param conn Connection object for which connection is to be closed
	 * @throws SQLException if anything goes wrong
	 */
	static void closeConnection(Connection conn) throws SQLException {
		if(conn != null)
			conn.close();
	}
	
	/**
	 * Used to input student details and add the same to database
	 * @param sc Scanner object that is used to take input
	 * @throws SQLException if anything goes wrong
	 * @throws ClassNotFoundException If driver class is not found
	 */
	static void addStudent(Scanner sc) throws SQLException, ClassNotFoundException {
		//create connection
		Connection conn = getConnectionTodatabase();
		
		//get an object of Statement
		Statement st = conn.createStatement();
		
		//code to take input
		System.out.print("Please enter roll number ");
		String rollNo = sc.next();
		System.out.print("Please enter name ");
		String name = sc.next();
		System.out.print("Please enter cgpa ");
		double cgpa = sc.nextDouble();
		System.out.print("Please enter dob (YYYY-MM-DD) ");
		LocalDate dob = LocalDate.parse(sc.next());
		
		//for the query
		String query = "INSERT INTO student VALUES('" + rollNo + "', '" + name +"', " + cgpa +" , '" + dob + "')";
		
		//INSERT INTO student VALUES('R002', 'astha', 8.5 , '2006-05-06')
		if(st.executeUpdate(query) > 0) {
			System.out.println("Student added successfully");
		}else {
			System.out.println("not able to add Student");
		}
		
		closeConnection(conn);
	}
	
	static void updateStudent(Scanner sc) throws SQLException, ClassNotFoundException {
		//create connection
		Connection conn = getConnectionTodatabase();
		
		//get an object of Statement
		
		Statement st = conn.createStatement();
		
		//code to take input
		System.out.print("Please enter roll number ");
		String rollNo = sc.next();
		System.out.print("Please enter name ");
		String name = sc.next();
		System.out.print("Please enter cgpa ");
		double cgpa = sc.nextDouble();
		System.out.print("Please enter dob (YYYY-MM-DD) ");
		LocalDate dob = LocalDate.parse(sc.next());
		//for the query
		String query = "UPDATE student SET name = '" + name + "', cgpa = " + cgpa + ", dob = '" + dob + "' WHERE rollNo = '" + rollNo + "'";
		
		if(st.executeUpdate(query) > 0) {
			System.out.println("Student updated successfully");
		}else {
			System.out.println("Not able to update Student");
		}
		
		closeConnection(conn);
	}
	
	static void deleteStudent(Scanner sc) throws SQLException, ClassNotFoundException {
		//create connection
		Connection conn = getConnectionTodatabase();
		
		//get an object of Statement
		Statement st = conn.createStatement();
		
		//code to take input
		System.out.print("Please enter roll number ");
		String rollNo = sc.next();
		//for the query
		String query = "DELETE FROM student WHERE rollNo = '" + rollNo + "'";
		
		if(st.executeUpdate(query) > 0) {
			System.out.println("Student deleted successfully");
		}else {
			System.out.println("Not able to delete Student");
		}
		
		closeConnection(conn);
	}
	
	static void printStudentList() throws  SQLException, ClassNotFoundException{
		//create connection
		Connection conn = getConnectionTodatabase();

		//get an object of Statement
		Statement st = conn.createStatement();
		
		//for the query
		String query = "SELECT * FROM student";
		
		//use executeQuery not executeUpdate for SELECT statement
		ResultSet rs = st.executeQuery(query);
		
		//case-01: when resultset is empty
		if(!rs.isBeforeFirst() && rs.getRow() == 0) {
			//you are here means the resultset is empty
			System.out.println("No Student Found");
		}else {
			//you are here means the resultset has some records
			while(rs.next()) {
				System.out.println("Roll Number: " + rs.getString(1) + " Name: " + rs.getString(2) + " CGPA: " + rs.getDouble(3) + " Date of birth " + rs.getDate(4));
			}
		}
		
		closeConnection(conn);
	}
	
	static void searchStudentByName(Scanner sc) throws  SQLException, ClassNotFoundException{
		//create connection
		Connection conn = getConnectionTodatabase();

		//get an object of Statement
		Statement st = conn.createStatement();
		
		System.out.print("Enter name of student ");
		String name = sc.next();
		
		//for the query
		String query = "SELECT rollNo, cgpa, dob FROM student WHERE name LIKE '%" + name + "%'";
		
		//use executeQuery not executeUpdate for SELECT statement
		ResultSet rs = st.executeQuery(query);
		
		//case-01: when resultset is empty
		if(!rs.isBeforeFirst() && rs.getRow() == 0) {
			//you are here means the resultset is empty
			System.out.println("No Student Found");
		}else {
			//you are here means the resultset has some records
			while(rs.next()) {
				System.out.println("Roll Number: " + rs.getString(1) + " CGPA: " + rs.getDouble(2) + " Date of birth " + rs.getDate(3));
			}
		}
		
		closeConnection(conn);
	}
	
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		do {
			System.out.println("1. Add Student");
			System.out.println("2. Update Student");
			System.out.println("3. Delete Student");
			System.out.println("4. View Student List");
			System.out.println("5. Search Student By Name");
			System.out.println("0. Exit");
			
			System.out.print("Enter selection ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					addStudent(sc);
					break;
				case 2:
					updateStudent(sc);
					break;
				case 3:
					deleteStudent(sc);
					break;
				case 4:
					printStudentList();
					break;
				case 5:
					searchStudentByName(sc);
					break;
				case 0:
					System.out.println("Thnaks for using our services");
					break;
				default:
					System.out.println("Invalid Selection, try again later");
			}			
		}while(choice != 0);
		sc.close();
		
	}
}
