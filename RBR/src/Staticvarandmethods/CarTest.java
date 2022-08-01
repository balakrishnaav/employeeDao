package Staticvarandmethods;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		Car.count++;
		Car car2=new Car();
		Car.count++;
		Car car3=new Car();
		Car.count++;
		car1.brand="Benz";
		car2.brand="Audi";
		car3.brand="Tata";
		System.out.println("Number of cars : "+Car.count);
		System.out.println(car1 instanceof Car);
		

	}

}
