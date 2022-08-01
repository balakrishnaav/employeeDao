package com.medplus.employee.utils;

public class EmploeeDBQueries {
	
	//EmployeeQueries
	public static final String ADDEMPL="insert into employee values(?,?,?,?,?,?)";
	public static final String GETEMPL="select * from employee";
	public static final String GETEMPLBYCODE="select * from employee where empcode=?";
	public static final String UPDATEEMPL="update employee set empname=?, job=?, doj=?, salary=? where empcode=?";
	public static final String GETEMPLSALABYCODE="select salary from employee where empcode=?";
	public static final String DELETEEMPL="DELETE FROM employee WHERE  empcode=?";
	//DepartmentQueries
	public static final String ADDDEPARTMENT="insert into department values (?,?,?,?)";
	public static final String GETDEPTS="select * from department";
	public static final String UPDATEDEPTS="update department set deptname='HR' where deptno=1";
	public static final String SHIFTLOCATION="update department set location=?,remarks=? where deptno=?";
	public static final String LISTDEPARTMENT="select deptname from department";
	
}
