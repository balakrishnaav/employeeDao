package june23;

public class Student {
	private int regno;
	private String studentName;
	private String group;
	private int sub1;
	private int sub2;
	private int sub3;
	public Student(int regno, String studentName, String group, int sub1, int sub2, int sub3) {
		
		this.regno = regno;
		this.studentName = studentName;
		this.group = group;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public void displayDetails() {
		System.out.println("Name : "+this.studentName);
		System.out.println("Branch : "+this.group);
		float average=(sub1+sub2+sub3)/3;
		if (sub1>40 && sub2>=40 && sub3>=40 ) {
			if (average>60)
				System.out.println("First");
			else if (average>40)
				System.out.println("Second");
			else
				System.out.println("Third");
			
		}else {
			System.out.println("FAIL");
		}

	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	

}
