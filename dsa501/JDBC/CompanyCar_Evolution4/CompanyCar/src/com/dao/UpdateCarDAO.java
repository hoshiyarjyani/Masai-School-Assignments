package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dto.Car;
import com.exception.SomethingWentWrongException;
import com.utils.DBUtils;

public class UpdateCarDAO {

	public void UpdateCar(String car_id, String model_name, int price, int total_seats, String company_id)
			throws SomethingWentWrongException {
		Connection con = null;
		try {
			con = DBUtils.getConnectionToDatabase();
			String query = "UPDATE car Set model_name = ?,price = ?,total_seats = ? ,company_id = ? where car_id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, model_name);
			ps.setInt(2, price);
			ps.setInt(3, total_seats);
			ps.setString(4, company_id);
			ps.setString(5, car_id);
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			throw new SomethingWentWrongException("Oops! Unable to Update Car in Database");
		} finally {
			try {
				DBUtils.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
