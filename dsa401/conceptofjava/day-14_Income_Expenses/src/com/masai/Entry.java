package com.masai;

import java.time.LocalDate;

public class Entry {
	private String particular;
	private double amount;
	private LocalDate date;
	private char category;
	


public Entry(String particular, double amount, LocalDate date, char category) {
		super();
		this.particular = particular;
		this.amount = amount;
		this.date = date;
		this.category = category;
	}

public String getParticular() {
	return particular;
}

public void setParticular(String particular) {
	this.particular = particular;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public LocalDate getDate() {
	return date;
}

public void setDate(LocalDate date) {
	this.date = date;
}

public char getCategory() {
	return category;
}

public void setCategory(char category) {
	this.category = category;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	if(category=='E') {
		return date+"\t\t-"+amount+"\t\t"+particular;
	}else {
		return date+"\t\t"+amount+"\t\t"+particular;
    }
}


}
