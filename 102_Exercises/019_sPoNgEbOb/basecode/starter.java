/*
	Author: Joshua Stone
	Date: 12/5/24
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write a phrase or a word: ");
		String x = sc.nextLine();
		System.out.println("Here's your word/phrase in sPoNgE cAsE: ");
	
		
			
		System.out.print(x.subtring(x.length()));
			}
	public static String spongecase(String word){
	for(int i = 0; i < x.length(); i++){
			if(i%2==0){
				x=x.toUpperCase();
			System.out.print(x.substring(i,i+1));
			}
			else{
				x=x.toLowerCase();
				System.out.print(x.substring(i,i+1));
			}
			
	}
}
}
