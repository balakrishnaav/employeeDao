package june23;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {

	public static void main(String[] args) {
		ArrayList<Employee> empls=new ArrayList<Employee>();
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		
		for (int i=0;i<3;i++) {
			System.out.println("Enter Details of Employee");
			empls.add(new Employee(sc.nextInt(), sc.next(), sc.nextInt()));
		}
		
		/*for(Employee emp:empls)
			System.out.println(emp.getRegNo()+" "+emp.getName()+" "+emp.getSalary());
			
*/
		empls.forEach((emp)->System.out.println(
				emp.getRegNo()+" "+emp.getName()+" "+emp.getSalary()));
	}

}
