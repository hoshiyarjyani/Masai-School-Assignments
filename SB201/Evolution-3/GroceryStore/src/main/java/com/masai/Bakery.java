package com.masai;

public class Bakery extends Product {
	// Constructor

	public Bakery(String name, double pricePerUnit, int quantity) {
		super(name, pricePerUnit, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateTotalPrice() {
		// Custom calculation for vegetables

		return getPricePerUnit() * getQuantity();
	}
}
