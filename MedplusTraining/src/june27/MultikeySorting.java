package june27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MultikeySorting {

	public static void main(String[] args) {
		List<Product> productsList=new ArrayList<Product>();
		productsList.add(new Product(1,"Lenovo Laptop",28000));
		productsList.add(new Product(2,"Dell Laptop",30000));
		productsList.add(new Product(3,"Lenovo Laptop",25000));
		productsList.add(new Product(4,"Sony Laptop",27000));
		productsList.add(new Product(5,"Apple Laptop",90000));	
		
		Comparator<Product> sortedKeys=
				Comparator.comparing(Product::getName)
				.thenComparing(Product::getProductId);
		
		List<Product> empSoortedList=productsList.stream()
				.sorted(sortedKeys)
				.collect(Collectors.toList());
		empSoortedList.forEach((e)->System.out.println(e));
		
	}

}
