package june21;

import june21.Library;
import june21.Student;

public class Library extends Student {
	


	private int booksDue;
	
	

	


	public Library() {
		super(444, "aaa", "ECE");
		booksDue=5;
		
	}
	public void  display() {
		
		System.out.println("from sub class");
		
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1=new Library();
		std1.display();
		

	}

}
