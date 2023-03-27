package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.DisplayCarDTO;
import com.dto.DisplayCarDTOImpl;
import com.dto.DisplayModelDTO;
import com.exception.NoRecordFoundException;
import com.exception.SomethingWentWrongException;
import com.utils.DBUtils;

public class ModelDisplay {
	public List<DisplayModelDTO> DisplayModel() throws SomethingWentWrongException, NoRecordFoundException {
		List<DisplayModelDTO> list = new ArrayList<>();
		Connection con = null;
		try {

			con = DBUtils.getConnectionToDatabase();
			String query = "Select company_name , count(*) from company inner join car on company.company_id = car.company_id group by company_name";
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			if (DBUtils.checkResultSet(rs)) {
				throw new NoRecordFoundException("No Records Present in Database");
			}
			while (rs.next()) {
				list.add(new DisplayModelDTO(rs.getString(1), rs.getInt(2)));
			}

		} catch (ClassNotFoundException | SQLException e) {
			throw new SomethingWentWrongException("Oops! Unable to Add Car in Database");
		} finally {
			try {
				DBUtils.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
