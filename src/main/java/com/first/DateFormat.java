package com.first;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yyyy");
		String sd1 = sd.format(d);
		System.out.println(sd1);
		
	}

}
