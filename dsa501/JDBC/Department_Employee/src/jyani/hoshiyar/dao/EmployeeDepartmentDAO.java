package jyani.hoshiyar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jyani.hoshiyar.dto.Department;
import jyani.hoshiyar.dto.EmployeeDepartmentDTO;
import jyani.hoshiyar.exception.NoRecordFoundException;
import jyani.hoshiyar.exception.SomethingWentWrongException;

public class EmployeeDepartmentDAO {

	public List<EmployeeDepartmentDTO> PrintAccountDepartmentEmployeeUI()
			throws SomethingWentWrongException, NoRecordFoundException {
		List<EmployeeDepartmentDTO> list = new ArrayList<>();
		Connection con = null;
		try {
			con = DBUtils.getConnectionToDatabase();
			String query = "SELECT empId, ename, address, mobile, deptid, dname, location\r\n"
					+ "FROM department d \r\n" + "INNER JOIN employee e \r\n" + "ON d.did = e.deptid \r\n"
					+ "WHERE d.dname = 'Account';\r\n" + "";
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			if (DBUtils.checkResultSet(rs)) {
				throw new NoRecordFoundException("No Department found");
			}
			while (rs.next()) {
				list.add(new EmployeeDepartmentDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getInt(5), rs.getString(6), rs.getString(7)));
			}

		} catch (ClassNotFoundException | SQLException e) {
			throw new SomethingWentWrongException("Oops! Something Went Wrong Unable To Insert");
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
