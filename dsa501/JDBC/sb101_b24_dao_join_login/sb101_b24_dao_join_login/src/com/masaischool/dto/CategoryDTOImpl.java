package com.masaischool.dto;

public class CategoryDTOImpl implements CategoryDTO {
	private String catId;
	private String catName;
	
	public CategoryDTOImpl(String catId, String catName) {
		super();
		this.catId = catId;
		this.catName = catName;
	}
	
	@Override
	public String getCatId() {
		return catId;
	}
	
	@Override
	public void setCatId(String catId) {
		this.catId = catId;
	}
	
	@Override
	public String getCatName() {
		return catName;
	}
	
	@Override
	public void setCatName(String catName) {
		this.catName = catName;
	}

	@Override
	public String toString() {
		return "Category Id=" + catId + ", Category Name=" + catName;
	}
}
