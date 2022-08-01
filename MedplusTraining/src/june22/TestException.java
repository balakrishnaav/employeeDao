package june22;

public class TestException {

	public static void main(String[] args) throws ClassNotFoundException{
		
		Class.forName("Employee");
		int arr[]= {1,2,3,4,5,6};
		int x=7;
		int y=0;
		try {
			
			int r=x/y;
			System.out.println("result = "+r);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			
		}
		System.out.println("completed");
	}

}
