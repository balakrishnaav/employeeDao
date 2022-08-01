package com.medplus.employee.dao;

import java.util.List;
import com.medplus.employee.beans.Employee;

public interface EmployeeDao {
	int addEmployee(Employee employee);
	List<Employee> getEmployees();
	Employee getEmployeeById(int empcode);
	int updateEmployee(int code,String empname,String job,String doj,double salary,int deptName);
	double getSalary(int code);
	int deleteEmployee(int code);

}
