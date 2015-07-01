package com.code4t2.carDealership.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestDatabaseConnections {

	public List<TestUser> GetUsers() {
		
		/* Declare the objects */
		
		// Connection String
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String connectionURL = "jdbc:sqlserver://SPICITY966:1433;databaseName=AdventureWorks2012;";
		
		String sqlStatement = "SELECT TOP 10 FirstName, LastName, EmailPromotion FROM Person.Person;";
		
		// JDBC objects
		//Connection con = null;
		//Statement cmd = null;
		//ResultSet res = null;
		
		//Array to hold the objects
		List<TestUser> Users = new ArrayList<TestUser>(); 
		
		/* Attempt the connection */
		
		try (Connection con = DriverManager.getConnection(connectionURL,"sa","$picity12345"); PreparedStatement cmd = con.prepareStatement(sqlStatement)) {
			cmd.execute();
			try (ResultSet res = cmd.getResultSet()) {
				while (res.next()) {
					Users.add(new TestUser(res.getString("FirstName"), res.getString("LastName"), res.getInt("EmailPromotion")));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Users;
	}
	
}
