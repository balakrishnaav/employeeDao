package june24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String,Integer>phoneBook=new HashMap<String,Integer>();
		phoneBook.put("balu", 255454);
		phoneBook.put("sai", 5559559);
		phoneBook.put("jnsdjn",846484);
		System.out.println(phoneBook);
		System.out.println(phoneBook.get("sai"));
		Set<Entry<String,Integer>>set=phoneBook.entrySet();
		Iterator<Entry<String,Integer>>itr=set.iterator();
		while(itr.hasNext()) {
			Entry<String,Integer>entry=itr.next();
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
		
		

	}

}
