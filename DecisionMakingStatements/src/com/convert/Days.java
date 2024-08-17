//write java program to convert days into years, weeks and days//
package com.convert;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) 
	{
		int numberOfDays,daysInWeek, year,week,days;
		System.out.println("Enter number of days ");
		Scanner sc = new Scanner(System.in);
		numberOfDays=sc.nextInt();
		daysInWeek=sc.nextInt();
		year = numberOfDays / 365; 
	    week = (numberOfDays % 365) / 
	        		daysInWeek; 
	    days = (numberOfDays % 365) %  
	                daysInWeek; 
	          
	        System.out.println("years = " + year); 
	        System.out.println("weeks = " + week); 
	        System.out.println("days = " + days); 
		
		

	}

}
