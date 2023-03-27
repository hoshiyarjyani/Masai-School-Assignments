package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtils {
 public static Connection getConnectionToDatabase() throws ClassNotFoundException, SQLException {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 ResourceBundle rb = ResourceBundle.getBundle("dbDetails");
	 return DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
 }
 
 public static void closeConnection(Connection con) throws SQLException {
	 if(con!=null) {
		 con.close();
	 }
 }
 
 public static boolean checkResultSet(ResultSet rs) throws SQLException {
	 if(!rs.isBeforeFirst() && rs.getRow()==0) {
		 return true;
	 }else {
		 return false;
	 }
 }
}
