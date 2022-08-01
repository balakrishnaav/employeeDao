package june21;

public class ClassB extends ClassA{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a=new ClassB();
		a.display();
		a.output();
	}
	
	@Override
	void output() {
		System.out.println("this is abstract method");
	}

}
