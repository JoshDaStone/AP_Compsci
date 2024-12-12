/*
 *	Author:  Joshua Stone
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Now tell me your name, adventurer!");
	String name = sc.nextLine();
	System.out.println("What an excellent name " + name + "! Now, tell me yout title!");
	String title = sc.nextLine();
	System.out.println("And now, " + name + " the " + title + " you must decide! Do you wish to be a Wizard, Warrior, or a Rouge?");
	String x = sc.nextLine();
	if(x.equals("Wizard")){
		System.out.println("You're a Wizard!");
	}
	else if(x.equals("wizard")){
		System.out.println("You're a Wizard!");
	}
	else if(x.equals("Warrior")){
		System.out.println("You're a Warrior!");
	}
	else if(x.equals("wizard")){
		System.out.println("You're a Wizard!");
	}
	else if(x.equals("Rogue")){
		System.out.println("You're a Rogue!");
	}
	else if(x.equals("rogue")){
		System.out.println("You're a rogue!");
	}
	else{
		System.out.println("Sorry, that's not an option!");
	}
	System.out.println("Now, you must decide how to allocate your skill points. You have 20 points to distribute between four skill groups; strength, dexterity, intelligence, and charisma. However, you can't add more than 10 points into one skill.");
	int points = 20;
	System.out.println("How many points do you wish to put into strength?");
	int strengthStat = sc.nextInt();
	
		if(strengthStat < 0) {
		System.out.println("You can't put less than zero points into a state you fool!! Try again!");
		strengthStat = sc.nextInt();
	}
	
	if(strengthStat > 10) {
		System.out.println("You can't put that many points into one stat! Remember, it has to be less than 10.");
		System.out.println("Try again!");
		strengthStat = sc.nextInt();
	}
	
	
	points = points - strengthStat;
	
	System.out.println("You have " + points + " points left! Make sure not to use to many.");
	
	
	
	
	
		System.out.println("How many points do you wish to put into dexterity?");
	int dexterityStat = sc.nextInt();
	
	if(dexterityStat < 0) {
		System.out.println("You can't put less than zero points into a state you fool!! Try again!");
		dexterityStat = sc.nextInt();
	}
	
	if(dexterityStat > 10) {
		System.out.println("You can't put that many points into one stat! Remember, it has to be less than 10.");
		dexterityStat = sc.nextInt();
	}
	
	points = points - dexterityStat;
	
	System.out.println("You have " + points + " points left! Make sure not to use to many.");
	
		System.out.println("How many points do you wish to put into intelligence?");
	int intelligenceStat = sc.nextInt();
	
		if(intelligenceStat < 0) {
		System.out.println("You can't put less than zero points into a state you fool!! Try again!");
		intelligenceStat = sc.nextInt();
	}
	
	if(intelligenceStat > 10) {
System.out.println("You can't put that many points into one stat! Remember, it has to be less than 10.");
	intelligenceStat = sc.nextInt();
	}
	
	if(intelligenceStat > points) {
		System.out.println("You don't have that many points left! Try again, fool!");
		intelligenceStat = sc.nextInt();
	}
	
	points = points - intelligenceStat;
	
	System.out.println("You have " + points + " points left! Make sure not to use to many.");
	
		System.out.println("How many points do you wish to put into charisma?");
	int charismaStat = sc.nextInt();
	
		if(charismaStat < 0) {
		System.out.println("You can't put less than zero points into a state you fool!! Try again!");
		charismaStat = sc.nextInt();
	}
	
	if(charismaStat > 10) {
		System.out.println("You can't put that many points into one stat! Remember, it has to be less than 10.");
		charismaStat = sc.nextInt();
	}
		if(charismaStat > points) {
		System.out.println("You don't have that many points left! Try again, fool!");
		charismaStat = sc.nextInt();
	}
	
	
	System.out.println("Your name is " + name);
	System.out.println("Your title is " + title);
	System.out.println("Strength stat: " + strengthStat);
	System.out.println("Dexterity stat: " + dexterityStat);
		System.out.println("Intelligence stat: " + intelligenceStat);
		System.out.println("Charisma stat: " + charismaStat);
	
	
	
	}
}