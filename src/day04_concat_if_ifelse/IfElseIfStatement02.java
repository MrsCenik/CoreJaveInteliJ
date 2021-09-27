package day04_concat_if_ifelse;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		/*
		 Get the day name from user, then tell to the user if it is week day or weekend day 
		 */


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day name...");
		String day = scan.next();
		
		
		if(day.equalsIgnoreCase("sunday") || day.equalsIgnoreCase("saturday")) {
			System.out.println(day +  " is weekend day");
			
		}else if(day.equalsIgnoreCase("monday")||day.equalsIgnoreCase("thuesday")||
				
				day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday") || day.equalsIgnoreCase("friday")) {
			System.out.println(day + " is weekday");
			
		}else {
			System.out.println("I told you to enter day name, what are you doing?...");
			
		}
		scan.close();
	}
	

}
