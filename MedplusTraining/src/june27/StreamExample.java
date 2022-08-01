package june27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList=new ArrayList<Product>();
		productsList.add(new Product(1,"HP Laptop",25000));
		productsList.add(new Product(2,"Dell Laptop",30000));
		productsList.add(new Product(3,"Lenovo Laptop",28000));
		productsList.add(new Product(4,"Sony Laptop",27000));
		productsList.add(new Product(5,"Apple Laptop",90000));
		
		List<Product> plist2=productsList.stream()
				.filter((p)->p.getCost()>=30000)
				.map((p)->p)
				.collect(Collectors.toList());
		plist2.forEach((p)->System.out.println(p));
		
		List<Double> priceList=productsList.stream()
				.map((p)->p.getCost())
				.collect(Collectors.toList());
		System.out.println(priceList);
		System.out.println("max price "+Collections.max(priceList));
		System.out.println("min price "+Collections.min(priceList));
		
	}

}
