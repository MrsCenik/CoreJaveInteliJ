package ReplitQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOccuringChar {
	/*
	 Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

		input :
		Learning java is easy 
		output: 
		maximum occurring character is : a
	 */
	public static void main(String[] args) {  
		 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=scanner.nextLine();
		//Find Frequency map
		int[] freqArr = new int[256];
		for(int i=0; i<input.length(); i++) {
			freqArr[input.charAt(i)]++;	
		}
		System.out.println(input.charAt(0));
		System.out.println(Arrays.toString(freqArr));
		//Find max
		int max=0, index=0;
		for(int i=0; i<freqArr.length; i++) {
			if(max<freqArr[i]) {
				max=freqArr[i];
				index=i;
			}		
		}
	
		System.out.print("maximum occurring character is : " +(char)index);
		scanner.close();	
	}  	
}