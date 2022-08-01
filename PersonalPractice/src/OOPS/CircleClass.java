package OOPS;

public class CircleClass {
	
	public double radius;
	
	public double Area() {
		return Math.PI*radius*radius;
	}
	
	public double Perimeter(){
		return Math.PI*2*radius;
	}
	public double Circumference() {
		return Perimeter();
	}

}
