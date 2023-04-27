package com.masai;

public abstract class Product {
    private String name;
    private double pricePerUnit;
    private int quantity;

   

    public Product(String name, double pricePerUnit, int quantity) {
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.quantity = quantity;
	}



	public abstract double calculateTotalPrice();



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPricePerUnit() {
		return pricePerUnit;
	}



	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
    // Getters and setters
	
	
}