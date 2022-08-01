package basics;

public class LocalVariableEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		{
			//int a=20; a is declared already so it is not possible to declare again
			System.out.println("value of a is:"+a);
		}
		System.out.println("value of b is:"+a);
		//here b is availbale to the scope only

	}

}
