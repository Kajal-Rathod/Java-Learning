package com.ifelse;

public class Big {

	public static void main(String[] args) {
		int a=4,b=8;
		if(a!=b)
			System.out.println("a is not equal to b");
		else
			System.out.println("a is  equal to b");

		// Less Than Condition
		if(a<b)
			System.out.println("a is max");
		else
			System.out.println("b is max");
		
		// Greater Than Condition
		if(a>b)
			System.out.println("a is max");
		else
			System.out.println("b is max");
		
		// Equal to Condition
		if(a==b)
			System.out.println("a is equal to b");
		else
			System.out.println("a is not equal to b");
		
		// Greater Than Equal to Condition
		if(a>=b)
			System.out.println("a is max");
		else
			System.out.println("b is max");
		
		// Less Than Equal to
		if(a<=b)
		{
			System.out.println("a is less or equal to b");
		}
		else
			System.out.println("a is greater than b");
	}

}
