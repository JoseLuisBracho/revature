package com.app.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresqlConnection {
	private static Connection connection;
	
	private PostgresqlConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {

		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String pass = "postgres";
		connection = DriverManager.getConnection(url, user, pass);

		return connection;
	}

}
