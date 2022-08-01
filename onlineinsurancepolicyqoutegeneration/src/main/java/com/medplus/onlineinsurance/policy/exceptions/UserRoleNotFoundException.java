package com.medplus.onlineinsurance.policy.exceptions;

@SuppressWarnings("serial")
public class UserRoleNotFoundException extends RuntimeException{

	public UserRoleNotFoundException() {
		super("UserRole not found");
		
	}

}
