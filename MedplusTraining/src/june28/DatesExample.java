package june28;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DatesExample {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date dt=new Date();//current date
		System.out.println("current date "+dt);
		
		String dob="27/06/2022";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");//we can specify the format
		Date db =sdf.parse(dob);
		System.out.println("DOB= "+db);
		
		String str="2022-04-19";//it has to be "yyyy-MM-dd"
		LocalDate strdate=LocalDate.parse(str);
		System.out.println("LocalDate = "+strdate);
		
	}

}
