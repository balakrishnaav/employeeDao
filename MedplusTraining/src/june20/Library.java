package june20;

public class Library extends Student {
	


	private int booksIssued;
	private int booksReturned;
	

	


	public Library(int regNo, String stdname, String branch,int booksIssued,int booksReturned) {
		super(regNo, stdname, branch);
		// TODO Auto-generated constructor stub
		this.booksIssued=booksIssued;
		this.booksReturned=booksReturned;
	}
	public void  displayDetails() {
		int remainingBooks=booksIssued-booksReturned;
		System.out.println(regNo+" "+stdname+" "+branch+" "+"BooksDue "+remainingBooks);
		
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library studentLibrary=new Library(112, "Balakrishna", "ECE", 10, 6);
		
		studentLibrary.displayDetails();
		

	}

}
