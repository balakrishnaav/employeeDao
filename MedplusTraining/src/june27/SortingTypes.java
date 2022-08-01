package june27;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList=new ArrayList<Product>();
		productsList.add(new Product(1,"HP Laptop",25000));
		productsList.add(new Product(2,"Dell Laptop",30000));
		productsList.add(new Product(3,"Lenovo Laptop",28000));
		productsList.add(new Product(4,"Sony Laptop",27000));
		productsList.add(new Product(5,"Apple Laptop",90000));
		
		/*Collections.sort(productsList,(p1,p2)->{
			return p1.getName().compareTo(p2.getName());
		});*/
		
		List<Product> sortedList=productsList.stream().sorted((p1,p2)->{
			return p1.getName().compareTo(p2.getName());
		}).collect(Collectors.toList());
		
		for(Product p : sortedList)
			System.out.println(p);

	}

}
