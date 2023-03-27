package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.utils.*;
import com.dto.Car;
import com.exception.SomethingWentWrongException;

public class CarDAOImpl implements CarDAO {
	@Override
	public void AddCar(Car car) throws SomethingWentWrongException {
		Connection con = null;
		try {
			con = DBUtils.getConnectionToDatabase();
			String query = "INSERT INTO car (car_id,model_name,price,total_seats,company_id) VALUES (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, car.getCar_id());
			ps.setString(2, car.getModel_name());
			ps.setInt(3, car.getPrice());
			ps.setInt(4, car.getTotal_seats());
			ps.setString(5, car.getCompany_id());
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			throw new SomethingWentWrongException("Oops! Unable to Add Car in Database");
		} finally {
			try {
				DBUtils.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
