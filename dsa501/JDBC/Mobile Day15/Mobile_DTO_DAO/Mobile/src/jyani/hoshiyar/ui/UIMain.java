package jyani.hoshiyar.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import jyani.hoshiyar.dao.MobileDAO;
import jyani.hoshiyar.dao.MobileDAOImpl;
import jyani.hoshiyar.dto.Mobile;
import jyani.hoshiyar.dto.MobileImpl;
import jyani.hoshiyar.exception.NoRecordFoundException;
import jyani.hoshiyar.exception.SomethingWentWrongException;

public class UIMain {
	public static void addMobileUI(Scanner sc) {
		System.out.println("Enter Mobile Details Here \n");
		System.out.println("Please Enter Modal_No");
		String model_no = sc.next();
		System.out.println("Please Enter Company");
		String company = sc.next();
		System.out.println("Please Enter Price");
		int price = sc.nextInt();
		System.out.println("Please Enter MFGdate (YYYY-MM-DD)");
		LocalDate MFGdate = LocalDate.parse(sc.next());
		Mobile mob = new MobileImpl(model_no, company, price, MFGdate);
		MobileDAO mobDAO = new MobileDAOImpl();
		try {
			mobDAO.AddMobile(mob);
			System.out.println("Mobile Added Sucessfully!");
		} catch (SomethingWentWrongException e) {
			System.out.println(e);
		}

	}

	public static void UpdateMobileUsingModalNoUI(Scanner sc) {
		System.out.println("Enter Mobile Details Here \n");
		System.out.println("Please Enter Modal_No");
		String model_no = sc.next();
		System.out.println("Please Enter Company");
		String company = sc.next();
		System.out.println("Please Enter Price");
		int price = sc.nextInt();
		System.out.println("Please Enter MFGdate (YYYY-MM-DD)");
		LocalDate MFGdate = LocalDate.parse(sc.next());
		Mobile mob = new MobileImpl(model_no, company, price, MFGdate);
		MobileDAO mobDAO = new MobileDAOImpl();
		try {
			mobDAO.UpdateMobileUsingModalNo(mob);
			System.out.println("Mobile Details Updated Sucessfully!");
		} catch (SomethingWentWrongException e) {
			System.out.println(e);
		}

	}

	public static void DeleteMobileUsingModalNoUI(Scanner sc) {
		System.out.println("Please Enter Modal_No");
		String model_no = sc.next();
		MobileDAO mobDAO = new MobileDAOImpl();
		try {
			mobDAO.DeleteMobileUsingModalNo(model_no);
			System.out.println("Sucessfully Deleted Mobile From Database who's Model is " + model_no);
		} catch (SomethingWentWrongException e) {
			System.out.println(e);
		}

	}

	public static void ViewAllMobilesUI() {
		MobileDAO mobDAO = new MobileDAOImpl();
		try {
			List<Mobile> list = mobDAO.ViewAllMobiles();
			list.forEach(x -> System.out.println("ModelNo: " + x.getModel_no() + " Company: " + x.getCompany()
					+ " Price: " + x.getPrice() + " MFGDate: " + x.getMFGdate()));

		} catch (NoRecordFoundException | SomethingWentWrongException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void SearchMobileByModelNoUI(Scanner sc) {
		MobileDAO mobDAO = new MobileDAOImpl();
		System.out.println("Please Enter Model No.");
		String model_no = sc.next();
		try {
			List<Mobile> list = mobDAO.SearchMobileByModelNo(model_no);
			list.forEach(x -> System.out.println("ModelNo: " + x.getModel_no() + " Company: " + x.getCompany()
					+ " Price: " + x.getPrice() + " MFGDate: " + x.getMFGdate()));

		} catch (NoRecordFoundException | SomethingWentWrongException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void SearchMobileByPriceRangeUI(Scanner sc) {
		MobileDAO mobDAO = new MobileDAOImpl();
		System.out.println("Please Enter Start Range or Price");
		int p1 = sc.nextInt();
		System.out.println("Please Enter End Range or Price");
		int p2 = sc.nextInt();
		try {
			List<Mobile> list = mobDAO.SearchMobileByPriceRange(p1,p2);
			list.forEach(x -> System.out.println("ModelNo: " + x.getModel_no() + " Company: " + x.getCompany()
					+ " Price: " + x.getPrice() + " MFGDate: " + x.getMFGdate()));

		} catch (NoRecordFoundException | SomethingWentWrongException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("Enter your choice\n");
			System.out.println("0. Exit Application");
			System.out.println("1. Add Mobile To DataBase");
			System.out.println("2. Update Mobile's Company, Price, MFGdate by Modal_No");
			System.out.println("3. Delete Mobile Record from DataBase using Modal_No");
			System.out.println("4. View All Record");
			System.out.println("5. Search mobile by Model Number");
			System.out.println("6. Search mobile by Price Range\n");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thanks For Using Our Service. Bye Bye");
				break;
			case 1:
				addMobileUI(sc);
				break;
			case 2:
				UpdateMobileUsingModalNoUI(sc);
				break;
			case 3:
				DeleteMobileUsingModalNoUI(sc);
				break;
			case 4:
				ViewAllMobilesUI();
				break;
			case 5:
				SearchMobileByModelNoUI(sc);
				break;
			case 6:
				SearchMobileByPriceRangeUI(sc);
				break;
			default:
				System.out.println("Invalid Selection please try again later");
			}

		} while (choice != 0);
		sc.close();
	}
}
//- Add mobile
//- update company, price & MFGdate using model_no of mobile
//- delete mobile using model_no of mobile
//- View all Mobiles
//- Search mobile by Model Number [Hint: A model number is assigned to one mobile only]
//- Search mobile by Price Range