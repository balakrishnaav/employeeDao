package com.medplus.employee.main;

import java.util.List;

import com.medplus.emploee.service.DepartmentService;
import com.medplus.emploee.service.DepartmentServiceImpl;

public class ListAllDeptNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentService service=new DepartmentServiceImpl();
		List<String> dpts=service.getDepartmentsName();
		dpts.forEach((dpt)->System.out.println(dpt));
		System.out.println(dpts);

	}

}
