package com.csi.corejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCConcept {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2eeemphrm?useSSL=false", "root",
						"root");

				/*
				 * String createDBSQL = "create database j2eeemphrm";
				 * 
				 * PreparedStatement preparedStatement =
				 * connection.prepareStatement(createDBSQL);
				 * 
				 * preparedStatement.executeUpdate();
				 * 
				 * System.out.println("Database Created Successfully");
				 */

				// Create Table

				/*
				 * String createTableSQL =
				 * "create table employee(empid int, empname varchar(255), empsalary double)";
				 * 
				 * PreparedStatement preparedStatement =
				 * connection.prepareStatement(createTableSQL);
				 * 
				 * preparedStatement.executeUpdate();
				 * 
				 * System.out.println("Table created successfully");
				 */
				
				String insertSQL="insert into employee values(121, 'SWARA', 78000)";
				
				PreparedStatement preparedStatement= connection.prepareStatement(insertSQL);
				
				preparedStatement.executeUpdate();
				System.out.println("Data Inserted Successfully");
				
				// Update Data
				
				// Delete Data
				
				// Truncate Table
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
