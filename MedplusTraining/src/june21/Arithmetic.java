package june21;

public interface Arithmetic {
	
	int add(int x,int y);
	default void display() {
	System.out.println("this is display method");
	}
	static void output() {
		System.out.println("this is output method");
		}
}
