package com.cts.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcinsert {
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
			String sql = "INSERT INTO products (productID, productCode, name, quantity, price) VALUES (7, 'PEN', 'PEN Green', 50, 10.00)";
			stmt.executeUpdate(sql);
			sql = "SELECT * FROM products";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("productID");
				String productcode = rs.getString("productCode");
				String name = rs.getString("name");
				int Quantity = rs.getInt("quantity");
				int price = rs.getInt("price");
				System.out.print("ID: " + id);
				System.out.print(", code: " + productcode);
				System.out.print(", Name: " + name);
				System.out.print(", quantity:  " + Quantity);
				System.out.print(", price:  " + price + "\n");
			}
		} catch (Exception e) {

		}
	}
}
