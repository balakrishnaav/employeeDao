package jdbcintro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class EmployeeDBTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Driver driver=new Driver();
		
		DriverManager.registerDriver(driver);
		String url="jdbc:mysql://localhost:3306/medplus";
		Connection conn=DriverManager.getConnection(url,"root", "Vbkr15hn@");
		String qry="insert into employee values(?,?,?,?,?)";
		PreparedStatement pst=conn.prepareStatement(qry);
		Scanner sc=new Scanner(System.in);
		Integer code=sc.nextInt();
		String name=sc.next();
		String job=sc.next();
		Integer salary=sc.nextInt();
		Date dt=new Date();
		java.sql.Date sqldt=new java.sql.Date(dt.getTime());
		pst.setInt(1,code);
		pst.setString(2, name);
		pst.setString(3,job);
		pst.setInt(4, salary);
		pst.setDate(5, sqldt);
		pst.executeUpdate();
		System.out.println("ok");
		sc.close();

	}

}
