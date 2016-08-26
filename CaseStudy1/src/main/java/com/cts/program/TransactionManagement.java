package com.cts.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * commit and roll back is performed
 * 
 * @author 542224
 *
 */
public class TransactionManagement {
	public static void main(String args[])
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		Connection conn = null;
		Statement stmt = null;

		Class.forName("com.mysql.jdbc.Driver");

		String connectionUrl = "jdbc:mysql://10.242.133.153:3306/test";

		String connectionUser = "root";
		String connectionPassword = "root";
		try {
			conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			String sql1 = "INSERT INTO products (productID, productCode, name, quantity, price) VALUES (6, 'PEN', 'PEN Green', 50, 10.00)";
			stmt.executeUpdate(sql1);
			String sql2 = "INSERT INTO products (productID, productCode, name, quantity, price) VALUES (4, 'PEN', 'PEN Green', 50, 10.00)";
			stmt.executeUpdate(sql2);
			conn.commit();
			System.out.println("inserted");

		} catch (Exception e) {
			conn.rollback();
			System.out.println("failed");
		}
	}
}
