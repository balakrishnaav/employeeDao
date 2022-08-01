package june28;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("F:\\medplusTraining\\object.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object obj;
			while((obj=ois.readObject())!=null) {
				CardInfo card=(CardInfo) obj;
				System.out.println(card);
			}
			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("reached end");
		}
		

	}

}
