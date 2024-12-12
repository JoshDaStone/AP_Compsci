package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static void magicSquare(int a) {
		int i = 1;
		while (a>0) {
			if(Math.pow(1+8*Math.pow(i,2), 0.5) % 1 == 0){
				System.out.println((int) (Math.pow(i,2)));
				a--;
			}
		i++;	
		}
	}
}
