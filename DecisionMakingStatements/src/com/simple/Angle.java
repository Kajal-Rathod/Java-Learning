//Write a java program to input angles of a triangle and check whether triangle is valid or not
package com.simple;

import java.util.Scanner;

public class Angle {

	public static void main(String[] args) {
		
		int angle1,angle2,angle3;
		System.out.println("Enter Three sides of triangle");
		Scanner sc = new Scanner(System.in);
		angle1=sc.nextInt();
		angle2=sc.nextInt();
		angle3=sc.nextInt();
		
		int sum=angle1+angle2+angle3;
		if(sum==180)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Not Valid");
		}
		
	}

}
