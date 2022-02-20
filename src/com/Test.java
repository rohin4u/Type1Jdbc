package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:customer/localhost:33006", "system", "password");

		if(con!=null) {
			System.out.println("connection established");
		}else {
			System.out.println("connection couldn't established");
		}
	}

}
