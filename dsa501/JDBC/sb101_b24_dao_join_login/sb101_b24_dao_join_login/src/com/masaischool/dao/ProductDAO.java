package com.masaischool.dao;

import java.util.List;

import com.masaischool.dto.ProductDTO;
import com.masaischool.exception.NoRecordFoundException;
import com.masaischool.exception.SomethingWentWrongException;

public interface ProductDAO {
	public List<ProductDTO> getProductListForCategory(String catId) 
			throws SomethingWentWrongException, NoRecordFoundException;
}
