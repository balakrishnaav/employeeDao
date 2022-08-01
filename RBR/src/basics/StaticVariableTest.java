package basics;

public class StaticVariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StaticVariable sv1=new StaticVariable();
	      StaticVariable sv2=new StaticVariable();
	      
	      System.out.println(StaticVariable.count);
	      sv1.increment();
	      sv2.increment();
	     
	      System.out.println(sv1.count);
	      System.out.println(sv2.count);
	      System.out.println(StaticVariable.count);

	}

}
