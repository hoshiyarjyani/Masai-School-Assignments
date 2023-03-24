
package com.masaischool.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtils {
	/**
	 * Establish connection to the database
	 * @return Connection object that is handle for the connection with database
	 * @throws SQLException If some credentials are wrong, database not started etc ect
	 * @throws ClassNotFoundException If driver class is not found
	 */
	static Connection getConnectionTodatabase() throws SQLException, ClassNotFoundException {
		//step-1: load the Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step-2
		ResourceBundle rb = ResourceBundle.getBundle("dbdetails");
		return DriverManager.getConnection(rb.getString("url"), rb.getString("username"), rb.getString("password"));
	}
	
	/**
	 * close the connection with the database
	 * @param conn Connection object for which connection is to be closed
	 * @throws SQLException if anything goes wrong
	 */
	static void closeConnection(Connection conn) throws SQLException {
		if(conn != null)
			conn.close();
	}
	
	/**
	 * check whether the ResultSet is empty or not
	 * @param rs: ResultSet to be checked for empty
	 * @return true if Resultset is Empty, false otherwise
	 * @throws SQLException if anything goes wrong
	 */
	static boolean isResultSetEmpty(ResultSet rs) throws SQLException {
		if(!rs.isBeforeFirst() && rs.getRow() == 0)
			return true;
		return false;
	}
}
