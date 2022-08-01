package june21;

public class ArimthmeticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic arth=(x,y)->{
			System.out.println("this is add method "+(x+y));
			return x+y;
		};
		
	int r=arth.add(5, 6);
	System.out.println(r);
	arth.display();
	ArimthmeticApp app=new ArimthmeticApp();
	app.display();
	Arithmetic.output();
	

	}

	 void display() {
		// TODO Auto-generated method stub
		 System.out.println("this method is overridden");
		
	}

}
