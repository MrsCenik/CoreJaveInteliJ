package day25encapsulationandinterviewquestions;

import java.util.Scanner;

public class InterviewQuestions03 {
	/*
	 Get a string from user, and create a method to print the string without space. Call the method from main method
	 */
	
	public static String noSpace(String str) {
		str= str.replace(" ", "");
		/*
		 2.way
		 System.out.pritnln(str.replaceAll("\\s", ""));
		 */
			
		return str;
	}

	public static void main(String[] args) {
		//String string="ab3 sfr1 de ddr ff";

				
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String");
		String str=scanner.nextLine();
		System.out.println(noSpace(str));
		
		scanner.close();
	}

}
