package com.medplus.employee.beans;

public class Employee {
	private int empcode;
	private String empname;
	private String job;
	private String doj;
	private Double salary;
	public Employee() {
		
	}
	public Employee(int empcode, String empname, String job, String doj, Double salary) {
		super();
		this.empcode = empcode;
		this.empname = empname;
		this.job = job;
		this.doj = doj;
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empcode=" + empcode + ", empname=" + empname + ", job=" + job + ", doj=" + doj + ", salary="
				+ salary + "]";
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



	

}
