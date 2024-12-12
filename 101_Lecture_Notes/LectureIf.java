/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
      	Scanner sc = new Scanner(System.in);
        System.out.println("You're a student getting ready for school and need to make a few important choices. First up, choose how to prepare for the day!");
        System.out.println("1. Pack your backpack");
        System.out.println("2. Choose an outfit");
        System.out.println("3. Eat a big breakfast");
        
        int answer1 = sc.nextInt();
       
        if(answer1 == 1) {
        System.out.println("You put your books, binders, and pencils into your bag, then put it on!");
        System.out.println("You are presented with 3 more options !");
        System.out.println("1. Double check to make sure you have all the supplies you need for the school day");
        System.out.println("2. Toss in a quick lunch");
        System.out.println("3. Do both");
        
        
}
        if(answer1 == 2) {
         System.out.println("You put on your best fit!");
           System.out.println("You are presented with 3 more options !");
        System.out.println("1. Add accesories like a chain and some rings");
        System.out.println("2. Start to layer your fit");
        System.out.println("3. Do both");
    }
        if(answer1 == 3) {
        System.out.println("You get omega fat and gorge on a feast of breakfast pastries");
          System.out.println("You are presented with 3 more options !");
        System.out.println("1. Suck it up and keep eating");
        System.out.println("2. Stop eating");
        System.out.println("3. Decide to take a nap ");

        }
        else{
            System.out.println("That's not a correct answer !!");
        }
        
      
      
      
      
      
      
      
      
      
      
      
      
      
      
        }
	}
