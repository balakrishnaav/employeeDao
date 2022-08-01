package day7;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<>(); 
		data.add("abcd");
		data.add("java");
		data.add("xyz");
		data.add(null);
		System.out.println(data); 
		for(String i : data) {
			System.out.println(i.hashCode());  
		}
	}

}
