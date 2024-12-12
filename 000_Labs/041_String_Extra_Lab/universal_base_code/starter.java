/*
 *	Author:  Joshua Stone		
 *  Date: 12/6/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class Starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine();
        
        
        String reversed = "";
        
        while (true) {
            if (sentence.indexOf(" ") == -1) {
               
                reversed = sentence + " " + reversed;
                break;
            }
            
            int space = sentence.indexOf(" ");
            String word = sentence.substring(0, space); 
            sentence = sentence.substring(space + 1); 
            
           
            reversed = word + " " + reversed;
        }

      
        System.out.print(reversed);
    }
}
