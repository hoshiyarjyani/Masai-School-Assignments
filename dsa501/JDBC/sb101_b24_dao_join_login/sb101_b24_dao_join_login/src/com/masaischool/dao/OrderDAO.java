package com.masaischool.dao;

import com.masaischool.exception.SomethingWentWrongException;

public interface OrderDAO {
	public void purchaseProduct(String productId) throws SomethingWentWrongException;
}
