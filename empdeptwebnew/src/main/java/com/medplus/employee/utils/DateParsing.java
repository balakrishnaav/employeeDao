package com.medplus.employee.utils;

import java.text.SimpleDateFormat;



import java.sql.Date;

public class DateParsing {
	public static Date getSqlDate(String doj) {
		Date sqldate=null;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
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
