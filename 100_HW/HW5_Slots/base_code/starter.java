/*
 *Author: Joshua Stone
 *  Date: 10/6/24
 * Collaborator(s): Diego Matic
*/

import java.util.Scanner;
import java.util.Random;

	class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	int cash = 100;
	System.out.println("You have received $100!");

	while(cash > 0){

			int s1 = (int)(Math.random() * 10);
			int s2 = (int)(Math.random() * 10); 
			int s3 = (int)(Math.random() * 10);
		
		System.out.print("\nWould you like to play? ");
		String answer = sc.nextLine();
		
	if((answer.equals("Yes")) || (answer.equals("yes")) || (answer.equals("Y")) || (answer.equals("y")) || (answer.equals("YES"))) {
		System.out.println("\nHow much would you like to wager? Enter an integer: ");
		int bet = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println(+ s1 + " || " + s2 + " || " + s3 );
		
	
	
	if(bet <= 0 || bet > cash) {
		System.out.println("Invalid wager. Please enter an amount between 1 and " + cash);
		}


	else if (s1 != s2 && s1 != s3 && s2 != s1 && s2 != s3) {
		cash = cash - bet;
		System.out.println("You earned $0! Balance : " + cash);
		}


	else if (s1 == s2 && s1 != s3) {
		cash = cash - bet;
		cash = cash + (bet * 2);
		System.out.println("You earned double your wager! Balance: " + cash);
		}


	else if (s1 == s3 && s1 != s2) {
		cash = cash - bet;
		cash = cash + (bet * 2);
		System.out.println("You earned double your wager! Balance: " + cash);
		}


	else if (s2 == s3 && s2 != s1) {
		cash = cash - bet;
		cash = cash + (bet * 2);
		System.out.println("You earned double your wager! Balance: " + cash);
		}



	else if (s1 == s2 && s1 == s3) {
		cash = cash - bet;
		cash = cash + (bet * 3);
		System.out.println("You earned triple your wager! Balance: " + cash);
		}
		}





	else if((answer.equals("No")) || (answer.equals ("no")) || (answer.equals("N")) || (answer.equals("n")) || (answer.equals("NO"))) {
		System.out.println("You were just about to win big! See you next time!");
		break;
		}
		else {
		System.out.println("Invalid input. Try again.");
		}
		}
		if(cash == 0) {
		System.out.println("Uh oh! You are broke! Final Balance: " + cash + "GAME OVER");
		}
		}
		}
