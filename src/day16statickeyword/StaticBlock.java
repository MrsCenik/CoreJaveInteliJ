package day16statickeyword;

public class StaticBlock {
	
		/*
		 Static variable: Class variable, it is attached to the class and you should use class name to access.  
		 Static method: They belong to the class, you should use class name to access.
		 
		 static block: 1) It is used to initialize "class(static) variable"
		 			   2) Static block is executed before everything (constructors, main method, methods) inside the class
		 			   3) If you have multiple static blocks, first one runs first. 
		 			   note: static block is executed first.
		 */
	
	

	// I did not use "static block" to initialize
	static int age = 12;
	
	// I used "static block" to initialize
	static int year;
	static {
		year = 2021;
	}
	
	static {
		System.out.println("Static Block 1");
	}
	static {
		System.out.println("Static Block 2");
	
	}
	static {
		System.out.println("Static Block 3");
	}
	public static void main(String[] args) {
		
		//StaticBlock obj1 = new StaticBlock();
		method1();
		System.out.println("Main");
		method2();
		
	}
	public static void method1() {
		System.out.println("Method 1");
	}
	public static void method2() {
		System.out.println("Method 2");
	}
	StaticBlock(){
		System.out.println("Constructor");
	}
}
