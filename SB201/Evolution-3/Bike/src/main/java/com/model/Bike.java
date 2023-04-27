package com.model;

public class Bike {
	private int bikeNo;
	private String bikeColor;
	private String modelName;

	public Bike() {
	}

	public Bike(int bikeNo, String bikeColor, String modelName) {
		super();
		this.bikeNo = bikeNo;
		this.bikeColor = bikeColor;
		this.modelName = modelName;
	}

	public int getBikeNo() {
		return bikeNo;
	}

	public void setBikeNo(int bikeNo) {
		this.bikeNo = bikeNo;
	}

	public String getBikeColor() {
		return bikeColor;
	}

	public void setBikeColor(String bikeColor) {
		this.bikeColor = bikeColor;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "Bike [bikeNo=" + bikeNo + ", bikeColor=" + bikeColor + ", modelName=" + modelName + "]";
	}

}
