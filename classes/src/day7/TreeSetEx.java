package day7;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<String> items = new TreeSet<String>();
		items.add("100");
		items.add("java");
		items.add("medplus");
		items.add("hyd");
		items.add("java");
		System.out.println(items);  
		
		TreeSet<Employee> empls = new TreeSet<Employee>();
		empls.add(new Employee(101, "medplus", 5000));
		empls.add(new Employee(201, "james gosling", 8000));
		empls.add(new Employee(303, "rod Johnson", 9000));
		for(Employee emp : empls)
			System.out.println(emp.getEmpcode()+emp.getEmpname()+emp.getSalary());  
	}
}
