package com.masaischool.ui;

import java.util.Scanner;

import com.masaischool.dao.OrderDAO;
import com.masaischool.dao.OrderDAOImpl;
import com.masaischool.exception.SomethingWentWrongException;

public class OrderUI {
	static void purchase(Scanner sc) {
		System.out.println("Enter product Id ");
		String productId = sc.next();
		
		OrderDAO orderDAO = new OrderDAOImpl();
		try {
			orderDAO.purchaseProduct(productId);
			System.out.println("Order placed successfuly");
		}catch(SomethingWentWrongException ex) {
			System.out.println(ex);
		}
	}
}
