package day01variables;

public class Variable01 {

	/*
	1) Projects ==> Package ==> Class ==> Variables + Methods
	2) How to create "variables" 
		a) Type data type
		b)Type a name for the variable
		c)"="
		d) Value
	4) Data types;
		a) "int" ==>integer: Whole numbers like 2, 132, -54, 0
		b) "double" ==> decimals: Range is larger
		c) "float"  ==> decimals: Range is smaller than double's range	
	 */

	/* 
	 Note: If you create a variable inside a method, you should "initialize" it.
	 "int prize1;" means you created a variable
	 "= 100" means you initialized the variable
	 Note: If you want to see "default values", create the variables outside the methods. 
	 Note: If a method is static, everything you used in the method must be static. 
	 Note: If you do not assign any value, Java uses "default values" for them. 
	 		a) int ==> 0
	 		b) double ==>0.0
	 		c) float ==> 
	 			Note: When you assign a value for a float variable use "f" or "F" at the end
	 		d) char ==> nothing or '\u0000'
	 		e) byte ==> 0
	 			Note: Bytes are whole numbers from -128 to 127
	 		f) short ==> 0 
	 			Note: Shorts are whole numbers -32768 to 32767 
	 		g) long ==> 0
	 			Note: longs are whole number from -9,223,3782,036,854,755,808 to 9,223,3782,036,854,755,807
	 		h) boolean ==> False
	 			Note: boolean data type is used just for "true" or "false" values
	 	Order the number date types in ascending order
	 	byte < short < int < long < float < double
	 */
	static int price2;
	static double minSalary;
	static float hourlySalary;
	static char single; 
	static boolean isOld; 

	public static void main(String[] args) {
		// If you create a variable inside a static method, Java makes it static automatically
		
		int price1 = 100; 
		double salary = 2.34;
		float weeklySalary = 1.234f; 
		char initial = 'S';
		byte age = 35;
		short populationOfAVillage = 25000;
		boolean isNew = true; 
		boolean isRetired = false;
		String name = "Hatice Cenik"; 
		

		 
		
		System.out.println(price1);
		System.out.println(salary);
		System.out.println(price1 + salary);
		
		System.out.println(price1 * salary);
		System.out.println(price2);
		System.out.println(minSalary);	
		System.out.println(hourlySalary);
		
		System.out.println(weeklySalary);
		System.out.println(initial);
		System.out.println(single);	
		System.out.println(age);
		System.out.println(populationOfAVillage);
		
		System.out.println(isOld);
		System.out.println(isNew);
		System.out.println(isRetired);
		System.out.println(name);
	}
}
	

