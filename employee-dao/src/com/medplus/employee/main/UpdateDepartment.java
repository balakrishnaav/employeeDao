package com.medplus.employee.main;

import com.medplus.emploee.service.DepartmentService;
import com.medplus.emploee.service.DepartmentServiceImpl;

public class UpdateDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentService service=new DepartmentServiceImpl();
	
		int rows =service.updateDepartment();
		if(rows>0)
			System.out.println("inserted");
		else
			System.out.println("not inserted");
		

	}

}
