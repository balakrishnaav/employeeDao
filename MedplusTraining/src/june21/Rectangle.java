package june21;

public class Rectangle extends Shape {

	public Rectangle(float length, float breadth) {
		super(length, breadth);
	
	}
	
	public float findArea() {
		float Area=length*breadth;
		return Area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle=new Rectangle(10, 5);
		float result =rectangle.findArea();
		System.out.println(result);

	}

}
