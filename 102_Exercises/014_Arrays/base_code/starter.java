/*
 *	Author: Joshua Stone
 *  Date: 11/5/24
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [1000];
		int i = 0;
		int value = 3;
		while (i<1000) {
			arr [i]=value;
			value = value+3;
			i++;
			System.out.println(value);
		}
	
		
	
		int [] arr2 = new int [1000];
		int i2 = 0;
		int value2 = 1000;
	
		while (i2 < 1000) {
			arr2 [i2]=value2;
			i2++;
			value2 = value2 - 1;
			System.out.println(value2);
		}

		}
		 
	}

