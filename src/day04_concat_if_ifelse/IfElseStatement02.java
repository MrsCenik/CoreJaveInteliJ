package day04_concat_if_ifelse;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		/*
		 Get the day name from user, then tell to the user if it is week day or weekend day 
		 */


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day name in lowercases");
		
		String day = scan.next();
		/* 
		1) == -> check the value and addresses if both are same it returns true otherwise, it returns false
		2) "equals()"  ==> Checks just the value by NOT Ignoring Cases.
		3) "equalsIgnoreCase()" ==> Checks just the values by ignoring cases.
		
		
		 -Here we did not use == sign because it always check the value and reference. in that case we will get wrong answer from Java.
		 We should use equals() method which checks just value. So that we will get correct answer.
		 */		
		if(day.equals("saturday") || day.equals("sunday")) {
	
			System.out.println(day + " is weekend day");
			
		}else {
			
			System.out.println(day + " is week day");
			
		}
		scan.close();
	}
	
}
