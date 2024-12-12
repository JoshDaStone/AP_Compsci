/*
 *	Author:  Joshua Stone
 *  Date: 9/19/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Please choose one number");
	int a = sc.nextInt(); 
	System.out.println("Great ! Now Please choose another");	
	int b = sc.nextInt();
	System.out.println("And just one more!");
	int c = sc.nextInt();


	System.out.println(" "); 
	System.out.println("Great job!");
	if(a > b && a > c) {
		System.out.println("Your first number is the largest !");
	}
	if(b > a && b > c) {
		System.out.println("Your second number is the largest");
	}
	if(c > a && c > b) {
		System.out.println("Your third number is the largest !");
	}
	System.out.println("  ");
		if(a < b && a < c) {
		System.out.println("Your first number is the smallest !");
	}
	if(b < a && b < c) {
		System.out.println("Your second number is the smallest !");
	}
	if(c < a && c < b) {
		System.out.println("Your third number is the smallest !");
	}
	
	
	}	
	
	
}