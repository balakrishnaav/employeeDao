package com.medplus.employee.main;

import java.util.Scanner;

import com.medplus.emploee.service.EmployeeService;
import com.medplus.emploee.service.EmployeeServiceImpl;
import com.medplus.employee.beans.Employee;

public class AddEmployee {
	public static void main(String[] args) {
		EmployeeService service=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Values");
		Employee emp=new Employee(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextDouble());
		int rows =service.addEmployee(emp);
		if(rows>0)
			System.out.println("inserted");
		else
			System.out.println("not inserted");
		sc.close();
	}

}
