//Write a java program to calculate profit or loss.//
package com.simple;
import java.util.Scanner;
public class ProfitLoss {

	public static void main(String[] args) {
		int sellingPrice,costPrice,profit,loss;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Selling price and Cost Price :");
	    sellingPrice = sc.nextInt();
		costPrice = sc.nextInt();
		
		profit=sellingPrice - costPrice;
		loss = costPrice-sellingPrice;
		if(sellingPrice>costPrice)
		{
			System.out.println("Profit : "+profit);
		}
		else if(sellingPrice<costPrice)
		{
			
			System.out.println("Loss : "+loss);	
		}
		else
		{
			System.out.println("No Profit No Loss");
		}
	}

}
