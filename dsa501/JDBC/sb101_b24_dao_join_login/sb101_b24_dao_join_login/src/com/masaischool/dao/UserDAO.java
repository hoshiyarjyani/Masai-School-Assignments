package com.masaischool.dao;

import com.masaischool.exception.NoRecordFoundException;
import com.masaischool.exception.SomethingWentWrongException;

public interface UserDAO {
	public void login(String username, String password) 
			throws SomethingWentWrongException, NoRecordFoundException;
	public void logout();
}
