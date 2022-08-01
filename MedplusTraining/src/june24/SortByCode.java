package june24;

import java.util.Comparator;

public class SortByCode implements Comparator<Employee>{

	
	 public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getRegNo()-e2.getRegNo();
	}

}
