package june28;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos=new FileOutputStream("F:\\medplusTraining\\sample.text");
			for(int i=65;i<=90;i++)
				fos.write(i);
			fos.close();
			System.out.println("created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
