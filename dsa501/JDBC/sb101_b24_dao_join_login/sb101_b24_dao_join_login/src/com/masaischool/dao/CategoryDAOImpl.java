package com.masaischool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masaischool.dto.CategoryDTO;
import com.masaischool.exception.SomethingWentWrongException;

public class CategoryDAOImpl implements CategoryDAO {
	@Override
	public void addCategory(CategoryDTO catDTO) throws SomethingWentWrongException {
		Connection conn = null;
		try {
			conn = DBUtils.getConnectionTodatabase();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO category (cat_id, cat_name) VALUES (?, ?)");
			ps.setString(1, catDTO.getCatId());
			ps.setString(2, catDTO.getCatName());
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
