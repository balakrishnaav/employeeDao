package com.medplus.emploee.service;

import java.util.List;
import java.util.Map;

import com.medplus.employee.beans.Employee;

public interface EmployeeService {
	int addEmployee(Employee employee);
	List<Employee> getEmployees();
	Employee getEmployeeById(int empcode);
	int updateEmployee(String string);
	Map<String,Double> calculate(int code);
	
}
