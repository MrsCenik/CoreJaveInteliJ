package day14methodoverloadingconstruction;

		/*
		 * 
		 
	 	Whole numbers are accepted as int for Java as default
	 	Decimal numbers are accepted as double for Java as default


		 
		 */


public class MethodOverLoading01 {
	

	
	public static void main(String[] args) {
	    /*
     	As you see in the examples, I created a method to add 2 values and I created a different method to add 3 values
     	if user wants to add 4 values I need one more method but this is not sensible because it is endless.
     	
     	For that issue, Java created "varargs", varargs accept any number of values...
    */
		
		System.out.println(add(2, 3));
		
		System.out.println(add(2.5, 3));
		
		System.out.println(add(3, 2.5));
	    
	    System.out.println(add(3, 6, 5.2));
	    
	    System.out.println(add());
	    
	    System.out.println(add(3));
	    
	    System.out.println(add(3, 5));
	    
	    System.out.println(add(3, 5, 7));
	    
	    System.out.println(add(3, 5, 7, 9));
	    
	    System.out.println(add(3, 5, 7, 9, 11));
	}
	
	public static int add(int... a) {
		System.out.println("I am using varargs...");
		return 1;
	}
	
	public static double add(int a, int b) {
		System.out.println("int + int");
		return a+b;
	}
	
	public static double add(double a, int b) {
		System.out.println("double + int");
		return a+b;
	}
	
	public static double add(int a, double b) {
		System.out.println("int + double");
		return a+b;
	}
	
	public static double add(double a, double b) {
		System.out.println("double + double");
		return a+b;
	}
	
	public static double add(int a, int b, double c) {
		System.out.println("int + int + double");
		return a+b;
	}

}