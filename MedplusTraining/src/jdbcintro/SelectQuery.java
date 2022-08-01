package jdbcintro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;


public class SelectQuery {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
       Driver driver=new Driver();
		
		DriverManager.registerDriver(driver);
		String url="jdbc:mysql://localhost:3306/medplus";
		Connection conn=DriverManager.getConnection(url,"root", "Vbkr15hn@");
		String qry="select * from student";
		PreparedStatement pst=conn.prepareStatement(qry);
		ResultSet rs=pst.executeQuery();
		ResultSetMetaData data=rs.getMetaData();
		for (int i=1;i<=data.getColumnCount();i++)
			System.out.print(data.getColumnName(i)+" ");
		System.out.println("\n--------------------");
		while(rs.next())
			System.out.println(rs.getString(1)+" "+rs.getInt("regno")+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getInt(6));

	}

}
