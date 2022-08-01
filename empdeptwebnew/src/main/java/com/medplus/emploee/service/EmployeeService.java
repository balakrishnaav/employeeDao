package com.medplus.emploee.service;

import java.util.List;
import java.util.Map;

import com.medplus.employee.beans.Employee;

public interface EmployeeService {
	int addEmployee(Employee employee);
	List<Employee> getEmployees();
	Employee getEmployeeById(int empcode);
	int updateEmployee(int code,String empname,String job,String doj,double salary,int deptName);
	int deleteEmployeeByCode(int code);
	Map<String,Double> calculate(int code);
	
}
