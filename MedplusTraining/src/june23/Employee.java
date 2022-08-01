package june23;

public class Employee {
	private int regNo;
	private String name;
	private int salary;
	public int getRegNo() {
		return regNo;
	}
	public Employee(int regNo, String name, int salary) {
		
		this.regNo = regNo;
		this.name = name;
		this.salary = salary;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
