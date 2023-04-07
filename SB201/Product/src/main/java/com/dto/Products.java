package com.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
    @Id
	private int productId;
	String productName;
	int quantity;
	int price;
	
	public Products() {
	}
	
	public Products(int productId, String productName, int quantity, int price) {
		super();
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
		return "Products [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
	
	
}
