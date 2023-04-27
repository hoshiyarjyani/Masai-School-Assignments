package com.masai;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
	private List<Product>  products = new ArrayList<Product>();

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		products.add(product);
	}

	@Override
	public void removeProduct(Product product) {
		// TODO Auto-generated method stub
		products.remove(product);
	}

	@Override
	public double calculateTotalCost() {
		double tc = 0;
		for (Product product : products) {
			tc += product.calculateTotalPrice();
		}
		return tc;
	}

	// Implement addProduct, removeProduct, and calculateTotalCost methods
}