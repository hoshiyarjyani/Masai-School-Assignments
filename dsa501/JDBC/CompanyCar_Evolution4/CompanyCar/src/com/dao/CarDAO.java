package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dto.Car;
import com.exception.SomethingWentWrongException;
import com.utils.DBUtils;

public interface CarDAO {
	public void AddCar(Car car) throws SomethingWentWrongException ;
}
