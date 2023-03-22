package jyani.hoshiyar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Product {
	// This Method for Make connection between Java application and MySQL
	static Connection getConnectionToRDMS() throws ClassNotFoundException, SQLException {
		// 1. Load the Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2. ResourceBundle
		ResourceBundle rb = ResourceBundle.getBundle("dbdetails");

		return DriverManager.getConnection(rb.getString("url"), rb.getString("username"), rb.getString("password"));

	}

	// This Method for the close the connection between Java and MySQL
	static void closeConnection(Connection con) throws SQLException {
		if (con != null) {
			con.close();
		}
	}

	// This method for add new product in Database
	static void AddProduct(Scanner sc) throws ClassNotFoundException, SQLException {
		// 1. Create Connection to database
		Connection con = getConnectionToRDMS();
		// 2. Create the Prepared Statement with empty values.
		PreparedStatement st = con
				.prepareStatement("INSERT INTO product (pid, pname, quantity, price) VALUES (?, ?, ?, ?)");

		// Taking Input from user
		System.out.println("Please Enter Product ID ");
		int pid = sc.nextInt();
		System.out.println("Please Enter Product Name ");
		String pname = sc.next();
		System.out.println("Please Enter Quantity ");
		int quantity = sc.nextInt();
		System.out.println("Please Enter Product Price ");
		int price = sc.nextInt();

		st.setInt(1, pid);
		st.setString(2, pname);
		st.setInt(3, quantity);
		st.setInt(4, price);

		if (st.executeUpdate() > 0) {
			System.out.println("\nProduct Added Successfully");
		} else {
			System.out.println("\n Not Able To Add Product");
		}

		closeConnection(con);
	}

	// This method for add new product without price and quantity in Database
	static void AddProductWithoutPriceQuantity(Scanner sc) throws ClassNotFoundException, SQLException {
		// 1. Create Connection to database
		Connection con = getConnectionToRDMS();
		// 2. Create the Prepared Statement with empty values.
		PreparedStatement st = con.prepareStatement("INSERT INTO product (pid, pname) VALUES (?, ?)");

		// Taking Input from user
		System.out.println("Please Enter Product ID ");
		int pid = sc.nextInt();
		System.out.println("Please Enter Product Name ");
		String pname = sc.next();

		st.setInt(1, pid);
		st.setString(2, pname);

		if (st.executeUpdate() > 0) {
			System.out.println("\nProduct Added Successfully");
		} else {
			System.out.println("\n Not Able To Add Product");
		}

		closeConnection(con);
	}

	// This method for update product's Price and Quantity in Database
	static void UpdateProductUsingId(Scanner sc) throws ClassNotFoundException, SQLException {
		// 1. Create Connection to database
		Connection con = getConnectionToRDMS();
		// 2. Create the Prepared Statement with empty values.
		PreparedStatement st = con.prepareStatement("UPDATE product SET quantity = ?, price = ? WHERE pid = ?");

		// Taking Input from user
		System.out.println("Please Enter Product ID of product That you wants to update quantity and price");
		int pid = sc.nextInt();
		System.out.println("Please Enter Quantity ");
		int quantity = sc.nextInt();
		System.out.println("Please Enter Product Price ");
		int price = sc.nextInt();

		st.setInt(1, quantity);
		st.setInt(2, price);
		st.setInt(3, pid);

		if (st.executeUpdate() > 0) {
			System.out.println("\nProduct who's " + pid + " Product Id Updated Successfully with Quantity " + quantity
					+ " and Price " + price);
		} else {
			System.out.println("\n Not Able To Update Product");
		}

		closeConnection(con);
	}

	// This method for Delete products who's Quantity is less then 2.
	static void DeleteProductByQuantity() throws ClassNotFoundException, SQLException {
		// 1. Create Connection to database
		Connection con = getConnectionToRDMS();
		// 2. Create the Prepared Statement with empty values.
		PreparedStatement st = con.prepareStatement("Delete from product WHERE quantity < 2");
		int count = st.executeUpdate();
		if (count > 0) {
			System.out.println("\n" + count + " Product who's Quantity < 2 Deleted Successfully.");
		} else {
			System.out.println(
					"\n There are not any Product who's Quantity is less then 2 or May be Something went Wrong");
		}

		closeConnection(con);
	}

	// This method for Printing all Products.
	static void DisplayProducts() throws ClassNotFoundException, SQLException {
		// 1. Create Connection to database
		Connection con = getConnectionToRDMS();
		// 2. Create the Prepared Statement with empty values.
		PreparedStatement st = con.prepareStatement("SELECT * FROM product");
		ResultSet rs = st.executeQuery();

		if (!rs.isBeforeFirst() && rs.getRow() == 0) {
			System.out.println("No Products Found");
		} else {
			while (rs.next()) {
				System.out.println(rs.getString("pid") + " " + rs.getString("pname") + " " + rs.getString("quantity")
						+ " " + rs.getDouble("price"));
			}
		}

		closeConnection(con);
	}

	// This method for Printing all Products using Product Name.
	static void DisplayProductsByProductName(Scanner sc) throws ClassNotFoundException, SQLException {
		// 1. Create Connection to database
		Connection con = getConnectionToRDMS();
		// 2. Create the Prepared Statement with empty values.
		PreparedStatement st = con.prepareStatement("SELECT * FROM product Where pname = ?");
		System.out.println("Please Enter Name Of Product that you want to print.");
		String pname = sc.next();
		st.setString(1, pname);

		ResultSet rs = st.executeQuery();

		if (!rs.isBeforeFirst() && rs.getRow() == 0) {
			System.out.println("No Products Found");
		} else {
			while (rs.next()) {
				System.out.println(rs.getString("pid") + " " + rs.getString("pname") + " " + rs.getString("quantity")
						+ " " + rs.getDouble("price"));
			}
		}

		closeConnection(con);
	}

	// This method for Printing all Products between Price Range.
	static void DisplayProductsByPriceRange(Scanner sc) throws ClassNotFoundException, SQLException {
		// 1. Create Connection to database
		Connection con = getConnectionToRDMS();
		// 2. Create the Prepared Statement with empty values.
		PreparedStatement st = con.prepareStatement("SELECT * FROM product Where price >= ? and price <= ?");
		System.out.println("Please Enter Start Price Of Products that you want to print.");
		int startPrice = sc.nextInt();

		System.out.println("Please Enter End Price Of Products that you want to print.");
		int endPrice = sc.nextInt();

		st.setInt(1, startPrice);
		st.setInt(2, endPrice);

		ResultSet rs = st.executeQuery();

		if (!rs.isBeforeFirst() && rs.getRow() == 0) {
			System.out.println("No Products Found Between This Range.");
		} else {
			while (rs.next()) {
				System.out.println(rs.getString("pid") + " " + rs.getString("pname") + " " + rs.getString("quantity")
						+ " " + rs.getDouble("price"));
			}
		}

		closeConnection(con);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);

		int choice = 0;
		do {

			System.out.println("Select The Choice That You Want To Perform");
			System.out.println("0. Exit/Stop Application");
			System.out.println("1. Add Products to DataBase");
			System.out.println("2. Insert a new Product without quantity and price");
			System.out.println("3. Update the price and quantity by Product ID");
			System.out.println("4. Delete all the Products whose quantity is less than 2");
			System.out.println("5. Display all products");
			System.out.println("6. Search products by pname and Print");
			System.out.println("7. Search products for a price range");
			System.out.println("\nEnter Choice Here ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				AddProduct(sc);
				break;
			case 2:
				AddProductWithoutPriceQuantity(sc);
				break;
			case 3:
				UpdateProductUsingId(sc);
				break;
			case 4:
				DeleteProductByQuantity();
				break;
			case 5:
				DisplayProducts();
				break;
			case 6:
				DisplayProductsByProductName(sc);
				break;
			case 7:
				DisplayProductsByPriceRange(sc);
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
