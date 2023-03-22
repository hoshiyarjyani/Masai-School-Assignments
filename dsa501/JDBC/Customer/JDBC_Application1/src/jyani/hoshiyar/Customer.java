package jyani.hoshiyar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Customer {

	// This method for the Connection of Java to MySQL using JDBC
	static Connection getConnectionToRDMS() throws ClassNotFoundException, SQLException {
		// 1. Load the Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2. ResourceBundle
		ResourceBundle rb = ResourceBundle.getBundle("dbdetails");

		return DriverManager.getConnection(rb.getString("url"), rb.getString("username"), rb.getString("password"));

	}

	// This is for the closing of Database Connection
	static void closeConnection(Connection con) throws SQLException {
		if (con != null) {
			con.close();
		}
	}

	static void addCustomer(Scanner sc) throws ClassNotFoundException, SQLException {
		// 1. Create Connection to database
		Connection con = getConnectionToRDMS();
		// 2. Get an Object of Statement
		Statement st = con.createStatement();

		// Taking Input from user
		System.out.println("Please Enter Customer ID ");
		String CustomerId = sc.next();
		System.out.println("Please Enter Customer Name ");
		String Name = sc.next();
		System.out.println("Please Enter Gender ");
		String Gender = sc.next();
		System.out.println("Please Enter Wallet Balance ");
		Double Balance = sc.nextDouble();
		System.out.println("Please Enter Date of Joining (YYYY-MM-DD) ");
		LocalDate JoinDate = LocalDate.parse(sc.next());

		// Now Create Our Query
		String query = "INSERT INTO customer VALUES('" + CustomerId + "','" + Name + "','" + Gender + "'," + Balance
				+ ",'" + JoinDate + "')";

		if (st.executeUpdate(query) > 0) {
			System.out.println("\nCustomer Added Successfully");
		} else {
			System.out.println("\n Not Able To Add Customer");
		}

		closeConnection(con);
	}

	static void updateCustomer(Scanner sc) throws ClassNotFoundException, SQLException {
		Connection con = getConnectionToRDMS();
		Statement st = con.createStatement();
		System.out.println("Please Enter The Custmer Id that you want to update");
		String Id = sc.next();

		System.out.println("Please Enter The Updated Balance of Customer who's ID is " + Id);
		Double Balance = sc.nextDouble();

		System.out.println("Please Enter The Updated Date of Joining (YYYY-MM-DD) of Customer who's ID is " + Id);
		LocalDate JoinDate = LocalDate.parse(sc.next());

		String query = "UPDATE customer SET Balance = " + Balance + ", JoinDate = '" + JoinDate
				+ "' WHERE CustomerId = '" + Id + "'";
		int count = st.executeUpdate(query);
		if (count > 0) {
			System.out.println(count + " Customer Sucessfully Updated the Balance and Join Date the Who's ID is " + Id);
		} else {
			System.out.println("Not Update ,May be Customer is not Exist in Database");
		}

	}

	static void ShowListofAll() throws ClassNotFoundException, SQLException {
		Connection con = getConnectionToRDMS();
		Statement st = con.createStatement();
		System.out.println("We Are Scanning the Data of All Customers");
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String query = "SELECT * FROM customer";
		ResultSet rs = st.executeQuery(query);
		if (!rs.isBeforeFirst() && rs.getRow() == 0) {
			System.out.println("No Customers Found");
		} else {
			while (rs.next()) {
				System.out.println(rs.getString("CustomerId") + " " + rs.getString("Name") + " "
						+ rs.getString("Gender") + " " + rs.getDouble("Balance") + " " + rs.getString("JoinDate"));
			}
		}

	}

	static void SearchByDate(Scanner sc) throws ClassNotFoundException, SQLException {
		Connection con = getConnectionToRDMS();
		Statement st = con.createStatement();
		System.out.println("Write the Start Date");
		LocalDate StartDate = LocalDate.parse(sc.next());

		System.out.println("Write the End Date");
		LocalDate EndDate = LocalDate.parse(sc.next());

		String query = "SELECT * FROM customer WHERE JoinDate >= " + StartDate + " AND JoinDate<='" + EndDate + "'";

		ResultSet rs = st.executeQuery(query);
		if (!rs.isBeforeFirst() && rs.getRow() == 0) {
			System.out.println("No Customers found Between " + StartDate + " And " + EndDate);
		} else {
			while (rs.next()) {
				System.out.println(rs.getString("CustomerId") + " " + rs.getString("Name") + " "
						+ rs.getString("Gender") + " " + rs.getDouble("Balance") + " " + rs.getString("JoinDate"));
			}
		}

	}

	static void removeCustomer() throws ClassNotFoundException, SQLException {
		// 1. Create Connection to RDMS
		Connection con = getConnectionToRDMS();
		// 2. Get an Object of Statement
		Statement st = con.createStatement();

		// Taking input from user if Balance is 0 then Delete
		System.out.println(
				"We are checking the Customers Balance if Wallet Balance is 0 then we are Removing From Database");
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String query = "DELETE FROM customer where Balance = 0";
		int count = st.executeUpdate(query);
		if (count > 0) {
			System.out.println(count + " Customers Who's Account Balance is 0 , Removed Sucessfully");
		} else {
			System.out.println("No Customer Found");
		}
		closeConnection(con);

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		do {
			System.out.println("Select The Choice That You Want To Perform");
			System.out.println("1. Add Customer to DataBase");
			System.out.println("2. Update Customer Details (Balance and JoinDate) in DataBase");
			System.out.println("3. Find Customers List Between Range, According to the JoinDate");
			System.out.println("4. Remove Customer From DataBase");
			System.out.println("5. Print Details of All Customers");
			System.out.println("0. Exit/Stop Application");
			System.out.println("\nEnter Choice Here ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addCustomer(sc);
				break;
			case 2:
				updateCustomer(sc);
				break;
			case 3:
				SearchByDate(sc);
				break;
			case 4:
				removeCustomer();
				break;
			case 5:
				ShowListofAll();
				break;
			case 0:
				System.out.println("Thanks For Using Our Services");
				break;
			default:
				System.out.println("Oops...Invalid Choice! Try Again");
			}
			try {
				Thread.currentThread().sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (choice != 0);
		sc.close();
	}
}