/*
 *	Author: Joshua Stone
 *  Date: 9/16/24
 *	Collaborator(s): Chanseo Lee 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 numbers to create a range for your random number");
	System.out.print("please enter an integer: ");
	int first= sc.nextInt();
	System.out.print("please enter another integer (bigger than the first): ");
	int second= sc.nextInt();
	System.out.println("Your range is " + first + " to " + second);
	System.out.println("Here are five numbers generated in that range.");
	System.out.println((int)((Math.random()*second-first)+first) + ", " + (int)((Math.random()*second-first)+first) + ", " + (int)((Math.random()*second-first)+first) + ", " + (int)((Math.random()*second-first)+first) + ", " + (int)((Math.random()*second-first)+first));
	}
}
