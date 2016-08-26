package com.cts.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Specified data will be updated in database
 * 
 * @author 542224
 *
 */
public class Jdbcupdate {
	/**
	 * registers driver class,establish connection,execute update query
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
			String sql = "UPDATE products SET name='PEN blue', quantity=70 WHERE productID=5";
			stmt.executeUpdate(sql);
			sql = "SELECT productID,name,quantity FROM products";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("productID");
				String name = rs.getString("name");
				int Quantity = rs.getInt("quantity");
				System.out.print("ID: " + id);
				System.out.print(", Name: " + name);
				System.out.print(", quantity:  " + Quantity + "\n");
			}
		} catch (Exception e) {

		}
	}

}
