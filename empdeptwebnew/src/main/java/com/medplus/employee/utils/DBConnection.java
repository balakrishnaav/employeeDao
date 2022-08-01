package com.medplus.employee.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBConnection {
	private static Connection conn;
	public static Connection open() {
		String url="jdbc:mysql://localhost:3306/medplus";
		try {
			DriverManager.registerDriver(new Driver());//in the latest versions it is not necessary to write this line it is automatically registered
			conn=DriverManager.getConnection(url,"root", "Vbkr15hn@");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	public static void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
