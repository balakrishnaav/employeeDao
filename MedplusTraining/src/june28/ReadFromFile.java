package june28;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("F:\\medplusTraining\\sample.text");
			int c;
			
			while((c=fis.read())!=-1)
				System.out.println((char)c);
			fis.close();
		} catch (IOException e) {//
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
