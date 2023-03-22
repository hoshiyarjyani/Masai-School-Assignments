package jyani.hoshiyar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Book {

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

	static void addBook(Scanner sc) throws ClassNotFoundException, SQLException {
		// 1. Create Connection to database
		Connection con = getConnectionToRDMS();
		// 2. Get an Object of Statement
		Statement st = con.createStatement();

		// Taking Input from user
		System.out.println("Please Enter Book ID ");
		int bookId = sc.nextInt();
		System.out.println("Please Enter Book Name ");
		String bookName = sc.next();
		System.out.println("Please Enter Book Price ");
		double bookPrice = sc.nextDouble();
		System.out.println("Please Enter Book Author Name ");
		String bookAuthor = sc.next();
		System.out.println("Please Enter Publish Year ");
		String publishYear = sc.next();

		// Now Create Our Query
		String query = "INSERT INTO book VALUES('" + bookId + "','" + bookName + "','" + bookPrice + "','" + bookAuthor
				+ "','" + publishYear + "')";

		if (st.executeUpdate(query) > 0) {
			System.out.println("\nBook Added Successfully");
		} else {
			System.out.println("\n Not Able To Add Book");
		}

		closeConnection(con);
	}

	static void updateBook(Scanner sc) throws ClassNotFoundException, SQLException {
		Connection con = getConnectionToRDMS();
		Statement st = con.createStatement();
		System.out.println("Please Enter The Book Id that you want to update");
		int Id = sc.nextInt();

		System.out.println("Please Enter The Updated Author Name who's Book ID is " + Id);
		String bookAuthor = sc.next();

		String query = "UPDATE book SET bookAuthor = '" + bookAuthor + "' WHERE bookId = " + Id;
		int count = st.executeUpdate(query);
		if (count > 0) {
			System.out.println(count + " Book Author Name Sucessfully Updated Who's Book ID is " + Id);
		} else {
			System.out.println("Not Update ,May be Book is not Exist in Database");
		}
		closeConnection(con);
	}

	static void SearchByYear(Scanner sc) throws ClassNotFoundException, SQLException {
		Connection con = getConnectionToRDMS();
		Statement st = con.createStatement();
		System.out.println("Write the Year");
		String publishYear = sc.next();

		String query = "SELECT * FROM book WHERE publishYear= " + publishYear;

		ResultSet rs = st.executeQuery(query);
		if (!rs.isBeforeFirst() && rs.getRow() == 0) {
			System.out.println("Books not found that Publish in " + publishYear);
		} else {
			while (rs.next()) {
				System.out
						.println(rs.getInt("bookId") + " " + rs.getString("bookName") + " " + rs.getDouble("bookPrice")
								+ " " + rs.getString("bookAuthor") + " " + rs.getString("publishYear"));
			}
		}
		closeConnection(con);
	}

	static void SearchBookByPrice() throws ClassNotFoundException, SQLException {
		Connection con = getConnectionToRDMS();
		Statement st = con.createStatement();
		System.out.println("All Books that Price lies between 1000₹ to 2000₹");

		String query = "SELECT * FROM book WHERE bookPrice >= " + 1000 + " AND bookPrice<='" + 2000 + "'";

		ResultSet rs = st.executeQuery(query);
		if (!rs.isBeforeFirst() && rs.getRow() == 0) {
			System.out.println("No Book found Between 1000₹ to 2000₹");
		} else {
			while (rs.next()) {
				System.out
						.println(rs.getInt("bookId") + " " + rs.getString("bookName") + " " + rs.getDouble("bookPrice")
								+ " " + rs.getString("bookAuthor") + " " + rs.getString("publishYear"));
			}
		}

	}

	static void SearchBookByAuthorName(Scanner sc) throws ClassNotFoundException, SQLException {
		Connection con = getConnectionToRDMS();
		Statement st = con.createStatement();
		System.out.println("Please Enter Book Author Name");
		String bookAuthor = sc.next();

		String query = "SELECT * FROM book WHERE bookAuthor  = '" + bookAuthor + "'";

		ResultSet rs = st.executeQuery(query);
		if (!rs.isBeforeFirst() && rs.getRow() == 0) {
			System.out.println("No Book found who's Author is " + bookAuthor);
		} else {
			while (rs.next()) {
				System.out
						.println(rs.getInt("bookId") + " " + rs.getString("bookName") + " " + rs.getDouble("bookPrice")
								+ " " + rs.getString("bookAuthor") + " " + rs.getString("publishYear"));
			}
		}

	}

	static void ListofAllBooks() throws ClassNotFoundException, SQLException {
		Connection con = getConnectionToRDMS();
		Statement st = con.createStatement();
		System.out.println("We Are Scanning the Data of All Customers");
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String query = "SELECT * FROM book";
		ResultSet rs = st.executeQuery(query);
		if (!rs.isBeforeFirst() && rs.getRow() == 0) {
			System.out.println("Books Not Found");
		} else {
			while (rs.next()) {
				System.out
						.println(rs.getInt("bookId") + " " + rs.getString("bookName") + " " + rs.getDouble("bookPrice")
								+ " " + rs.getString("bookAuthor") + " " + rs.getString("publishYear"));
			}
		}
		closeConnection(con);

	}

	static void DeleteBook(Scanner sc) throws ClassNotFoundException, SQLException {
		// 1. Create Connection to RDMS
		Connection con = getConnectionToRDMS();
		// 2. Get an Object of Statement
		Statement st = con.createStatement();

		// Taking input from user if Balance is 0 then Delete
		System.out.println("Enter The Book Id That you wants to Delete");
		int Id = sc.nextInt();
		String query = "DELETE FROM book where bookId = " + Id;
		int count = st.executeUpdate(query);
		if (count > 0) {
			System.out.println(count + " Book , Removed Sucessfully");
		} else {
			System.out.println("No Books Available for this Author");
		}
		closeConnection(con);

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		do {
			System.out.println("Select The Choice That You Want To Perform");
			System.out.println("1. Add Book to DataBase");
			System.out.println("2. Update Book Details (AuthorName) using BookId in DataBase");
			System.out.println("3. Find Books List According Year of Publishing");
			System.out.println("4. Search and Print Books by Price Range between 1000₹ to 2000₹");
			System.out.println("5. Search and Print Book by Author Name");
			System.out.println("6. Print List of All Books");
			System.out.println("7. Delete Book By Book Id");
			System.out.println("0. Exit/Stop Application");
			System.out.println("\nEnter Choice Here ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addBook(sc);
				break;
			case 2:
				updateBook(sc);
				break;
			case 3:
				SearchByYear(sc);
				break;
			case 4:
				SearchBookByPrice();
				break;
			case 5:
				SearchBookByAuthorName(sc);
				break;
			case 6:
				ListofAllBooks();
				break;
			case 7:
				DeleteBook(sc);
				break;
			case 0:
				System.out.println("Thanks For Using Our Services");
				break;
			default:
				System.out.println("Oops...Invalid Choice! Try Again");
			}
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (choice != 0);
		sc.close();
	}
}
