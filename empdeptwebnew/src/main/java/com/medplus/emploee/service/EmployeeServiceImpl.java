package com.medplus.emploee.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.medplus.emploee.exception.EmployeeNotFoundException;
import com.medplus.employee.beans.Employee;
import com.medplus.employee.dao.EmployeeDao;
import com.medplus.employee.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao dao=new EmployeeDaoImpl();

	@Override
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		int rows=dao.addEmployee(employee);
		return rows;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return dao.getEmployees();
	}

	@Override
	public Employee getEmployeeById(int empcode) {
		// TODO Auto-generated method stub
		Employee result=new Employee();
		try {
			 result=dao.getEmployeeById(empcode);
			 return result;
			
		}catch(EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return result;
		
		}

	

	@Override
	public Map<String, Double> calculate(int code) {
		// TODO Auto-generated method st
		double salary=dao.getSalary(code);
		Map<String,Double> paySlip=new HashMap<String,Double>();
		paySlip.put("Basic Pay",(salary)*(60/100.0));
		paySlip.put("HRA",(salary)*(30/100.0));
		paySlip.put("Net Pay",(salary)*(30/100.0)+(salary)*(60/100.0));
		paySlip.put("GMIP",(salary)*(5/100.0));
		paySlip.put("Gratuity",(salary)*(3/100.0));
		paySlip.put("ProfessionalTax",(salary)*(2/100.0));
		return paySlip;
	}

	@Override
	public int deleteEmployeeByCode(int code) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(code);
	}
	@Override
	public int updateEmployee(int code, String empname, String job, String doj, double salary,int deptName) {
		// TODO Auto-generated method stub
		int rows=dao.updateEmployee(code,empname,job,doj,salary,deptName);
		return rows;
	}

	
	

}
