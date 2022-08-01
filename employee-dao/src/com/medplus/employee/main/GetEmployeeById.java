package com.medplus.employee.main;

import java.util.Scanner;

import com.medplus.emploee.service.EmployeeService;
import com.medplus.emploee.service.EmployeeServiceImpl;
import com.medplus.employee.beans.Employee;

public class GetEmployeeById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmployeeCode");
		int empcode=sc.nextInt();
		Employee empls=new Employee();
		empls=service.getEmployeeById(empcode);
		
		System.out.println(empls);
		sc.close();

	}

}
