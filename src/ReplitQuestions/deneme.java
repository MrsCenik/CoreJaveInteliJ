package ReplitQuestions;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a String");
		String input=scanner.nextLine();
		int[] counterArray=new int[256];
		
		for(int i=0; i<input.length(); i++) {
			counterArray[input.charAt(i)]++;		
		}
		for(int i=0; i<counterArray.length; i++) {
			if(counterArray[i]>1) {
				System.out.print((char)i+":"+counterArray[i]+ "  ");
			}
			
		}
		
		scanner.close();
	}

}
