//Write a java program to check whether the triangle is equilateral, isosceles or scalene triangle//
package com.simple;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		
		int p;
		int q;
		int r;
		System.out.println("Enter three side of triangle ");
		Scanner sc = new Scanner(System.in);
		p=sc.nextInt();
		q=sc.nextInt();
		r=sc.nextInt();
		
		if(p==q && q==r)
		{
			System.out.println("Equilateral tTriangle");
		}
		else if(p==q || q==r || r==p)
		{
			System.out.println("Isoscale triangle");
		}
		else 
		{
			System.out.println("Scalene triangle");
			
		}
		
	}

}
