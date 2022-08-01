package june23;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> students=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		
		students.add( new Student(101,"balakrishna","ECE",50,60,40));
		students.add( new Student(102,"krishna","ECE",60,50,30));
		students.add( new Student(103,"bala","ECE",55,64,46));
		
		int choice=0;
		do {
		System.out.println("Enter registration number:");

		int regnumber=sc.nextInt();
		students.forEach((student)->{
			if(student.getRegno()==regnumber) {
				student.displayDetails();			}
		});
		System.out.println("if you want to continue press 1:" );
		choice=sc.nextInt();
		}while(choice==1);
	}

}
