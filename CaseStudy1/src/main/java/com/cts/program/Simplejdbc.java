package com.cts.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * contents of table displayed
 * 
 * @author 542224
 *
 */
public class Simplejdbc {
	/**
	 * registers driver class,establishes connection,executes select query
	 * 
	 * @param args
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void main(String args[])
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		Class.forName("com.mysql.jdbc.Driver");

		String connectionUrl = "jdbc:mysql://10.242.133.153:3306/test";

		String connectionUser = "root";
		String connectionPassword = "root";
		try {
			conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
			stmt = conn.createStatement();

			rs = stmt.executeQuery("SELECT * FROM products");

			while (rs.next()) {
				int id = rs.getInt("productID");
				System.out.println("productid is " + id);
			}
		} catch (Exception e) {

		}
	}
}
