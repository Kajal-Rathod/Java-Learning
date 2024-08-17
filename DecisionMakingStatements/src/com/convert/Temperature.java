//Write a java program to enter temperature in Celsius and convert it into Fahrenheit//
package com.convert;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		

		 float celcius,fahrenheit ;
		 Scanner sc = new Scanner(System.in);
		 celcius=sc.nextFloat();
           
         fahrenheit =((celcius*9)/5)+32;  
         System.out.println("Temperature in Fahrenheit is: "+ fahrenheit);  
     
	}

}
