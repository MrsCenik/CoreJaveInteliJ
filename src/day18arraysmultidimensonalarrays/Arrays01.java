package day18arraysmultidimensonalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		/*
		 1)Create an integer array together with user
		 2)Type code to print minimum and maximum element
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the lenght of the Array to create intiger Array..");
		
		int len= scanner.nextInt();
		
		int arr[]=new int [len];
		
		int numOfEl = 1;
	
		do {
			System.out.println("Enter " +  numOfEl+". element");
			
			arr[numOfEl-1] = scanner.nextInt();
			
			numOfEl++;
			
		}while(numOfEl<=len);
		
		System.out.println("Array before sort: " + Arrays.toString(arr));
		
		//If you want to keep original array after sorting, use Arrays.copyOf() method.
				int brr[] = Arrays.copyOf(arr, len);
		
		scanner.close();
	
	//To get min and max elements from an array use sort()
	/*
	 Note: Strings are immutable, it means when you use String methods, the value of the String does not change
	  		Arrays are mutable, it means Arrays methods are able to change the arrays as you can see in the sort() below.
	 */
		
		Arrays.sort(arr);
		System.out.println("Array after sort: " + Arrays.toString(arr));//[11, 12, 13]
		System.out.println("Minimum Element: " + arr[0]);
		
		System.out.println("Maximum Element: " + arr[arr.length-1]);
		
		System.out.println("Array before sort: " + Arrays.toString(brr));

		
	}
	
}
