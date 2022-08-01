package june20;

public class PlacementInfo extends Examination {
	
	private int attendedCompanies;
	private int selectedCompanies;
	
	
	
	public PlacementInfo(int regNo, String stdname, String branch, int s1, int s2, int s3,int attendedCompanies,int selectedCompanies) {
		super(regNo, stdname, branch, s1, s2, s3);
		this.attendedCompanies=attendedCompanies;
		this.selectedCompanies=selectedCompanies;
		
		
		// TODO Auto-generated constructor stub
	}

	public void getDetails() {
		
		System.out.println(regNo+" "+stdname+" "+branch+" attended "+attendedCompanies+" selectedcompanies "+selectedCompanies);
		
	}
	
	public void getAverage() {
		float average=(s1+s2+s3)/3;
		System.out.println(average);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlacementInfo studentPlacement=new PlacementInfo(111,"Balakrishna","ECE",50,50,50,10,5);
		studentPlacement.getDetails();
		studentPlacement.getAverage();
		studentPlacement.findGrades();

	}

}
