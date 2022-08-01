package com.medplus.employee.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.medplus.emploee.service.DepartmentService;
import com.medplus.emploee.service.DepartmentServiceImpl;
import com.medplus.employee.beans.Department;

public class GetDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentService service=new DepartmentServiceImpl();
		Scanner sc=new Scanner(System.in);
		
		
		List<Department> empls=new ArrayList<Department>();
		empls=service.getDepartmentById();
		
		empls.forEach((item)->System.out.println(item));
		sc.close();


	}

}
