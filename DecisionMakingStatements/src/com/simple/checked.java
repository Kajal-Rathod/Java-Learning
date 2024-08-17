//Write a java program to input any alphabet and check whether it is vowel or consonant//
package com.simple;

import java.util.Scanner;

public class checked {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter any character: ");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("consonant");
		}
	}

}
