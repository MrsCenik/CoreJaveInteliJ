package ReplitQuestions;
		/*
		 Write a java program which accept a sentence as parameter, 
		 than reverses sentence by using StringBuilder and 
		 checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.
		
		
		Input :
		
		I love Java.
		
		Output: 
		
		Reversed sentence : avaJ evol I. 
		It is not a palindrome"
		 */

import java.util.Scanner;

public class PalindromWithStringBuilder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String input = scanner.nextLine();
		String realInput = input;
		boolean dotExist = false;
		if(input.charAt(input.length()-1) == '.') {
			realInput = input.substring(0, input.length()-1);
			dotExist = true;
		}
		StringBuilder sb = new StringBuilder(realInput);
		StringBuilder sbRev = new StringBuilder(realInput);
		
		sbRev.reverse();
		boolean isPalindrome = true;
		
		for(int i1=0, i2=0; i1<sb.length(); i1++,i2++) {
			if(sb.charAt(i1)==' ') {
				i1++;
			}
			if(sbRev.charAt(i2)==' ') {
				i2++;
			}
			if(Character.toLowerCase(sb.charAt(i1)) != Character.toLowerCase(sbRev.charAt(i2))) {
				if(Character.toLowerCase(sb.charAt(i1)) == 'ç') {
					sb.replace(i1, i1+1, "c");
				}else if(Character.toLowerCase(sbRev.charAt(i2)) == 'ç') {
					sbRev.replace(i2, i2+1, "c");
				} 
				else {
					isPalindrome = false;
				}
			}
		}
		if(dotExist) 
			sbRev.append('.');
		System.out.println(sbRev);
		if(isPalindrome) {
			System.out.println("It is Palindrome.");
		}else {		
			System.out.println("It is not a palindrome"+"\"");
		}
		scanner.close();
	}
}
