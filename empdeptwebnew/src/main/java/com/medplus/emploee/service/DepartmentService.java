package com.medplus.emploee.service;

import java.util.List;

import com.medplus.employee.beans.Department;

public interface DepartmentService {
	int addDepartment(Department department);
	List<Department> getDepartmentById();
	int updateDepartment();
	int shiftLocation(String location,String remarks,int deptno);
	List<String> getDepartmentsName();
}
