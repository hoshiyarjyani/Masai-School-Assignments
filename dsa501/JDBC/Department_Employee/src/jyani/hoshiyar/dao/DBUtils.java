package jyani.hoshiyar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtils {
	static Connection getConnectionToDatabase() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		ResourceBundle rs = ResourceBundle.getBundle("dbDetails");
		return DriverManager.getConnection(rs.getString("url"), rs.getString("username"), rs.getString("password"));
	}

	static void closeConnection(Connection con) throws SQLException {
		if (con != null) {
			con.close();
		}
	}

	static boolean checkResultSet(ResultSet rs) throws SQLException {
		if (!rs.isBeforeFirst() && rs.getRow() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
