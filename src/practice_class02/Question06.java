package practice_class02;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		//1.Ask user to enter a word. If the word has odd number of characters
		//length() of characters
		//and has 3 or more characters, print the character in the middle of the word.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a word");
		String word= scanner.nextLine();	
		
		if(word.length()>3 && word.length()%2==1) {
			
			System.out.println(word.substring(word.length()/2,word.length()/2+1));
		}else {
			
			System.out.println("It has even numbers of characters");
		}
		
		scanner.close();
	}

}
