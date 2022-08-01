package june20;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp[]=new Employee[3];
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<3;i++) {
			System.out.println("enter code name");
			emp[i]=new Employee();
			emp[i].setCode(sc.nextInt());
			emp[i].setName(sc.next());
		}
		for (int i=0;i<3;i++)
			System.out.println(emp[i].getCode()+" "+emp[i].getName());
		sc.close();
	}

}
