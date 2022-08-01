package june28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileInputStream fis=new FileInputStream("F:\\medplusTraining\\sample.text");
			int c;
			FileOutputStream fos=new FileOutputStream("F:\\medplusTraining\\filecopy.text");

			
			while((c=fis.read())!=-1)
				fos.write(c);
			fos.close();
			fis.close();
			System.out.println("copy created");
		} catch (IOException e) {//
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
