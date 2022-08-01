package com.medplus.onlineinsurance.policy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.medplus.onlineinsurance.policy.beans.Accounts;
import com.medplus.onlineinsurance.policy.utils.DBConnection;
import com.medplus.onlineinsurance.policy.utils.InsuranceDBQueries;

public class AccountsDaoImpl implements AccountsDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public int addAccount(Accounts account) {
		// TODO Auto-generated method stub
		conn=DBConnection.open();
		int rows=0;
		try {
			pst=conn.prepareStatement(InsuranceDBQueries.ADDACCOUNTS);
			pst.setInt(1, account.getAccountNumber());
			pst.setString(2, account.getInsuredName());
			pst.setString(3, account.getInsuredStreet());
			pst.setString(4, account.getInsuredCity());
			pst.setString(5, account.getInsuredState());
			pst.setInt(6, account.getInsuredZip());
			pst.setString(7, account.getBusinessSegment());
			pst.setString(8, account.getAgentName());
			pst.setString(9, account.getUserName());
			rows=pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close();
		}
		return rows;
	}
	@Override
	public int getMaxCount() {
		// TODO Auto-generated method stub
		conn=DBConnection.open();
		int rows=0;
		try {
			pst=conn.prepareStatement(InsuranceDBQueries.GETACCOUNTS);
			
			rs=pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

}
