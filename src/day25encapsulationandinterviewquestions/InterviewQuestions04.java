package day25encapsulationandinterviewquestions;

import java.util.Scanner;

//Create a program checks if a string is palindrome or not

public class InterviewQuestions04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		
		String input = scanner.nextLine().replace(" ", "").toLowerCase();
		
		isPalindrome(input);
		
		scanner.close();
	}
	
	
	public static void isPalindrome(String string) {
		
		String reversedStr = "";
		
		for(int i = string.length()-1; i>=0; i--) {
			
			reversedStr+= string.charAt(i); 
			
			}
		if(string.equals(reversedStr)) {
			
			
			System.out.println(string+ " is a palindrome");	
			
			
		}else{
			
			System.out.println(string+ " is not a palindrome");
		}
	}		
}