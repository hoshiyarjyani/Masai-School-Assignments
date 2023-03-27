package com.ui;

import java.util.List;
import java.util.Scanner;

import com.dao.CarDAO;
import com.dao.CarDAOImpl;
import com.dao.DeleteCarDAO;
import com.dao.DisplayCarDAO;
import com.dao.DisplayCarDAOImpl;
import com.dao.ModelDisplay;
import com.dao.UpdateCarDAO;
import com.dto.Car;
import com.dto.CarImpl;
import com.dto.DisplayCarDTO;
import com.dto.DisplayModelDTO;
import com.exception.NoRecordFoundException;
import com.exception.SomethingWentWrongException;

public class UiMain {

	static void AddCarUI(Scanner sc) {
		System.out.println("Please Enter The Details of CAR");
		System.out.println("Enter Car ID");
		String car_id = sc.next();
		System.out.println("Enter Model Name");
		String model_name = sc.next();
		System.out.println("Enter Price");
		int price = sc.nextInt();
		System.out.println("Enter Total Seat");
		int total_seats = sc.nextInt();
		System.out.println("Enter Company of Car");
		String company_id = sc.next();

		Car car = new CarImpl(car_id, model_name, price, total_seats, company_id);
		CarDAO carDAO = new CarDAOImpl();
		try {
			carDAO.AddCar(car);
			System.out.println(model_name + " Car Added Sucessfully");
		} catch (SomethingWentWrongException e) {
			System.out.println(e.getMessage());
		}

	}

	static void DisplayCarUI() throws SomethingWentWrongException, NoRecordFoundException {
	
		DisplayCarDAO display = new DisplayCarDAOImpl();
		List<DisplayCarDTO> list = display.DisplayCarDetails();
		System.out.println("List Of All Cars With Company");
		list.forEach(x -> System.out.println(x));
	}

	static void UpdateCarDetails(Scanner sc) throws SomethingWentWrongException {
		System.out.println("Enter The Car_id here");
		//car_id,model_name, price, total_seats, company_id
		String car_id = sc.next();
		System.out.println("Enter Updeted Model Name here");
		String model_name = sc.next();
		System.out.println("Enter Updated Price here");
		int price = sc.nextInt();
		System.out.println("Enter Updated Seats here");
		int total_seats = sc.nextInt();
		System.out.println("Enter Updated company_id");
		String company_id = sc.next();
		UpdateCarDAO car = new UpdateCarDAO();
		car.UpdateCar(car_id,model_name,price,total_seats,company_id);
		System.out.println("Car Sucessfully Added");
	}
	static void DeleteCarUI(Scanner sc) throws SomethingWentWrongException {
		System.out.println("Enter Car Id that you want to delete");
		String car_id = sc.next();
		DeleteCarDAO delete =new DeleteCarDAO();
		delete.DeleteCar(car_id);
		System.out.println("Sucessfully Deleted Car "+car_id);
	}
	
	static void DisplayCompanyModalUI() throws SomethingWentWrongException, NoRecordFoundException {
		ModelDisplay model = new ModelDisplay();
		List<DisplayModelDTO> list = model.DisplayModel();
		list.forEach(x->System.out.println(x));
	}
	
	public static void main(String[] args) throws SomethingWentWrongException, NoRecordFoundException {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("Enter Your Choice here");
			System.out.println("0. STOP/EXIT the Appliction");
			System.out.println("1. Add CAR to Database");
            System.out.println("2. Display CAR Details");
            System.out.println("3. Update The Car Details by Car ID");
            System.out.println("4. Delete Car By Car ID");
            System.out.println("5. Display Company Total Modal");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thanks for using Application. Bye Bye");
				break;
			case 1:
				AddCarUI(sc);
				break;
			
			case 2:
				 DisplayCarUI();
				 break;
			case 3: 
				UpdateCarDetails(sc);
				break;
			case 4: 
				DeleteCarUI(sc);
				break;
			case 5: 
				DisplayCompanyModalUI();
				break;
			
			default :
				System.out.println("Invalid Selection");
			}
		} while (choice != 0);
	}
}
