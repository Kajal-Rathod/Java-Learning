//Write a java program to check whether a number is negative, positive or zero//
package com.simple;
import java.util.Scanner;
public class check {

	public static void main(String[] args) {
		 
		int n;
		System.out.println("Enter any number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		if(n>0)
		{
		     System.out.println("positive");
		     
		}
		else if(n<0)
		{
			System.out.println("Negative");
			
		}
		else
		{
		    System.out.println("Zero");
		}
		
		
	}
}
