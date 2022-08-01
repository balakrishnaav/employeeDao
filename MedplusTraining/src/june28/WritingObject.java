package june28;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		FileOutputStream fos= new FileOutputStream("F:\\medplusTraining\\object.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		CardInfo card1=new CardInfo(1234567899874215L,10,25,23,"medplus");
		CardInfo card2=new CardInfo(1234567988974215L,10,25,23,"balu");
		oos.writeObject(card1);
		oos.writeObject(card2);
		oos.close();
		System.out.println("created");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
