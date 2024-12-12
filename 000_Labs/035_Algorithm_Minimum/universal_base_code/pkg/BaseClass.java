/*
 *	Author:  
 *  Date: 
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;




class BaseClass {
	public static void main(String args[]) {
		int min = 100;
		int max = 1;
		int total = 0;
		
		int [] randInt = new int[(int) (Math.random() *150) + 51];
		
		for (int i = 0; i < randInt.length; i++) {
			randInt[i] = (int) (Math.random() *100) + 1;
		}
		
		for (int i = 0; i < randInt.length; i++) {
			if (randInt[i] < min) {
				min = randInt[i];
			}
		}
		
		System.out.println("----------------------------------");
		System.out.println("The minimum value in this algorithm is " + min);
		
		for (int i = 0; i < randInt.length; i++) {
			if (randInt[i] > max) {
				max = randInt[i];
			}
		}
		
		System.out.println("The maximum value in this algorithm is " + max);
		
		for (int i = 0; i < randInt.length; i++) {
			total += randInt[i];
		}
		
		int avg = total/randInt.length;
		
		System.out.println("The average of these values is " + avg);
		
		System.out.println("There are " + randInt.length + " elements in the randInt algorithm");
		
		for (int i = 0; i < randInt.length; i++) {
			System.out.println("[" + i + "] = " + randInt[i]);
		}
		
		System.out.println("----------------------------------");
		
		
	}
}
