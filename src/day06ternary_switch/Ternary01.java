package day06ternary_switch;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eneter an integer..");	
		int x = scanner.nextInt(); 
		
				// Condition	?	Code executed true condition : Code executed false condition
		
		//String result = x<5 	?                 "True"         :          "False";
		
//		String result = x%2==0 ? (x + " is even..") : (x+ " is odd");
//		System.out.println(result);
		
		
		//If ternary returns different data types, do not create a container put it into system.outprintlm() directly
//		System.out.println(x++ >5 ? "True" : x); 
		
		String result = x++ > 5 ? "true" : x + "";	
				System.out.println(result);
				scanner.close();
	}

}
