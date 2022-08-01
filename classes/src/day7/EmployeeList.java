package day7;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {
	public static void main(String[] args) {
		ArrayList<Employee> empls = new ArrayList<Employee>();
		empls.add(new Employee(101, "Medplus", 5000));
		empls.add(new Employee(501, "James gosling", 8000));
		empls.add(new Employee(303, "Rod Johnson", 9000));
		Collections.sort(empls); 
		empls.forEach((emp)->System.out.println(
				emp.getEmpcode()+" "+emp.getEmpname()+" "+emp.getSalary()));
 	}

}
