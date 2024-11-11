package com.psl.training.datepackage;
import java.util.Date;
import java.util.Calendar;
public class DateMethods {

	public static void main(String[] args) {
		Date date=new Date();	//we have to import date class
		System.out.println(date);
		
		Calendar c = Calendar.getInstance();
		
		//If we want some date to set but not todays then use set method
		//c.set(2001,10,5);   //year month(start from 0 to 11) date
		System.out.println("Current Year:"+c.get(Calendar.YEAR));
		System.out.println("Current Month:"+c.get(Calendar.MONTH));
		System.out.println("Current Date:"+c.get(Calendar.DATE));
		System.out.println("Current Hour:"+c.get(Calendar.HOUR));
		System.out.println("Current Minute:"+c.get(Calendar.MINUTE));
		System.out.println("Current Second:"+c.get(Calendar.SECOND));

	}

}
