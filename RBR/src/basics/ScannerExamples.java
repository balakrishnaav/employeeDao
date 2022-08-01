package basics;

import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter roll number :");
		int rollNo=sc.nextInt();
		System.out.println("Enter name :");
		String  name=sc.next();
		System.out.println("Enter Fee :");
		Double fee=sc.nextDouble();
		System.out.println("name: "+" "+name+","+"rollnumber: "+rollNo+""+"Fee: "+fee+".");
		sc.close();


		

	}

}
