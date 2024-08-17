package com.nested;

public class GreatestNumber {

	public static void main(String[] args) {
        int a=50,b=70,c=10;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is max ");
			}
			else
			{
				System.out.println("c is max ");
			}
			
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is max ");
			}
			else
			{
				System.out.println("c is max ");
			}
		}

	}

}
