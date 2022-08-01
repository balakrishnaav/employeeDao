package com.medplus.emploee.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.medplus.employee.beans.Employee;
import com.medplus.employee.dao.EmployeeDao;
import com.medplus.employee.dao.EmployeeDaoImpl;

class EmployeeDaoTest {
	EmployeeDao dao=new EmployeeDaoImpl();

	@Test
	public void testAddEmployee() {
		Employee empl=new Employee(301,"medplus","trainer","15-04-2021",6000.0);
		assertEquals(1,dao.addEmployee(empl));
	}
	@Test
	public void testGetEmployeeByCode() {
		Employee empl=dao.getEmployeeById(101);
		assertNotNull(empl);
	}

}
