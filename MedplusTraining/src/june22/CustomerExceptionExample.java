package june22; 

class SampleException extends Exception{
	public SampleException() {
		super("this is a sample custom exception");
	}
}

public class CustomerExceptionExample {

	public static void main(String[] args) {
		int empcode=501;
		int code=Integer.parseInt(args[0]);
		//SampleException sample=new SampleException();
		try {
			if(code !=empcode)
				throw new SampleException();//throw sample;
			System.out.println("employee exists...");
		}catch(SampleException e) {
			e.printStackTrace();
		}
		System.out.println("completed...");
	}

}
