package com.medplus.employee.main;

import java.util.Scanner;

import com.medplus.emploee.service.DepartmentService;
import com.medplus.emploee.service.DepartmentServiceImpl;

public class ShiftLocations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentService service=new DepartmentServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department Values");
		String location=sc.next();
		String remarks=sc.next();
		Integer deptno=sc.nextInt();
		int rows =service.shiftLocation(location,remarks,deptno);
		if(rows>0)
			System.out.println("department updated");
		else
			System.out.println("not inserted");
		sc.close();

	}

}
