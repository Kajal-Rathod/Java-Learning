//Write a java program to enter temperature in Fahrenheit and convert to Celsius//
package com.convert;

import java.util.Scanner;

public class Celcius {

	public static void main(String[] args) {
		float fahrenheit, celcius;  
        Scanner sc = new Scanner(System.in);
        fahrenheit=sc.nextFloat();
        celcius  = ((fahrenheit-32)*5)/9;  
        System.out.println("Temperature in celcius is: "+celcius);  
	}

}
