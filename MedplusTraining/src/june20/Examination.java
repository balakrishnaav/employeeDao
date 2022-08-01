package june20;

public class Examination extends Student {
	
	protected int s1;
	protected int s2;
	protected int s3;
	
	
	
	public Examination(int regNo, String stdname, String branch, int s1, int s2, int s3) {
		super(regNo, stdname, branch);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}



	void findResult() {
		int total=s1+s2+s3;
		System.out.println(regNo+stdname+branch+total);
	}
	
	public void Result() {
		if (s1>40 && s2>=40 && s3>=40 ) {
			System.out.println("PASSED");
		}else {
			System.out.println("FAIL");
		}
	}
	
	public void findGrades() {
		float average=(s1+s2+s3)/3;
		if (s1>40 && s2>=40 && s3>=40 ) {
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examination ex=new Examination(10, "Medplus", "Ece", 50, 70, 70);
		ex.findResult();
		ex.Result();
		ex.findGrades();

	}

}
