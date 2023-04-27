package com.masai;

import org.springframework.beans.factory.annotation.Autowired;

class Fruits extends Product {
	 private static final double TAX_RATE = 0.05; 
	@Autowired
	public Fruits(String name, double pricePerUnit, int quantity) {
		super(name, pricePerUnit, quantity);
	}

	@Override
	public double calculateTotalPrice() {
		double subTotal = getPricePerUnit() * getQuantity();
		return subTotal + subTotal * TAX_RATE;

	}
}