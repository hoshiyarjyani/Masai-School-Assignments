package com.masaischool.dto;

public class ProductDTOImpl implements ProductDTO {
	private String proId;
	private String proName;
	private double price;
	private CategoryDTO category;
	
	public ProductDTOImpl(String proId, String proName, double price, CategoryDTO category) {
		this.proId = proId;
		this.proName = proName;
		this.price = price;
		this.category = category;
	}

	@Override
	public String getProId() {
		return proId;
	}

	@Override
	public void setProId(String proId) {
		this.proId = proId;
	}

	@Override
	public String getProName() {
		return proName;
	}

	@Override
	public void setProName(String proName) {
		this.proName = proName;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public CategoryDTO getCategory() {
		return category;
	}

	@Override
	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product Id=" + proId + ", Product Name=" + proName + ", Price=" + price + ", Category=" + category.getCatName();
	}
	
	
}
