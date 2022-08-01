package june21;

public abstract class Shape {
	protected float length;
	protected float breadth;
	protected float radius;
	
	
	public Shape(float length,float breadth) {
		
		this.breadth=breadth;
		this.length=length;
		
		
	}
public Shape(float radius) {
		this.radius=radius;
		
	}
abstract float findArea();

}
