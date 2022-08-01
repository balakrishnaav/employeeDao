package jdbcintro;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;



public class TestDB {
	public static void main(String[] args) throws SQLException {
		Driver driver=new Driver();
		
		DriverManager.registerDriver(driver);
		String url="jdbc:mysql://localhost:3306/medplus";
		Connection conn=DriverManager.getConnection(url,"root", "Vbkr15hn@");
		System.out.println("success");
		Statement st=conn.createStatement(); 
		String qry="insert into student values('sai',102,555,'M',25,96656544)";
		//st.executeUpdate(qry);
		String qry2="insert into student values(?,?,?,?,?,?)";
		PreparedStatement pst=conn.prepareStatement(qry2);
		pst.setString(1, "krishna");
		pst.setInt(2, 103);
		pst.setInt(3, 564);
		pst.setString(4, "M");
		pst.setInt(5, 24);
		pst.setInt(6, 954555524);
		pst.executeUpdate();
		System.out.println("inserted");
	}

}
