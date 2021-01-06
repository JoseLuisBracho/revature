package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Hello World with Maven");
		Connection connection = null;
		try {
			// Step 1 - Load Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully");
			// Step 2 - Open a connection (url, username, password)
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String user = "postgres";
			String pass = "postgres";
			connection = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Success");
			// Step 3 - Create a Statement
			Statement statement = connection.createStatement();
			String sql = "select playerid, playername, teamid, age, position, dob from \"Test\".player order by age desc";
			// Step 4 - Execute the Query
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Query Executed");
			// Step 5 - Process Result
			while (resultSet.next()) {
				System.out.print("Id : " + resultSet.getInt("playerid"));
				System.out.print(" Name : " + resultSet.getString("playername"));
				System.out.print(" TeamId : " + resultSet.getInt("teamid"));
				System.out.print(" Age : " + resultSet.getInt("age"));
				System.out.print(" Position : " + resultSet.getString("position"));
				System.out.println(" Birthday : " + resultSet.getDate("dob"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		} finally {
			try {
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
			
		}

	}

}