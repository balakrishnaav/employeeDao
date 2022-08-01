package basics;

public class LocalVariablesEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		{
			int b=20;
			System.out.println("value of a is:"+a);
		}
		//System.out.println("value of b is:"+b);
		//here b is availbale to the scope only

	}

}
