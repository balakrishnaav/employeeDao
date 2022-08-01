package com.medplus.employee.main;

import java.util.Scanner;

import com.medplus.emploee.service.EmployeeService;
import com.medplus.emploee.service.EmployeeServiceImpl;
import com.medplus.employee.beans.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Values");
		Employee emp=new Employee();
		int rows =service.updateEmployee(sc.next());
		if(rows>0)
			System.out.println("inserted");
		else
			System.out.println("not inserted");
		sc.close();
	}

}
