package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	// main method
	private ProductService productServices;

	public ShoppingCart() {
		super();
	}

	@Autowired
	public ShoppingCart(ProductService productServices) {
		this.productServices = productServices;
	}

	public void addProduct(Product product) {
		productServices.addProduct(product);
	}

	public void removeProduct(Product product) {
		productServices.removeProduct(product);
	}

	public double calculateTotalCost() {
		return productServices.calculateTotalCost();
	}

}