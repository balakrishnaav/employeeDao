package com.medplus.emploee.exception;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends RuntimeException{
	public EmployeeNotFoundException(){
		super("employee not found");
	}

}
