package day06ternary_switch;

import java.util.Scanner;

public class Ternary05 {

	public static void main(String[] args) {
		/*
		 Ask user a enter a number. If the number is less than 10 and greater 
			than or equal to 0, calculate its cube. Otherwise, calculate its square.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		double num = scan.nextDouble();
		
		//1.wat- it is long way to do that task
//		String result = num<10 && num>0  ? "Cube: " + num*num*num : "Square: " + num*num;
		
		
		//2. way- it is easier- Math.pow method.
		String result = num<10 && num>0  ? "Cube: " + Math.pow(num, 3) : "Square: " + Math.pow(num, 2);
		System.out.println(result);
		scan.close();
	}
	

}
