package methodoverriding;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Animal();
		animal.eat();
		Horse horse=new Horse();
		horse.eat();
		Animal ah=new Horse();
		ah.eat();
		Horse he=new Horse();
		he.eat("apples");
		Animal a2=new Animal();
		//a2.eat("Grass"); this method is not avilable so compile time error
		Animal ah2=new Horse();
		//ah.eat("carrots");this method is not avilable so compile time error
	}

}
