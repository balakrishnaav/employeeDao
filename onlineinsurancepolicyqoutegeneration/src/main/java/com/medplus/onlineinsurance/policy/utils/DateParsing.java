package com.medplus.onlineinsurance.policy.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;

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
