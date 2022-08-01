package com.medplus.onlineinsurance.policy.utils;

public class InsuranceDBQueries {
	
	//UserRole Queries
	public static final String GETUSERROLE="select * from userrole where username=?";
	public static final String ADDUSERROLE="insert into userrole values(?,?,?)";
	
	public static final String GETUSERS = "select * from userrole";
	//Accounts Queries
	public static final String  GETACCOUNTS= "select max(AccountNumber) from accounts";
	public static final String ADDACCOUNTS="insert into accounts values(?,?,?,?,?,?,?,?,?)";

}
