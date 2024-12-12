/*
 *	Author:Joshua Stone
 *  Date: 9/28/24
 * 	Collaborator: N/A
*/

import java.util.Scanner;

class starter {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Please choose a number!");
int first = sc.nextInt();
System.out.println("Great! Please choose another!");
int second = sc.nextInt();
System.out.println("Thanks!");

if (first % 2 == 0) {
System.out.println(first + " is even.");
} else {
System.out.println(first + " is odd.");
}

if (second % 2 == 0) {
System.out.println(second + " is even.");
} else {
System.out.println(second + " is odd.");
}

 if (first % 3==0){
 System.out.println(first + " is divisible by 3");
         }
         else{
             System.out.println(first + " is not divisible by 3");
         }

 if (first % 4==0){
             System.out.println(first + " is divisible by 4");
         }
         else{
             System.out.println(first + " is not divisible by 4");
         }
          if (first % 5==0){
             System.out.println(first + " is divisible by 5");
         }
         else{
             System.out.println(first + " is not divisible by 5");
         }
  if (second % 3==0){
             System.out.println(second + " is divisible by 3");
         }
         else{
             System.out.println(second + " is not divisible by 3");
         }
         
   if (second % 4==0){
             System.out.println(second + " is divisible by 4");
         }
         else{
             System.out.println(second + " is not divisible by 4");
         }
          if (second % 5==0){
             System.out.println(second + " is divisible by 5");
         }
         else{
             System.out.println(second + " is not divisible by 5");
         }
         
  if (first % 3 !=0 || first % 4 != 0 || first % 5 !=0){
  	 System.out.println("Good job, but try again!");
             System.out.println("Try choosing another number besides " + first);
              first = sc.nextInt();
         }  
         
  if (second % 3 !=0 || second % 4 != 0 || second % 5 !=0){
  	 System.out.println("Good job, but try again!");
             System.out.println("Try choosing another number besides " + second);
              second = sc.nextInt();
         } 
 
 
        
         

}
}

