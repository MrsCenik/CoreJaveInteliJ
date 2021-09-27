package day07stringmanipulations;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		/*
			Ask user to enter the name of the month
	 	For January, February, March output will be First Quarter
	 	For April, May, June output will be Second Quarter
	 	For July, August, September output will be Third Quarter
	 	For October, November, December output will be Fourth Quarter
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a month...");
		
		String month = scanner.next().toLowerCase();
		
		switch(month) {
			case "january" :
			case "february" :
			case "march":
				System.out.println("First Quarter");
				break;
			case "april" :
			case "may":
			case "june":
				System.out.println("second Quarter");
				break;
			case"july":
			case "august":
			case "september":
				System.out.println("Third Quarter");
			case "october":
			case "november":
			case "december":
				System.out.println("Forth Quarter");
				break;
				
				default: 
					System.out.println("Invalid input");
		
		
		}
		scanner.close();
		
	}

}
