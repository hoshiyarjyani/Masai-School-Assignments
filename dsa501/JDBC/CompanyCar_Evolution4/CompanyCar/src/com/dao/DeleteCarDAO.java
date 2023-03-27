package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.exception.SomethingWentWrongException;
import com.utils.DBUtils;

public class DeleteCarDAO {

	public void DeleteCar(String car_id) throws SomethingWentWrongException {
		Connection con = null;
		try {
			con = DBUtils.getConnectionToDatabase();
			String query = "DELETE FROM car where car_id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, car_id);
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			throw new SomethingWentWrongException("Oops! Unable to Delete Car in Database");
		} finally {
			try {
				DBUtils.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
