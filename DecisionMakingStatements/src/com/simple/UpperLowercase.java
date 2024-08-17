//Write a java program to check whether a character is Uppercase or Lowercase alphabet//
package com.simple;

import java.util.Scanner;

public class UpperLowercase {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter any character: ");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<= 'z')
		{
			System.out.println("Lowercase");
		}
		else
		{
			System.out.println("Uppercase");
		}

	}

}
