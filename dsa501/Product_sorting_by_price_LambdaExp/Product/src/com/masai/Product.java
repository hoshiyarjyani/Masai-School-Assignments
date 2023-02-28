package com.masai;

public class Product {
	private int productId;
	private String productName;
	private int quantity;
	private int price;
	public Product(int productId, String productName, int quantity, int price) {
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [ProductId=" + productId + ", Product Name=" + productName + ", Quantity=" + quantity
				+ ", Price=" + price + "]";
	}
	
	
}
