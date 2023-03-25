package jyani.hoshiyar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jyani.hoshiyar.dto.Department;
import jyani.hoshiyar.dto.DepartmentImpl;
import jyani.hoshiyar.exception.NoRecordFoundException;
import jyani.hoshiyar.exception.SomethingWentWrongException;

public class DepartmentDAOImpl implements DepartmentDAO {
	@Override
	public void AddDepartment(Department dept) throws SomethingWentWrongException {
		Connection con = null;
		try {
			con = DBUtils.getConnectionToDatabase();
			String query = "INSERT INTO Department (did,dname,location) VALUES (?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, dept.getDid());
			ps.setString(2, dept.getDname());
			ps.setString(3, dept.getLocation());

			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			throw new SomethingWentWrongException("Oops! Something Went Wrong Unable To Insert");
		} finally {
			try {
				DBUtils.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	public void DeleteDepartmentByDidUI(String did) throws SomethingWentWrongException {
		Connection con = null;
		int count;
		try {
			con = DBUtils.getConnectionToDatabase();
			String query = "DELETE FROM department WHERE did = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, did);

			count = ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			throw new SomethingWentWrongException("Oops! Unable To Delete! Try Again later.");
		} finally {
			try {
				DBUtils.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<DepartmentImpl> PrintDepartmentByEmployeeLocationUI()
			throws SomethingWentWrongException, NoRecordFoundException {
		List<DepartmentImpl> list = new ArrayList<>();
		Connection con = null;
		try {
			con = DBUtils.getConnectionToDatabase();
			String query = "SELECT department.*\r\n"
					+ "FROM department\r\n"
					+ "INNER JOIN employee ON department.did = employee.deptid\r\n"
					+ "WHERE employee.address = 'Mumbai';\r\n"
					+ "";
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			if (DBUtils.checkResultSet(rs)) {
				throw new NoRecordFoundException("No Department found Who's Employee is from Mumbai");
			}
			while (rs.next()) {
				list.add(new DepartmentImpl(rs.getInt(1),rs.getString(2),rs.getString(3)));
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
