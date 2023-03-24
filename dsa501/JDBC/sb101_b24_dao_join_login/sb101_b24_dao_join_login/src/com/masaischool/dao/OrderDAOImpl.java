package com.masaischool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.masaischool.exception.SomethingWentWrongException;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void purchaseProduct(String productId) throws SomethingWentWrongException {
		Connection conn = null;
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "INSERT INTO orders (product_id, user_id) VALUES (?, ?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, productId);
			ps.setInt(2, LoggedInUser.loggedInUserId);
			ps.executeUpdate();
		}catch(ClassNotFoundException | SQLException ex) {
			throw new SomethingWentWrongException("Unable to add category");
		}finally {
			try {
				DBUtils.closeConnection(conn);
			}catch(SQLException ex) {
				
			}
		}
	}

}
