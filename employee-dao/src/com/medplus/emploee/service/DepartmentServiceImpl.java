package com.medplus.emploee.service;

import java.util.List;

import com.medplus.employee.beans.Department;
import com.medplus.employee.dao.DepartmentDao;
import com.medplus.employee.dao.DepartmentDaoImpl;


public class DepartmentServiceImpl implements DepartmentService {
	DepartmentDao dao=new DepartmentDaoImpl();
	public int addDepartment(Department department) {
		
		DepartmentDao dao=new DepartmentDaoImpl();
		// TODO Auto-generated method stub
		int rows=dao.addDepartment(department);
		return rows;
	}

	@Override
	public List<Department> getDepartmentById() {
		// TODO Auto-generated method stub
		return dao.getDepartmentById();
	}

	@Override
	public int updateDepartment() {
		// TODO Auto-generated method stub
		return dao.updateDepartment();
	}

	@Override
	public int shiftLocation(String location, String remarks, int deptno) {
		DepartmentDao dao=new DepartmentDaoImpl();
		// TODO Auto-generated method stub
		int rows=dao.shiftLocation(location, remarks, deptno);
		return rows;
		
	}

	@Override
	public List<String> getDepartmentsName() {
		// TODO Auto-generated method stub
		return dao.getDepartmentsName();
	}

}
