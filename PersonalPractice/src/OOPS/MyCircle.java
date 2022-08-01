package OOPS;

public class MyCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircleClass CircleOne=new CircleClass();
		CircleClass CircleTwo=new CircleClass();
		CircleOne.radius=7;
		CircleTwo.radius=14;
		System.out.println(CircleOne.Area());
		System.out.println(CircleOne.Circumference());
		System.out.println(CircleOne.Perimeter());
		
		System.out.println(CircleTwo.Area());
		System.out.println(CircleTwo.Circumference());
		System.out.println(CircleTwo.Perimeter());


	}

}
