package june21;

public abstract class ClassA {
	int x;
	public ClassA() {
		x=100;
		
	}
	
	void display() {
		System.out.println("this is concrete method()");
	}
	abstract void output();

}
