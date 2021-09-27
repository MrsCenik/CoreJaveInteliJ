package day06ternary_switch;

import java.util.Scanner;

public class Qestion01 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else if() statement.
			Write a program to check if a year is leap year or not.
			if the year is divisible by 100 then it must be divisible by 400.
			If a year is not divisible by 100 then it must be divisible by 4.
		 */
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a year...");
		int year = scanner.nextInt();
		
		if(year<0) { 
			System.out.println(year + "Year must be possitive");
			
		}
		
		if (year%100 == 0) {
			
			if (year%400==0) {
				System.out.println(year + "is leap year");
			
			}else {
				System.out.println(year + " is not leap year");
				
			}
		}else {
			if (year%4==0) {
				System.out.println(year + "is leap year");
				
			}else {
				System.out.println(year + " is not leap[ year");
			}
			
		}
		
	scanner.close();	

	}

}


