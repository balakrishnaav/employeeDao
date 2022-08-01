package june23;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> data =new ArrayList<>();
		data.add(456);
		data.add(56);
		data.add(400);
		data.add(null);
		System.out.println(data);
		for(Integer i : data)
			System.out.println(i);

	}

}
