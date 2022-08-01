package june23;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList items=new ArrayList();
		items.add("medplus");
		items.add(5000);
		items.add(56.44);
		items.add("hyd");
		items.add("k");
		items.add(null);
		items.add("hyd");
		System.out.println(items+" "+items.size());
		items.add(2,"RRR");
		System.out.println(items+" "+items.size());	
		items.remove(Integer.valueOf(5000));
		System.out.println(items+" "+items.size());
		ListIterator itr=items.listIterator();
		while(itr.hasNext()) {
			Object a=i.next();

			System.out.println(Integer.TYPE(itr.next()));
	}}

}
