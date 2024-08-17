//Write a java program to count total number of notes in given amount//
package com.simple;

import java.util.Scanner;

public class Amount {

	public static void main(String[] args) {
		int amount;
		System.out.println("Enter Amount");
		Scanner sc = new Scanner(System.in);
		amount = sc.nextInt();
		int note50, note100, note500, note1000;
		note50 = note100 = note500 = note1000 = 0;

		if (amount >= 1000) {
			note1000 = amount / 1000;
			amount -= note1000 * 1000;
		}
		if (amount >= 500) {
			note500 = amount / 500;
			amount -= note500 * 500;
		}
		if (amount >= 100) {
			note100 = amount / 100;
			amount -= note100 * 100;
		}
		if (amount >= 50) {
			note1000 = amount / 50;
			amount -= note50 * 50;
		}
		System.out.println(note1000);
		System.out.println(note500);
		System.out.println(note100);
		System.out.println(note50);

	}

}
