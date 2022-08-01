package com.medplus.employee.main;

import java.util.Scanner;

import com.medplus.emploee.service.DepartmentService;
import com.medplus.emploee.service.DepartmentServiceImpl;
import com.medplus.employee.beans.Department;

public class AddDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentService service=new DepartmentServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department Values");
		Department emp=new Department(sc.nextInt(), sc.next(), sc.next(), sc.next());
		int rows =service.addDepartment(emp);
		if(rows>0)
			System.out.println("inserted");
		else
			System.out.println("not inserted");
		sc.close();

	}

}
