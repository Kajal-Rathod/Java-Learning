//Write a C program to input any character and check whether it is alphabet, digit or special character//
package com.simple;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter any character: ");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println("Alphabet");
			
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Digit");
			
		}
		else
		{
			System.out.println("Special character");
		}
	}

}
