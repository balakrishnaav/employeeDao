package com.medplus.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.medplus.employee.beans.Department;
import com.medplus.employee.utils.DBConnection;

import com.medplus.employee.utils.EmploeeDBQueries;

public class DepartmentDaoImpl implements DepartmentDao{
	private Connection conn;
	private PreparedStatement pst;
	ResultSet rs;
	@Override
	public int addDepartment(Department department) {
		// TODO Auto-generated method stub
		conn=DBConnection.open();
		int rows=0;
		try {
			pst=conn.prepareStatement(EmploeeDBQueries.ADDDEPARTMENT);
			pst.setInt(1, department.getDeptno());
			pst.setString(2, department.getDeptname());
			pst.setString(3, department.getLocation());
			pst.setString(4, department.getRemarks());
			
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
	public List<Department> getDepartmentById() {
		// TODO Auto-generated method stub
		conn=DBConnection.open();
		List<Department> dptList=new ArrayList<Department>();
		try {
			pst=conn.prepareStatement(EmploeeDBQueries.GETDEPTS);
			rs = pst.executeQuery();
			while(rs.next()) {
				Department dpt=new Department();
				dpt.setDeptno(rs.getInt(1));
				dpt.setDeptname(rs.getString(2));
				dpt.setLocation(rs.getString(3));
				dpt.setRemarks(rs.getString(4));
				dptList.add(dpt);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close();
		}
		return dptList;
		
	}
	@Override
	public int updateDepartment() {
		// TODO Auto-generated method stub
		conn=DBConnection.open();
		int rows=0;
		try {
			pst=conn.prepareStatement(EmploeeDBQueries.UPDATEDEPTS);
		
			
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
	public int shiftLocation(String location, String remarks, int deptno) {
		// TODO Auto-generated method stub
		conn=DBConnection.open();
		int rows=0;
		try {
			pst=conn.prepareStatement(EmploeeDBQueries.SHIFTLOCATION);
			pst.setString(1, location);
			pst.setString(2, remarks);
			pst.setInt(3, deptno);
			
			
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
	public List<String> getDepartmentsName() {
		// TODO Auto-generated method stub
		conn=DBConnection.open();
		List<String> dptnamesList=new ArrayList<String>();
		try {
			pst=conn.prepareStatement(EmploeeDBQueries.GETDEPTS);
			rs = pst.executeQuery();
			while(rs.next()) {
				dptnamesList.add(rs.getString(2));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close();
		}
		return dptnamesList;
	}

}
