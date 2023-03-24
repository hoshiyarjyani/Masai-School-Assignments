package com.masaischool.ui;

import java.util.Scanner;

public class UIMain {
	static void displayAdminMenu() {
		System.out.println("0. Log out Admin");
		System.out.println("1. Add new Category");
		System.out.println("2. View all products for a Category");
		System.out.println("3. Add new Product");
		System.out.println("4. View All Products");
		System.out.println("5. View all Users");
		System.out.println("6. View all Orders");
	}
	
	static void adminMenu(Scanner sc) {
		int choice = 0;
		do {
			displayAdminMenu();
			System.out.print("Enter selection ");
			choice = sc.nextInt();
			switch(choice) {
				case 0:
					System.out.println("Bye Bye admin");
					break;
				case 1:
					CategoryUI.addCategoryUI(sc);
					break;
				case 2:
					ProductUI.viewProductsByCategoryId(sc);
					break;
				case 3:
					//productUI.addProduct();
					break;
				case 4:
					//userUI.viewAllUsers();
					break;
				case 5:
					//orderUI.viewAllOrders();
//					SELECT U.username, P.pro_name
//					FROM orders O INNER JOIN product P ON 
//					O.product_id = P.id INNER JOIN user U ON
//					U.id = O.user_id;
//					Create an object of OrderDTO
//					new OrderDTO(new ProductDTO(null, pro_name, null, null), new UserDTO(null, username, null));
					break;
				default:
					System.out.println("Invalid Selection, try again");
			}
		}while(choice != 0);
	}
	
	static void adminLogin(Scanner sc) {
		System.out.print("Enter username ");
		String username = sc.next();
		System.out.print("Enter password ");
		String password = sc.next();
		
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			adminMenu(sc);
		}else {
			System.out.println("Invalid Username and Password");
		}
	}
	static void displayUserMenu() {
		System.out.println("1. View All Products");
		System.out.println("2. Purchase a Product");
		System.out.println("3. View Order History");
		System.out.println("4. Update My Name");
		System.out.println("5. Update My Password");
		System.out.println("6. Delete My Account");
		System.out.println("0. Logout");
	}
	
	static void userLogin(Scanner sc) {
		if(!UserUI.login(sc))
			return;

		//you are here means login is successful
		int choice = 0;
		do {
			displayUserMenu();
			System.out.print("Enter selection ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					//productUI.viewAllProducts();
					break;
				case 2:
					OrderUI.purchase(sc);
					break;
				case 3:
					//orderUI.viewOrderDetails();
					break;
				case 4:
					//userUI.updateNameOfUser();
					break;
				case 5:
					//userUI.changePassword();
					break;
				case 6:
					//userUI.deleteUser();
				case 0:
					UserUI.logout();
					break;
				default:
					System.out.println("Invalid Selection, try again");
			}
		}while(choice != 0);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//user CategoryUI, ProductUI, OrderUI and UserUI class here  
		int choice = 0;
		do {
			System.out.println("1. Admin Login\n2. User Login\n3. User Sign Up\n0. Exit");
			choice = sc.nextInt();
			switch(choice) {
				case 0:
					System.out.println("Thank you, Visit again");
					break;
				case 1:
					adminLogin(sc);
					break;
				case 2:
					userLogin(sc);
					break;
				case 3:
					//userUI.signup(sc);
					break;
				default:
					System.out.println("Invalid Selection, try again");
			}
		}while(choice != 0);
		sc.close();
	}
}
