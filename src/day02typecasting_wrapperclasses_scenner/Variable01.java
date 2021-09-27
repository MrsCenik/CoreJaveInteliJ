package day02typecasting_wrapperclasses_scenner;

public class Variable01 {

	public static void main(String[] args) {
		
		//If you convert a primitive data type to another, it is called "Type Casting"
		
		//byte < short < int < long < float > double
		
		//Auto Widening
		
		byte age = 65;
		short newAge = age; 
		
		System.out.println(age);
		System.out.println(newAge);
		
		
		//Explicit Narrowing
		
//		long profit = 234567;
//		int newProfit = (int)profit; 
				
		
		//Type code to convert float to short	
		
		float code = 1.234f;
		short newCode = (short)code;
		
		System.out.println(code);
		System.out.println(newCode);
		
		/* 
		 		If the number is not in the range of the second date types
				Java uses "modulus operation" to put value into the range
		
		*/
		
		short price = 258;
		byte newPrice = (byte)price;
		System.out.println(price);
		System.out.println(newPrice);
		
		//How to do mathematical operation with different data types
		
		int a = 5;
		double b = 4;
		float e = 4.0f;
		int c = 2;
		int d = 3;
		
	//Note: If date types are different Java uses
		//the larger data type for the result
		System.out.println(a+b); //9.0
		
		//If you use same data types, result date type and value will be in the same
		//used data type ==> 2.5 --> Decimal part is removed and the result is 2
		
		System.out.println(a/c); //2
		System.out.println(a/d); //1
		
		//In double decimal you have 16 digits at most
		System.out.println(b/d); //1.3333333333
		//In float decimal you have 7 digits at most
		System.out.println(e/d); //1.33333334
	}

}
