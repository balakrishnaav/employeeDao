package june21;

public class Sample implements One,Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sample=new Sample();
		sample.Thirdone();
		sample.methodOne();

	}

	@Override
	public void Thirdone() {
		// TODO Auto-generated method stub
		System.out.println("thirOne()");
		
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("firstOne()");
	}

}
