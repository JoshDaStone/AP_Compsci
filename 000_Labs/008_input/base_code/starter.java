/*
 *	Author:  Joshua Stone
 *  Date: 9/11/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
        System.out.println("What's your first name, friend?");
        String name = sc.nextLine();
        System.out.println("Cool name, " + name + "!" + " How old are you?");
        String age = sc.nextLine();
		System.out.println("What month were you born?");
		String month = sc.nextLine();
		System.out.println("What about the day?");
		Integer birthday = sc.nextInt();
		System.out.println("And the year?");
		Integer birthyear = sc.nextInt();
		System.out.println("And finally, how much is a buck fifty?");
		Double buckfifty = sc.nextDouble();
		System.out.println("Yep, you're correct " + name + "!! Have a great day!!");
		
		
	}
}
