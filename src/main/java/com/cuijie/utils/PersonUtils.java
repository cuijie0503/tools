package com.cuijie.utils;

import java.util.Calendar;
import java.util.Date;

public class PersonUtils {
	
	public static Date randomDate (Date startDate) {
		
		Calendar c = Calendar.getInstance();
		long endDate = c.getTimeInMillis();
		c.setTime(startDate);
		long startDat = c.getTimeInMillis();
		
		long x=(long)(Math.random()*(endDate-startDat+1))+startDat;
		c.setTimeInMillis(x);
		return c.getTime();
		
		
		
		
	}
	
	
}	
