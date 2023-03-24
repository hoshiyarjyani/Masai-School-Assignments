package com.masaischool.ui;

import java.util.List;
import java.util.Scanner;

import com.masaischool.dao.ProductDAO;
import com.masaischool.dao.ProductDAOImpl;
import com.masaischool.dto.ProductDTO;
import com.masaischool.exception.NoRecordFoundException;
import com.masaischool.exception.SomethingWentWrongException;

public class ProductUI {
	static void viewProductsByCategoryId(Scanner sc) {
		System.out.print("Enter category id whose product to be displayed ");
		String catId = sc.next();
		
		ProductDAO productDAO = new ProductDAOImpl();
		try {
			List<ProductDTO> list = productDAO.getProductListForCategory(catId);
			list.forEach(System.out::println);
		}catch(SomethingWentWrongException | NoRecordFoundException ex) {
			System.out.println(ex);
		}
	}
}
