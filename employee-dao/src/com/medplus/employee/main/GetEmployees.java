package com.medplus.employee.main;

import java.util.List;

import com.medplus.emploee.service.EmployeeService;
import com.medplus.emploee.service.EmployeeServiceImpl;
import com.medplus.employee.beans.Employee;

public class GetEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeServiceImpl();
		List<Employee> empls=service.getEmployees();
		empls.forEach((employee)->System.out.println(employee));

	}

}
