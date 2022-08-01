package jdbcintro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class EmployeeDBDelete {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Driver driver=new Driver();
		
		DriverManager.registerDriver(driver);
		String url="jdbc:mysql://localhost:3306/medplus";
		Connection conn=DriverManager.getConnection(url,"root", "Vbkr15hn@");
		String qry="delete from employee where name='balu'";
		PreparedStatement pst=conn.prepareStatement(qry);
		pst.executeUpdate();
		System.out.println("ok");

	}

}
