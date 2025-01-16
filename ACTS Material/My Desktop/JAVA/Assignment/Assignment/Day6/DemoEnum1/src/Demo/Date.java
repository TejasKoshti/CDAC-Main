package Demo;

import java.text.SimpleDateFormat;

public class Date {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		final String FORMAT = "dd/MM/yyyy";
		
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		String formattedString = sdf.format(date);
		System.out.println(formattedString);
		
	}
	
	public static String getFormattedDate(Date date)
	{
		if(null == date) {
			return null;
		}
		return null;
	}
//	public static String getDate(String strDate) 
//	{
//		if ( null == strDate || EMPTY.equals(strDate)) {
//			return null;
//		}
//		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
//		Date date = sdf.parse(strDate);
//		return date;
//	}

}
