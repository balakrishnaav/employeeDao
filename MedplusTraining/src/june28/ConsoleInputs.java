package june28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter Details:");
		int code=Integer.parseInt(br.readLine());
		String name=br.readLine();
		double salary=Double.parseDouble(br.readLine());
		System.out.println(code+" "+name+" "+salary);
	
	}

}
