package com.medplus.employee.dao;

import java.util.List;
import com.medplus.employee.beans.Employee;

public interface EmployeeDao {
	int addEmployee(Employee employee);
	List<Employee> getEmployees();
	Employee getEmployeeById(int empcode);
	int updateEmployee(String job);
	double getSalary(int code);

}
