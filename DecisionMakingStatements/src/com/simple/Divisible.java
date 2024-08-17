//Write a java program to check whether a number is divisible by 5 and 11 or not//
package com.simple;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter any number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		 
		if(n%5==0 && n%11==0)
		{
			System.out.println("Divisible by 5 and 11");
		}
		else
		{
			System.out.println("Not divisible");
		}

	}

}
