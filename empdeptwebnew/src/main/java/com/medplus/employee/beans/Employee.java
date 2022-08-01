package com.medplus.employee.beans;

public class Employee {
	private int empcode;
	private String empname;
	private String job;
	private String doj;
	private Double salary;
	private int deptName;
	
	
	public Employee(int empcode, String empname, String job, String doj, Double salary, int deptName) {
		super();
		this.empcode = empcode;
		this.empname = empname;
		this.job = job;
		this.doj = doj;
		this.salary = salary;
		this.deptName = deptName;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public int getDeptName() {
		return deptName;
	}
	public void setDeptName(int deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Employee [empcode=" + empcode + ", empname=" + empname + ", job=" + job + ", doj=" + doj + ", salary="
				+ salary + ", deptName=" + deptName + "]";
	}
	
}
