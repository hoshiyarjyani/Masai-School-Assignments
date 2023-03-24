package com.masaischool.dto;

public interface ProductDTO {
	public String getProId();

	public void setProId(String proId);

	public String getProName();

	public void setProName(String proName);

	public double getPrice();

	public void setPrice(double price);

	public CategoryDTO getCategory();

	public void setCategory(CategoryDTO category);
}
