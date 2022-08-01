package jdbcintro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.mysql.cj.jdbc.Driver;

public class TestDates {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		 Driver driver=new Driver();
			
			DriverManager.registerDriver(driver);
			String url="jdbc:mysql://localhost:3306/medplus";
			Connection conn=DriverManager.getConnection(url,"root", "Vbkr15hn@");
			String qry="insert into test2 values(?,?)";
			PreparedStatement pst=conn.prepareStatement(qry);
			pst.setString(1, "abcd");
			Date dt=new Date();
			java.sql.Date sqldt=new java.sql.Date(dt.getTime());
			pst.setDate(2, sqldt);
			pst.executeUpdate();
			System.out.println("ok");

	}

}
