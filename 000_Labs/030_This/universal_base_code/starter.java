/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		String name = randName();
		int age = (int)(Math.random()*301);
		
		PooleDwarf[] dwarf = new PooleDwarf[7];
		for (int dwarfNum = 0; dwarfNum < 7; dwarfNum++) {
			dwarf[dwarfNum] = new PooleDwarf(name, age);
		}
		
		String dwarfOneName = dwarf[0].getName();
		int dupe = 0;
		
		for (int dwarfNum = 1; dwarfNum < 7; dwarfNum++) {
			if (dwarf[dwarfNum].isSameName(dwarfOneName)) {
				dupe ++;
			}
		}
		
		if (dupe > 0) {
			System.out.println("The name " + dwarfOneName + " was duplicated " + dupe + " times.");
		}
		
	}
}
