package day06ternary_switch;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a String. If the String has 2 characters, output will be  
		“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Sitring...");
		
		String s = scanner.nextLine();
		
		//Condition ? code1 : code2
	
		String result = s.length()==2  ? " it is vaild for state abbreviation " : " It is not vaild for sate abbreviation";
		
		System.out.println(result);
		scanner.close();
	}

}
