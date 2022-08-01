package com.medplus.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.medplus.emploee.exception.EmployeeNotFoundException;
import com.medplus.employee.beans.Employee;
import com.medplus.employee.utils.DBConnection;
import com.medplus.employee.utils.DateParsing;
import com.medplus.employee.utils.EmploeeDBQueries;

public class EmployeeDaoImpl implements EmployeeDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;

	@Override
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		conn=DBConnection.open();
		int rows=0;
		try {
			pst=conn.prepareStatement(EmploeeDBQueries.ADDEMPL);
			pst.setInt(1, employee.getEmpcode());
			pst.setString(2, employee.getEmpname());
			pst.setString(3, employee.getJob());
			pst.setDate(4, DateParsing.getSqlDate(employee.getDoj()));
			pst.setDouble(5, employee.getSalary());
			pst.setInt(6, employee.getDeptName());
			rows=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBConnection.close();
		}
		
		return rows;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		conn=DBConnection.open();
		List<Employee> empList=new ArrayList<Employee>();
		try {
			pst=conn.prepareStatement(EmploeeDBQueries.GETEMPL);
			rs=pst.executeQuery();
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setEmpcode(rs.getInt(1));
				emp.setEmpname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setDoj(rs.getDate(4).toString());
				emp.setSalary(rs.getDouble(5));
				empList.add(emp);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}finally {
			DBConnection.close();
		}
		
		return empList;
	}

	@Override
	public Employee getEmployeeById(int empcode) throws EmployeeNotFoundException{
		// TODO Auto-generated method stub
		conn=DBConnection.open();
		Employee emp=new Employee();
		
		try {
			pst=conn.prepareStatement(EmploeeDBQueries.GETEMPLBYCODE);
			pst.setInt(1, empcode);
			rs=pst.executeQuery();
			if(!rs.next())
				throw new EmployeeNotFoundException();
			
				
			emp.setEmpcode(rs.getInt(1));
			emp.setEmpname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setDoj(rs.getDate(4).toString());
			emp.setSalary(rs.getDouble(5));
			emp.setDeptName(rs.getInt(6));
				
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}finally {
			DBConnection.close();
		}
		
		return emp;
	}

	@Override
	public int updateEmployee(int code,String empname,String job,String doj,double salary,int deptName) {
		conn = DBConnection.open();
		int rows=0;
		try {
			pst=conn.prepareStatement(EmploeeDBQueries.UPDATEEMPL);
			pst.setInt(5, code);
			pst.setString(1, empname);
			pst.setString(2, job);
			pst.setDate(3, DateParsing.getSqlDate(doj));
			pst.setDouble(4, salary);
			pst.setInt(6, deptName);
			rows=pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnection.close();
		}
		
		return rows;
	}

	@Override
	public double getSalary(int code) {
		// TODO Auto-generated method stub
		conn=DBConnection.open();
		try {
			pst=conn.prepareStatement(EmploeeDBQueries.GETEMPLSALABYCODE);
			pst.setInt(1, code);
			rs=pst.executeQuery();
			rs.next();
			return rs.getDouble(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteEmployee(int code) {
		// TODO Auto-generated method stub
		conn =DBConnection.open();
		int rows=0;
		try {
			pst=conn.prepareStatement(EmploeeDBQueries.DELETEEMPL);
			pst.setInt(1,code);
			rows=pst.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBConnection.close();
		}
		return rows;
	}
	

}
