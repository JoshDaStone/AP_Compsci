import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the amount of magic squares you would like to see: ");
		int x = sc.nextInt();
		CVMath.magicSquare(x);
	}
}
