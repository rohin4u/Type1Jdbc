package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Type1Driver {

	public static void main(String[] args){

		try(Connection con = DriverManager.
				getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","password"))
		{
		
		
		Statement statement = con.createStatement();
		ResultSet rSet = statement.executeQuery("select * from customer");
		
		while(rSet.next()) {
			System.out.println(rSet.getString(1)+"  "+rSet.getString(2)+" "+rSet.getString(3));
		}
		
		}catch(Exception e) {e.printStackTrace();}
		
	}

}
