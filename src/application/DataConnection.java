package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {
	
	public static Connection getConnection() throws SQLException {
		String url ="jdbc:sqlserver://LAPTOP-OU0COMFK;databaseName=northwind;integratedSecurity=true;TrustServerCertificate=True;Trusted_Connection=true";
		return DriverManager.getConnection(url);
		}

}
