package basics;

public class BitWiseLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,f;
		a=42;
		b=13;
		c=a&b;
		d=a|b;
		e=a^b;
		f=~a;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("Bitwise AND of a,b = "+c);
		System.out.println("Bitwise OR of a,b = "+d);
		System.out.println("Bitwise XOR of a,b = "+e);
		System.out.println("Bitwise NOT of a = "+f);

	}

}
