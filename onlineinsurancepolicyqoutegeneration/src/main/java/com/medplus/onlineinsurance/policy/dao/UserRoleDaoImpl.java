package com.medplus.onlineinsurance.policy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.medplus.onlineinsurance.policy.beans.UserRole;
import com.medplus.onlineinsurance.policy.exceptions.UserRoleNotFoundException;
import com.medplus.onlineinsurance.policy.utils.DBConnection;
import com.medplus.onlineinsurance.policy.utils.InsuranceDBQueries;

public class UserRoleDaoImpl implements UserRoleDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public UserRole getUserByUsernam(String username) throws UserRoleNotFoundException{
		// TODO Auto-generated method stub
		conn=DBConnection.open();
		UserRole user=new UserRole();
		try {
			pst=conn.prepareStatement(InsuranceDBQueries.GETUSERROLE);
			pst.setString(1, username);
			rs=pst.executeQuery();
			if(!rs.next())
				throw new UserRoleNotFoundException();
			user.setUserName(rs.getString(1));
			user.setPassword(rs.getString(2));
			user.setRole(rs.getString(3));
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			DBConnection.close();
		}
		return user;
	}
	@Override
	public int addUser(UserRole user) {
		// TODO Auto-generated method stub
		conn=DBConnection.open();
		int rows=0;
		try {
			pst=conn.prepareStatement(InsuranceDBQueries.ADDUSERROLE);
			pst.setString(1, user.getUserName());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getRole());
			rows=pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}
	@Override
	public List<UserRole> getUsers() {
		// TODO Auto-generated method stub
		conn=DBConnection.open();
		List<UserRole> users=new ArrayList<UserRole>();
		try {
			pst=conn.prepareStatement(InsuranceDBQueries.GETUSERS);
			rs=pst.executeQuery();
			while(rs.next()) {
				UserRole user=new UserRole();
				user.setUserName(rs.getString(1));
				user.setRole(rs.getString(2));
				user.setPassword(rs.getString(3));
				users.add(user);
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				DBConnection.close();
			}
		return users;
	}

}
