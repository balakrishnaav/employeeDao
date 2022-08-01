package june21;

public class Circle extends Shape {
	

	public Circle(float radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}
	
	public float findArea() {
		float Area=(float)3.14*radius*radius;
		return Area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle(10);
		float result =circle.findArea();
		System.out.println(result);

	}

}
