package com.masaischool.ui;

import java.util.Scanner;

import com.masaischool.dao.CategoryDAO;
import com.masaischool.dao.CategoryDAOImpl;
import com.masaischool.dto.CategoryDTO;
import com.masaischool.dto.CategoryDTOImpl;
import com.masaischool.exception.SomethingWentWrongException;

public class CategoryUI {
	static void addCategoryUI(Scanner sc) {
		System.out.print("Enter category id ");
		String catId = sc.next();
		System.out.print("Enter category name ");
		String catName = sc.next();
		
		//stuff data to DTO
		CategoryDTO category = new CategoryDTOImpl(catId, catName);
		
		CategoryDAO catDAO = new CategoryDAOImpl();
		try {
			catDAO.addCategory(category);
			System.out.println("Category added successfully");			
		}catch(SomethingWentWrongException ex) {
			System.out.println(ex);
		}
	}
	
	static void updateCategoryUI(Scanner sc) {
		
	}
	
	static void deleteCategoryUI(Scanner sc) {
		
	}

	static void displayCategoryListUI() {
		
	}
	
	static void displayCategoryByCatIdUI() {
		
	}
}
