package com.masai;

public class Vegetables extends Product {
    // Constructor
	 private static final double DISCOUNT_RATE = 0.1; 
    public Vegetables(String name, double pricePerUnit, int quantity) {
		super(name, pricePerUnit, quantity);
	}

	@Override
    public double calculateTotalPrice() {
        // Custom calculation for vegetables
		double subTotal = getPricePerUnit() * getQuantity();
		return subTotal - subTotal * DISCOUNT_RATE;

    }
}