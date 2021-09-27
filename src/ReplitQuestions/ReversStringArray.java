package ReplitQuestions;
import java.util.Scanner;

public class ReversStringArray {
	/*
	 Get a sentence from the user. Accept the sentence received from the user as a parameter, 
	 Invert sentence using Array and write a Method that returns the result as a String to the main method.

		Note: Upper and lower case letters, spaces and special characters will not be changed.
		
		Input : 
		
		It is very nice to write code.
		
		Output : 
		
		.edoc etirw ot ecin yrev si tI
	 */

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter a sentence");
			String str = scanner.nextLine();
			String []arr=str.split(" ");
			String [] reversedArr=new String[arr.length];
			for (int i =arr.length-1; i>=0; i--) {
				String str1="";
				for(int j=arr[i].length()-1; j>=0; j--) {
					
					str1+= arr[i].charAt(j);
					reversedArr[i]=str1;
				
				}		
				System.out.print(reversedArr[i]+ " ");
			
		scanner.close();			
	}
}
}
