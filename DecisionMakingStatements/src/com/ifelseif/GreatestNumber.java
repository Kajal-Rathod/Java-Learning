package com.ifelseif;

public class GreatestNumber {

	public static void main(String[] args) {
		int a = 20, b = 30, c = 40;

		if (a >= b && a >= c) {
			System.out.println("a is max");
		}

		else if (b >= a && b >= c) {
			System.out.println("b is max ");
		}

		else {

			System.out.println("c is max ");
		}

	}

}
