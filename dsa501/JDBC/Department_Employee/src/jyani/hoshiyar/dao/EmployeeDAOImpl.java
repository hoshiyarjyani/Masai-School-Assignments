package jyani.hoshiyar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jyani.hoshiyar.dto.Department;
import jyani.hoshiyar.dto.DepartmentImpl;
import jyani.hoshiyar.dto.Employee;
import jyani.hoshiyar.exception.NoRecordFoundException;
import jyani.hoshiyar.exception.SomethingWentWrongException;

public class EmployeeDAOImpl implements EmployeeDAO {
	@Override
	public void AddEmployee(Employee emp) throws SomethingWentWrongException {
		Connection con = null;
		try {
			con = DBUtils.getConnectionToDatabase();
			String query = "INSERT INTO Employee (empId, ename,address,mobile,deptid) VALUES (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, emp.getEmpId());
			ps.setString(2, emp.getEname());
			ps.setString(3, emp.getAddress());
			ps.setString(4, emp.getMobile());
			ps.setInt(5, emp.getDeptid());
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
		
}
