/*
 *	Author:  Joshua Stone
 *  Date: 10/3/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = (int)(Math.random()*1000);
		System.out.println("Guess a random number between 1 and 1000! You have infinite tries.");
		System.out.println("Now start guessing!");
		int guess = sc.nextInt();
		while (guess != x) {
		System.out.println("Nope, try again.");
		guess = sc.nextInt();
		}
		if (guess == x) {
		System.out.println("You guessed it!");
		}

		
	}
}
