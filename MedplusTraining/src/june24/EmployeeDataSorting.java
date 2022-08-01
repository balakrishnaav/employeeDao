package june24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//import june23.Employee;

public class EmployeeDataSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> empls=new ArrayList<Employee>();
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		
		for (int i=0;i<2;i++) {
			System.out.println("Enter Details of Employee");
			empls.add(new Employee(sc.nextInt(), sc.next(), sc.nextInt()));
		}
		
		/*for(Employee emp:empls)
			System.out.println(emp.getRegNo()+" "+emp.getName()+" "+emp.getSalary());
			
*/
		
		
	Collections.sort(empls,new SortByCode());
	empls.forEach((emp)->System.out.println(
			emp.getRegNo()+" "+emp.getName()+" "+emp.getSalary()));

	}

}
