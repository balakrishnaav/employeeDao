package basics;

public class DataTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b;
		int i=81;
		double d=323.172;
		float f=72.38f;
		char c='A';
		c=(char)i;//explicit conversion int to char
		System.out.println("i = "+i+" c = "+c);
		i=(int)d;//explicit conversion double to int
		System.out.println("d = "+d+" i = "+i);
		i=(int)f;//explicit conversion float to int
		System.out.println("f = "+f+" i = "+i);
		b=(byte)d;//explicit conversion double to byte
		System.out.println("d = "+d+" b = "+b);
	    d=i;//implicit (Automatic) conversion int to double
		System.out.println("i = "+i+" d = "+d);
	}

}
