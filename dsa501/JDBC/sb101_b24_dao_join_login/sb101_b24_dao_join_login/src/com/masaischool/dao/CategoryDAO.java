package com.masaischool.dao;

import com.masaischool.dto.CategoryDTO;
import com.masaischool.exception.SomethingWentWrongException;

public interface CategoryDAO {
	public void addCategory(CategoryDTO catDTO) throws SomethingWentWrongException;
}
