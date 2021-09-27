package ReplitQuestions;

import java.util.Scanner;

public class ForWhile01 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scanner.nextLine();
		name= name.toUpperCase();
		
		System.out.println("Enter a character");
		char ch=scanner.next().charAt(0);
		ch=Character.toUpperCase(ch);
		int counter=0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)==ch) {
				counter++;	
			}
		}
		System.out.println(counter);
			
		scanner.close();

	}
			
}


