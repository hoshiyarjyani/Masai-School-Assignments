package com.masai;

public class Toy {
 final private String toyNumber;
 private String toyName;
 private double price;
 private String category;
public Toy(String toyNumber, String toyName, double price, String category) {
	super();
	this.toyNumber = toyNumber;
	this.toyName = toyName;
	this.price = price;
	this.category = category;
}
public String getToyName() {
	return toyName;
}
public void setToyName(String toyName) {
	this.toyName = toyName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getToyNumber() {
	return toyNumber;
}
@Override
public String toString() {
	return toyNumber+"\t\t"+toyName+"\t\t"+price+"\t\t"+category;
}
 
}
