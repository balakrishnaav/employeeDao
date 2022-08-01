package com.medplus.employee.beans;

public class Department {
	private int deptno;
	private String deptname;
	private String location;
	private String remarks;
	
	public Department() {
		
	}

	public Department(int deptno, String deptname, String location, String remarks) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.location = location;
		this.remarks = remarks;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", deptname=" + deptname + ", location=" + location + ", remarks="
				+ remarks + "]";
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
