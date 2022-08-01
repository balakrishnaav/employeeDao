package june20;

public class Student {
	protected int regNo;
	protected String stdname;
	protected String branch;
	
	public  Student(int regNo,String stdname,String branch) {
		this.regNo=regNo;
		this.stdname=stdname;
		this.branch=branch;
	}
	public void display() {
		System.out.println(regNo+stdname+branch);
	}

}
