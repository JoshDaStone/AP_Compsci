import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String [] var0) {
		BaseClass test = new BaseClass();

      myCharacter var1 = new myCharacter();
      var1.myToString();
      System.out.println("------------------------------------------------");
      Scanner var2 = new Scanner(System.in);
      System.out.println("What class would you like to be?");
      String var3 = var2.nextLine();
      myCharacter var4 = new myCharacter(var3);
      var4.myToString();
   }


		
	}
}
