package day7;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet items = new HashSet();
		items.add(100);
		items.add("java");
		items.add("medplus");
		items.add("hyd");
		items.add("java");
		items.add(null); 
		System.out.println(items);  
	}
}
