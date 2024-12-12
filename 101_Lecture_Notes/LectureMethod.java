/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
     printAnimal();
     printAnimal(); 
     printAnimal(); 
     printAnimal();
     greeting("Josh");
     double num = raise(10000, 15);
     System.out.println(num);
	}
	
	
	
	public static double raise(double salary, int percent) {
	    double amount = salary + (salary * (percent/100.0));
	    return amount; 
	    
	}
	
	
	
	public static void greeting(String name) {
	 System.out.println("Hello " + name + "!");
	}
	

 public static void printAnimal(){
    System.out.println("\\_____)\\_____");
    System.out.println("/--v____ __`< ");
    System.out.println("        )/     ");
  
     
 }   
    
}