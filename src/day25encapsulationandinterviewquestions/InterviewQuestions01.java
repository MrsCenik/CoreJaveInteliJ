package day25encapsulationandinterviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestions01 {

	public static void main(String[] args) {
		/*
		 Take an array from the user and get the sum of all elements
		 */

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int lengthArray=scanner.nextInt();
		int[] arr=new int[lengthArray];
		System.out.println("Enter " +lengthArray+ " array elements");
		for (int i=0; i<lengthArray; i++){
			arr[i] = scanner.nextInt();	
		}
		System.out.println(Arrays.toString(arr));
		
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println(sum);
		//the difference between the biggest and smallest number
		Arrays.sort(arr);
		int diffBiggestAndSmallest=arr[lengthArray-1]-arr[0];
		System.out.println(diffBiggestAndSmallest);
		
		scanner.close();
		
		
	}

}
