package chapter_13;

import java.util.Calendar;
import java.util.Date;

public class dateTime {

	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());  // MilliSeconds
		System.out.println(System.currentTimeMillis()/1000); // Seconds
		System.out.println(System.currentTimeMillis()/1000/3600); // minutes
		System.out.println(System.currentTimeMillis()/1000/3600/24); // Days
		System.out.println(System.currentTimeMillis()/1000/3600/24/365); 
		
		System.out.println();
		
		Date d = new Date();
		System.out.println(d);
		
		System.out.println();
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getCalendarType());
		System.out.println(c.getTimeZone());
		
	}

}
