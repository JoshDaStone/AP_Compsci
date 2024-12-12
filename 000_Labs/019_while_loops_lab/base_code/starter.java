/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Write a random name!");
	String name = sc.nextLine();
	System.out.println("How many times should I say that name?");
	int x = sc.nextInt();
	System.out.println("Great!");

	int count = 0;	
	while(count != x) {
	System.out.println(name);
	count = count + 1;
	}
	


		
	}
}
