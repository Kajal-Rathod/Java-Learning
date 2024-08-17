//Write a java program to find power of any number x ^ y.
package com.convert;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) 
	{
		double base,exp,power;
		Scanner sc=new Scanner(System.in);
		base=sc.nextDouble();
		exp=sc.nextDouble();
		 
		power=Math.pow(base,exp);
		System.out.println(power);

	}

}
