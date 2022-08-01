package com.medplus.employee.dao;

import java.util.List;

import com.medplus.employee.beans.Department;


public interface DepartmentDao {
	int addDepartment(Department department);
	List<Department> getDepartmentById();
	int updateDepartment();
	int shiftLocation(String location,String remarks,int deptno);
	List<String> getDepartmentsName();
}
