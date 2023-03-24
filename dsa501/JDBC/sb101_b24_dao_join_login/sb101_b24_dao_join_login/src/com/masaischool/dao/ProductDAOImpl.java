package com.masaischool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masaischool.dto.CategoryDTOImpl;
import com.masaischool.dto.ProductDTO;
import com.masaischool.dto.ProductDTOImpl;
import com.masaischool.exception.NoRecordFoundException;
import com.masaischool.exception.SomethingWentWrongException;

public class ProductDAOImpl implements ProductDAO {
	@Override  id cat_id catname
	public List<ProductDTO> getProductListForCategory(String catId)
			throws SomethingWentWrongException, NoRecordFoundException {
		Connection conn = null;
		List<ProductDTO> list; 
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "SELECT pro_id, pro_name, price, cat_name "
					+ "FROM product P INNER JOIN category C ON P.category_id = C.id "
					+ "AND C.cat_id = ? AND P.is_delete = 0";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, catId);
			ResultSet rs = ps.executeQuery();
			if(DBUtils.isResultSetEmpty(rs)) {
				throw new NoRecordFoundException("No product in category " + catId);
			}
			
			list = new ArrayList<>();
			while(rs.next()) {
				list.add(new ProductDTOImpl(rs.getString(1), rs.getString(2), 
						rs.getDouble(3), new CategoryDTOImpl(null, rs.getString(4))));
			}
		}catch(ClassNotFoundException | SQLException ex) {
			throw new SomethingWentWrongException("Unable to add category");
		}finally {
			try {
				DBUtils.closeConnection(conn);
			}catch(SQLException ex) {
				
			}
		}
		return list;
	}

}
