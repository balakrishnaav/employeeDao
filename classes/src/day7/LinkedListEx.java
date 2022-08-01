package day7;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("java");
		list.add("spring");
		list.add("hyd");
		System.out.println(list);  
		list.add("mysql");
		list.add(1, "oracle");
		list.addFirst("bangalore");
		list.addLast("chennai"); 
		System.out.println(list);  
		ListIterator<String> itr = list.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}
}
