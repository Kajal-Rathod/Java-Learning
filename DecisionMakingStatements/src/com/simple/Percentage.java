/*Write a java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F*/
package com.simple;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		int phy,chem,bio,math,com;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Five Subject Marks :");
		phy = input.nextInt();
		chem = input.nextInt();
		bio = input.nextInt();
		math = input.nextInt();
		com = input.nextInt();
		int total =phy+chem+bio+math+com ;
		float per = total/5;
		System.out.println("Total :"+total);
		System.out.println("Percentage :"+per);	
		if(per>=90)
			System.out.println("Grade A");
		else if(per>=80)
			System.out.println("Grade B");
		else if(per>=70)
			System.out.println("Grade C");
		else if(per>=60)
			System.out.println("Grade D");
		else if(per>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}
}

	


