package com.masaischool.ui;

import java.util.Scanner;

import com.masaischool.dao.UserDAO;
import com.masaischool.dao.UserDAOImpl;
import com.masaischool.exception.NoRecordFoundException;
import com.masaischool.exception.SomethingWentWrongException;

public class UserUI {
	static boolean login(Scanner sc) {
		System.out.print("Enter username ");
		String username = sc.next();
		System.out.print("Enter password ");
		String password = sc.next();
		UserDAO userDAO = new UserDAOImpl();
		try {
			userDAO.login(username, password);
		}catch(SomethingWentWrongException | NoRecordFoundException ex) {
			System.out.println(ex);
			return false;
		}
		return true;
	}
	
	static void logout() {
		UserDAO userDAO = new UserDAOImpl();
		userDAO.logout();
	}
}
