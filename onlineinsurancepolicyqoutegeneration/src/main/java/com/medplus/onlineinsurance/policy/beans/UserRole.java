package com.medplus.onlineinsurance.policy.beans;

public class UserRole {
	private String userName;
	private String password;
	private String role;
	public  UserRole (){
		 
		

	}
	public UserRole(String userName, String password, String role) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserRole [userName=" + userName + ", password=" + password + ", role=" + role + "]";
	}
	

}
