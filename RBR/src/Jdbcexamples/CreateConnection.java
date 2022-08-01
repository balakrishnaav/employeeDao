package Jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medplus", "root", "Vbkr15hn@");
		    System.out.println(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
