//Write a java program to check whether a character is alphabet or not//
package com.simple;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		
		char ch;
		System.out.println("Enter any character: ");
		Scanner sc = new Scanner(System.in);
		ch=sc.next().charAt(0);
			
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			{
				System.out.println("It is alphabet");
			}
			else
			{
				System.out.println("Not alphabet");
			}
		
	}

}
