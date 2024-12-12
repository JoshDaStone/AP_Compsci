/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please choose one number");
	int numba = sc.nextInt(); 
	System.out.println("Great ! Now Please choose one more");	
	int numba2 = sc.nextInt();
	System.out.println(" "); 
	System.out.println("Great job!");
	if(numba > numba2) {
		System.out.println("Your first number is bigger !");
	}
	if(numba < numba2) {
		System.out.println("Your second number is larger");
	}
	if(numba == numba2) {
		System.out.println("Wow, the numbers are equal in value !");
	}
	
	}
}