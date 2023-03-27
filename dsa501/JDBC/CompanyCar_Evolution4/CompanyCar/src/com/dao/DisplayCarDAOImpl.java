package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.DisplayCarDTO;
import com.dto.DisplayCarDTOImpl;
import com.exception.NoRecordFoundException;
import com.exception.SomethingWentWrongException;
import com.utils.DBUtils;

public class DisplayCarDAOImpl implements DisplayCarDAO{
	@Override
	public List<DisplayCarDTO> DisplayCarDetails() throws SomethingWentWrongException, NoRecordFoundException {
		List<DisplayCarDTO> list = new ArrayList<>();
		Connection con = null;
		try {

			con = DBUtils.getConnectionToDatabase();
			String query = "Select car_id,model_name,price,total_seats,company_name,turnover_in_crores from car c inner join company com on c.company_id = com.company_id";
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			if (DBUtils.checkResultSet(rs)) {
				throw new NoRecordFoundException("No Records Present in Database");
			}
			while (rs.next()) {
				list.add(new DisplayCarDTOImpl(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4),
						rs.getString(5), rs.getInt(6)));
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
