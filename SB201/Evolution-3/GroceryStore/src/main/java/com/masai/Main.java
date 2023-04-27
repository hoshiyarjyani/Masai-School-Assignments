package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigration.class);
		ProductService productService = context.getBean(ProductServiceImpl.class);
		
		productService.addProduct(new Fruits("mango", 1.0, 5));
		productService.addProduct(new Vegetables("veg", 0.5, 10));
		productService.addProduct(new Bakery("samosa", 2.0, 2));
		
		productService.removeProduct(new Fruits("mango", 1.0, 5));
		
		// calculate total cost
		double totalCost = productService.calculateTotalCost();
		System.out.println("Total cost: rupees " + totalCost);
	
	}
}
