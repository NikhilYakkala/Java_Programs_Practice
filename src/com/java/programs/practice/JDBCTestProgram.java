package com.java.programs.practice;

import com.mysql.jdbc.Connection;

import java.sql.*;

public class JDBCTestProgram {
	
	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/nikhil", "root","root");
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from login");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
