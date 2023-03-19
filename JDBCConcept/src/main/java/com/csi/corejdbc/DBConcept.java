package com.csi.corejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConcept {

	// Steps for JDBC

	// Step 1. Load Driver Class
	// Step 2. Establish Database connection
	// Step 3. Create Statement
	// Step 4. Execute Query
	// Step 5. Close Connection

	public static void main(String[] args) throws SQLException {

		Connection connection = null;

		// Step 1. Load Driver Class

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2. Establish connection
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqljoinsconcept?useSSL=false", "root", "root");

				// Step 3. Create Statement
				Statement statement = connection.createStatement();

				// Step 4. Execute Query

				ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");

				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + "\t " + resultSet.getString(2) + "\t "
							+ resultSet.getString(3) + "\t" + resultSet.getDouble(4));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			// Step 5. Close Connection
			connection.close();
		}

	}

}
