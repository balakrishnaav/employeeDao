package OOPS;

public class Rectangle {
	protected double length;
	protected double breadth;
	
	public double area() {
		return length*breadth ;
	}
	public double perimeter() {
		return 2*(length+breadth) ;
	}
	public boolean isSquare() {
		return length==breadth;
	}
	public String toString() {
		return "Area:"+area()+"\n"+"Perimeter: "+perimeter();
	}

}
