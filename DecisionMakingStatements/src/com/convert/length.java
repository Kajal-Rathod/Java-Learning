//Write a java program to enter length in centimeter and convert it into meter and kilometer//
package com.convert;
import java.util.Scanner;
public class length {

	public static void main(String[] args) {
		
         double centimeter,meter,kilometer;
         Scanner sc = new Scanner(System.in);
         centimeter=sc.nextDouble();
         
         meter = centimeter / 100.0;
         kilometer = centimeter / 100000.0;
         
         System.out.println("length in meter: " +meter);
         System.out.println("length in kilometer: " +kilometer);
         
         
         
         
	}

}
