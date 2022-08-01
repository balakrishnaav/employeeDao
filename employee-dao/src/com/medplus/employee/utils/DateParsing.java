package com.medplus.employee.utils;

import java.text.SimpleDateFormat;



import java.sql.Date;

public class DateParsing {
	public static Date getSqlDate(String doj) {
		Date sqldate=null;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date utilDate;
		try {
			utilDate = sdf.parse(doj);
			sqldate=new Date(utilDate.getTime());
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sqldate;
		
	}

}
