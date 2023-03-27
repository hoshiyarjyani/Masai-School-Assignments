package com.dto;

public class DisplayModelDTO {
String carname;
int count;
public DisplayModelDTO(String carname, int count) {
	super();
	this.carname = carname;
	this.count = count;
}
public String getCarname() {
	return carname;
}
public void setCarname(String carname) {
	this.carname = carname;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
@Override
public String toString() {
	return " carname: " + carname + ", count: " + count;
}

}
