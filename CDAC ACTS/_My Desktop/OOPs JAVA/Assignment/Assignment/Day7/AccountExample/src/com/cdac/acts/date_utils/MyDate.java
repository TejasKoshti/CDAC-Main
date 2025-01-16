package com.cdac.acts.date_utils;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MyDate {
	private static final String FORMAT = "dd/MM/yyyy";
	
	private MyDate() {
	}
	
	public static String setDateFormat(Date date) {
		if ( date == null ) {
			return null;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		return sdf.format(date);
	}
	
	public static Date getDate(String str) throws ParseException  {
		if ( str == null || str.length() == 0 ) {
			return null;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		Date date = sdf.parse(str);
		return date;
	}
}
